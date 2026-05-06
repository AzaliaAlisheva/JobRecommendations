#!/bin/bash

HDFS_PATH="/user/team17/project"

# Clear HDFS warehouse folder if exists
hdfs dfs -rm -r -f $HDFS_PATH

FORMATS=("avro" "parquet")
COMPRESSIONS=("none" "snappy" "gzip" "bzip2")
TABLENAME="users"
LOCAL_OUTPUT_DIR_BASE="./output"

JDBC_URL="jdbc:postgresql://hadoop-04.uni.innopolis.ru/team17_projectdb"
USERNAME="team17"
PASSWORD=$(head -n 1 secrets/.psql.pass)

echo "format,compression,import_time_sec,read_time_sec,size_bytes" > benchmark_results.csv

measure_import() {
    local format=$1
    local compression=$2
    
    local warehouse="/test/warehouse_${format}_${compression}"
    local full_path="${HDFS_PATH}/${warehouse}"

    
    local sqoop_cmd="sqoop import \
            --connect $JDBC_URL \
            --username $USERNAME \
            --password $PASSWORD \
            --warehouse-dir $full_path \
            --table $TABLENAME \
            --m 1"
    
    # Add format-specific options
    if [ "$format" = "avro" ]; then
        sqoop_cmd="$sqoop_cmd --as-avrodatafile"
    elif [ "$format" = "parquet" ]; then
        sqoop_cmd="$sqoop_cmd --as-parquetfile"
    fi

    # Add compression
    if [ "$compression" != "none" ]; then
        sqoop_cmd="$sqoop_cmd --compress --compression-codec=$compression"
    fi

    # Measure import time
    # start_time=$(date +%s.%N)
    # eval $sqoop_cmd # 2>/dev/null
    # end_time=$(date +%s.%N)
    
    start_time=$(date +%s.%N)
    eval $sqoop_cmd >/dev/null 2>&1
    exit_code=$?
    end_time=$(date +%s.%N)
    import_time=$(echo "$end_time - $start_time" | bc)

    if [ $exit_code -ne 0 ]; then
        find . -maxdepth 1 -name "*.avsc" -delete
        find . -maxdepth 1 -name "*.java" -delete
        echo "ERROR: Sqoop import failed with exit code $exit_code" >&2
        return $exit_code
    fi
    
    local local_output_dir="$LOCAL_OUTPUT_DIR_BASE/$warehouse"
    
    rm -rf "$local_output_dir" 2>/dev/null
    mkdir -p "$local_output_dir"
    
    # Moving .avsc and .java files to local /output
    # echo "Moving generated .avsc and .java files to $local_output_dir ..."
    # Find and move all AVRO schema and Java files from current directory (Sqoop generates them locally)
    find . -maxdepth 1 -name "*.avsc" -exec mv {} $local_output_dir/ \;
    find . -maxdepth 1 -name "*.java" -exec mv {} $local_output_dir/ \;
    
    echo "$import_time|$full_path|$local_output_dir"
}

measure_query() {
    local format=$1
    local compression=$2
    local full_path=$3
    
    local table_name="bench_${format}_${compression}"
    
    start_time=$(date +%s.%N)
    
    hive -e "
        SET hive.exec.compress.output=true;
        SET hive.exec.compress.intermediate=true;
        
        CREATE EXTERNAL TABLE IF NOT EXISTS ${table_name} (
            userid INT,
            windowid INT,
            split STRING,
            city STRING,
            state STRING,
            country STRING,
            zipcode STRING,
            degree STRING,
            major STRING,
            graddate TIMESTAMP,
            jobcnt INT,
            yearsexp INT,
            employed BOOL,
            managerexp BOOL,
            emplcnt INT
        )
        STORED AS ${format}
        LOCATION '${full_path}';
        
        SELECT COUNT(*) FROM ${table_name};
    " 2>/dev/null
    
    hive -e "DROP TABLE IF EXISTS ${table_name}" 2>/dev/null
    
    end_time=$(date +%s.%N)
    local read_time=$(echo "${end_time} - ${start_time}" | bc)
    echo $read_time
}

for format in "${FORMATS[@]}"; do
    for compression in "${COMPRESSIONS[@]}"; do
        # Skip bzip2 with parquet as it's problematic
        # if [[ "$format" == "parquet" && "$compression" == "bzip2" ]]; then
        #     echo "Skipping bzip2 with parquet (not well supported)"
        #     continue
        # fi
        
        echo -e "========================================"
        echo -e "FORMAT $format & COMPRESSION $compression"
        echo -e "========================================"
        
        import_result=$(measure_import $format $compression)
        exit_code=$?
        if [ $exit_code -ne 0 ]; then
            continue
        fi
        
        import_time=$(echo "$import_result" | cut -d'|' -f1)
        hdfs_path=$(echo "$import_result" | cut -d'|' -f2)
        schema_output_dir=$(echo "$import_result" | cut -d'|' -f3)
        echo "IMPORT TIME: $import_time"
        
        size_bytes=$(hdfs dfs -du -s "$hdfs_path" | awk '{print $1}')
        echo "COMPRESSED SIZE: ${size_bytes} bytes"
        
        read_time=$(measure_query $format $compression $hdfs_path)
        echo "READ TIME: $read_time"
        
        
        echo "$format,$compression,$import_time,$read_time,$size_bytes" >> benchmark_results.csv
        
    done
done