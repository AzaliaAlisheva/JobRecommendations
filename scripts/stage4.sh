#!/bin/bash

set -e

USER_NAME="team17"
HIVE_SERVER="jdbc:hive2://hadoop-03.uni.innopolis.ru:10001"
PASSWORD="hgVwomtl0OIAe7cF"

PROJECT_ROOT="$(cd "$(dirname "$0")/.." && pwd)"
cd "$PROJECT_ROOT"

mkdir -p output

echo "Preparing Stage IV HDFS folders..."

hdfs dfs -mkdir -p /user/team17/project/output/evaluation
hdfs dfs -mkdir -p /user/team17/project/output/model1_predictions
hdfs dfs -mkdir -p /user/team17/project/hive/model_summary

echo "Uploading ML output files to HDFS..."

hdfs dfs -put -f output/evaluation.csv /user/team17/project/output/evaluation/
hdfs dfs -put -f output/model1_predictions.csv /user/team17/project/output/model1_predictions/

echo "Creating Hive tables for Stage IV..."

beeline -u "$HIVE_SERVER" -n "$USER_NAME" -p "$PASSWORD" <<EOF

USE team17_projectdb;

DROP TABLE IF EXISTS evaluation_results;

CREATE EXTERNAL TABLE evaluation_results (
    model STRING,
    AUC DOUBLE,
    PR_AUC DOUBLE,
    Accuracy DOUBLE,
    F1 DOUBLE
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION '/user/team17/project/output/evaluation/'
TBLPROPERTIES ("skip.header.line.count"="1");

DROP TABLE IF EXISTS model1_predictions;

CREATE EXTERNAL TABLE model1_predictions (
    label DOUBLE,
    prediction DOUBLE
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION '/user/team17/project/output/model1_predictions/'
TBLPROPERTIES ("skip.header.line.count"="1");

DROP TABLE IF EXISTS model_summary;

CREATE EXTERNAL TABLE model_summary (
    result_type STRING,
    count INT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION '/user/team17/project/hive/model_summary';

INSERT OVERWRITE TABLE model_summary
SELECT
    CASE
        WHEN label = 1 AND prediction = 1 THEN 'True Positive'
        WHEN label = 0 AND prediction = 0 THEN 'True Negative'
        WHEN label = 0 AND prediction = 1 THEN 'False Positive'
        WHEN label = 1 AND prediction = 0 THEN 'False Negative'
    END AS result_type,
    COUNT(*) AS count
FROM model1_predictions
GROUP BY
    CASE
        WHEN label = 1 AND prediction = 1 THEN 'True Positive'
        WHEN label = 0 AND prediction = 0 THEN 'True Negative'
        WHEN label = 0 AND prediction = 1 THEN 'False Positive'
        WHEN label = 1 AND prediction = 0 THEN 'False Negative'
    END;

SELECT * FROM evaluation_results;
SELECT * FROM model_summary;

EOF

echo "Exporting model summary to local output folder..."

echo "result_type,count" > output/model_summary.csv
hdfs dfs -cat /user/team17/project/hive/model_summary/* >> output/model_summary.csv

echo "Stage IV completed successfully."
echo "Generated/updated files:"
ls -lh output/evaluation.csv output/model1_predictions.csv output/model_summary.csv