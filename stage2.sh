#!/bin/bash

set -e

DB_NAME="team17_projectdb"
USER_NAME="team17"
HIVE_SERVER="jdbc:hive2://hadoop-03.uni.innopolis.ru:10001"

# Do not hardcode password in final public repo.
# Run as: ./stage2.sh YOUR_PASSWORD
PASSWORD="hgVwomtl0OIAe7cF"

if [ -z "$PASSWORD" ]; then
  echo "Usage: ./stage2.sh <hive_password>"
  exit 1
fi

mkdir -p output

echo "Running Stage II EDA queries..."

for i in 1 2 3 4 5 6
do
  echo "Running sql/q${i}.hql..."
  beeline -u "$HIVE_SERVER" -n "$USER_NAME" -p "$PASSWORD" -f "sql/q${i}.hql"
done

echo "Exporting query results from HDFS to local output folder..."

echo "application_date,total_applications" > output/q1.csv
hdfs dfs -cat /user/team17/project/hive/q1/* >> output/q1.csv

echo "window_id,total_applications" > output/q2.csv
hdfs dfs -cat /user/team17/project/hive/q2/* >> output/q2.csv

echo "userid,total_applications" > output/q3.csv
hdfs dfs -cat /user/team17/project/hive/q3/* >> output/q3.csv

echo "split_type,total_records" > output/q4.csv
hdfs dfs -cat /user/team17/project/hive/q4/* >> output/q4.csv

echo "jobid,total_applications" > output/q5.csv
hdfs dfs -cat /user/team17/project/hive/q5/* >> output/q5.csv

echo "application_count,users_count" > output/q6.csv
hdfs dfs -cat /user/team17/project/hive/q6/* >> output/q6.csv

echo "Stage II completed successfully."
echo "Generated files:"
ls -lh output/q*.csv