USE team17_projectdb;

DROP TABLE IF EXISTS q4_results;

CREATE EXTERNAL TABLE q4_results(
    split_type STRING,
    total_records INT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION '/user/team17/project/hive/q4';

SET hive.resultset.use.unique.column.names = false;

INSERT OVERWRITE TABLE q4_results
SELECT
    split AS split_type,
    COUNT(*) AS total_records
FROM apps_part
GROUP BY split;

SELECT * FROM q4_results;