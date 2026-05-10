USE team17_projectdb;

DROP TABLE IF EXISTS q2_results;

CREATE EXTERNAL TABLE q2_results(
    window_id INT,
    total_applications INT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION '/user/team17/project/hive/q2';

SET hive.resultset.use.unique.column.names = false;

INSERT OVERWRITE TABLE q2_results
SELECT
    windowid AS window_id,
    COUNT(appid) AS total_applications
FROM apps_part
GROUP BY windowid
ORDER BY windowid;

SELECT * FROM q2_results;