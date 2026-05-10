USE team17_projectdb;

DROP TABLE IF EXISTS q6_results;

CREATE EXTERNAL TABLE q6_results(
    application_count INT,
    users_count INT
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION '/user/team17/project/hive/q6';

SET hive.resultset.use.unique.column.names = false;

INSERT OVERWRITE TABLE q6_results
SELECT
    total_apps AS application_count,
    COUNT(*) AS users_count
FROM (
    SELECT
        userid,
        COUNT(appid) AS total_apps
    FROM apps_part
    GROUP BY userid
) t
GROUP BY total_apps
ORDER BY total_apps;

SELECT * FROM q6_results;