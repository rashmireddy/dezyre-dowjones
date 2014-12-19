#!/bin/bash
export PATH=$PATH:/Users/rashmi/sqoop-1.4.5.bin__hadoop-2.0.4-alpha/bin/

sqoop import --connect jdbc:mysql://localhost/dowjones --table dowjones --target-dir /user/rashmi/dowjones --username root --split-by quarter && \
hive -f ./sql/hive.sql && \ 
sqoop export --connect jdbc:mysql://localhost/nyse --table stock_volume --export-dir /user/rashmi/nasdaq_daily_prices/output --username root --input-fields-terminated-by '\t' --input-lines-terminated-by '\n' && \
echo "SUCCESS:sqoop import-Hive:Creating External table.....Executing HiveQL-sqoop export"
