USE team17_projectdb;

DROP TABLE IF EXISTS q5_results;

CREATE EXTERNAL TABLE q5_results(
    jobid STRING,
    total_applications INT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION '/user/team17/project/hive/q5';

SET hive.resultset.use.unique.column.names = false;

INSERT OVERWRITE TABLE q5_results
SELECT
    jobid,
    COUNT(appid) AS total_applications
FROM apps_part
GROUP BY jobid
ORDER BY total_applications DESC
LIMIT 10;

SELECT * FROM q5_results;