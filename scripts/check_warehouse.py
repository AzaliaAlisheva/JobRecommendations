import sys
import time
from pyspark.sql import SparkSession

spark = SparkSession.builder.appName("BenchmarkRead").getOrCreate()
spark.catalog.clearCache() # Ensure we aren't reading from memory

df = spark.read.format("com.databricks.spark.avro").load("/user/team17/project/test/warehouse_parquet_gzip")

df.show(10)