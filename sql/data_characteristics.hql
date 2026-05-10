USE team17_projectdb;

DROP TABLE IF EXISTS data_characteristics;

CREATE EXTERNAL TABLE data_characteristics(
    metric STRING,
    value BIGINT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION '/user/team17/project/hive/data_characteristics';

INSERT OVERWRITE TABLE data_characteristics
SELECT 'Total Records', COUNT(*) FROM apps_part
UNION ALL
SELECT 'Unique Users', COUNT(DISTINCT userid) FROM apps_part
UNION ALL
SELECT 'Unique Jobs', COUNT(DISTINCT jobid) FROM apps_part
UNION ALL
SELECT 'Temporal Windows', COUNT(DISTINCT windowid) FROM apps_part
UNION ALL
SELECT 'Number of Features', 6;

SELECT * FROM data_characteristics;