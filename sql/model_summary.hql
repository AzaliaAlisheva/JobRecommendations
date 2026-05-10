USE team17_projectdb;

DROP TABLE IF EXISTS model_summary;

CREATE EXTERNAL TABLE model_summary(
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

SELECT * FROM model_summary;