USE team17_projectdb;

DROP TABLE IF EXISTS q1_results;

CREATE EXTERNAL TABLE q1_results(
    application_date STRING,
    total_applications INT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION '/user/team17/project/hive/q1';

SET hive.resultset.use.unique.column.names = false;

INSERT OVERWRITE TABLE q1_results
SELECT
    CAST(`date` AS STRING) AS application_date,
    COUNT(appid) AS total_applications
FROM apps_part
GROUP BY `date`
ORDER BY `date`;

SELECT * FROM q1_results;