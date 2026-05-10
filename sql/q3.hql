USE team17_projectdb;

DROP TABLE IF EXISTS q3_results;

CREATE EXTERNAL TABLE q3_results(
    userid STRING,
    total_applications INT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION '/user/team17/project/hive/q3';

SET hive.resultset.use.unique.column.names = false;

INSERT OVERWRITE TABLE q3_results
SELECT
    userid,
    COUNT(appid) AS total_applications
FROM apps_part
GROUP BY userid
ORDER BY total_applications DESC
LIMIT 10;

SELECT * FROM q3_results;