#!/bin/bash

# Database connection details
JDBC_URL="jdbc:postgresql://hadoop-04.uni.innopolis.ru/team17_projectdb"
USERNAME="team17"
PASSWORD=$(head -n 1 secrets/.psql.pass)

# HDFS target directory
WAREHOUSE_DIR="warehouse"
HDFS_PATH="/user/team17/project"
FULL_PATH="$HDFS_PATH/$WAREHOUSE_DIR"

# Initialize variables
FORMAT="parquet"
COMPRESSION="gzip"

# Local directory to store .avsc and .java files
LOCAL_OUTPUT_DIR="./output/$WAREHOUSE_DIR"

# Validate required arguments
if [[ "$FORMAT" != "avro" && "$FORMAT" != "parquet" ]]; then
    echo "Error: Unknown format: $FORMAT"
    exit 1
fi

if [[ "$COMPRESSION" != "none" && "$COMPRESSION" != "snappy" && "$COMPRESSION" != "gzip" && "$COMPRESSION" != "bzip2" ]]; then
    echo "Error: Unknown compression method: $COMPRESSION"
    exit 1
fi

echo -e "========================================"
echo -e "FORMAT $FORMAT & COMPRESSION $COMPRESSION"
echo -e "========================================"

# Manage directories
rm -rf "$LOCAL_OUTPUT_DIR" 2>/dev/null
mkdir -p $LOCAL_OUTPUT_DIR
hdfs dfs -rm -r -f "$FULL_PATH"
hdfs dfs -mkdir -p "$FULL_PATH"

sqoop_cmd="sqoop import-all-tables \
            --connect $JDBC_URL \
            --username $USERNAME \
            --password $PASSWORD \
            --warehouse-dir $FULL_PATH \
            --m 1"
    
# Add format-specific options
if [ "$FORMAT" = "avro" ]; then
    sqoop_cmd="$sqoop_cmd --as-avrodatafile"
elif [ "$FORMAT" = "parquet" ]; then
    sqoop_cmd="$sqoop_cmd --as-parquetfile"
fi

# Add compression
if [ "$COMPRESSION" = "none" ]; then
    sqoop_cmd="$sqoop_cmd"
else
    sqoop_cmd="$sqoop_cmd --compress --compression-codec=$COMPRESSION"
fi

# Measure import time
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

echo "IMPORT TIME: $import_time"

# Measure size in HDFS
size_bytes=$(hdfs dfs -du -s "$FULL_PATH" | awk '{print $1}')

echo "COMPRESSED SIZE: ${size_bytes} bytes"


# Moving .avsc and .java files to local /output
echo "Moving generated .avsc and .java files to $LOCAL_OUTPUT_DIR ..."
# Find and move all AVRO schema and Java files from current directory (Sqoop generates them locally)
find . -maxdepth 1 -name "*.avsc" -exec mv {} $LOCAL_OUTPUT_DIR/ \;
find . -maxdepth 1 -name "*.java" -exec mv {} $LOCAL_OUTPUT_DIR/ \;


# Verify HDFS output
echo "Listing HDFS warehouse contents:"
hdfs dfs -ls -R $FULL_PATH