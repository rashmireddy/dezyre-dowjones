dezyre-dowjones
===============

Sqoop and Hive dowjones Big Data Project

Setup single node Hadoop on Mac
================================
<ol>
 1. install brew
</ol>
```
ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

<ol>
 2. install hadoop, hive, zookeeper, sqoop
</ol>
```
$ brew install hadoop
$ brew install hive
$ brew install zookeeper
$ brew link zookeeper
```
<ol>
 3. Download sqoop and setup mysql driver
</ol>
```
a. Go to http://www.carfab.com/apachesoftware/sqoop/1.4.5/
b. Download sqoop-1.4.5.bin__hadoop-2.0.4-alpha.tar.gz
c. untar it to home dir ~/sqoop-1.4.5.bin__hadoop-2.0.4-alpha
d. Download mysql-connector-java-5.*.*-bin.jar.zip from internet
e. place it in the lib dir of ~/sqoop-1.4.5.bin__hadoop-2.0.4-alpha/lib
```

<ol>
 4. Run sqoop and Import mysql table data into Hadoop
</ol>
```
$ sqoop import --connect jdbc:mysql://localhost/dowjones  --table dowjones --target-dir /user/rashmi/dowjones --username root --split-by quarter
```

<ol>
5. Create Hive External table on the data at location /user/rashmi/dowjones
</ol>
```
$hive > CREATE EXTERNAL TABLE DOWJONES(quarter INT, stock STRING, dj_date DATE, open DOUBLE, high DOUBLE, low DOUBLE, close DOUBLE, volume BIGINT, percent_change_price DOUBLE, percent_change_volume_over_last_wk DOUBLE, previous_weeks_volume DOUBLE, next_weeks_open DOUBLE, next_weeks_close DOUBLE, percent_change_next_weeks_price DOUBLE, days_to_next_dividend DOUBLE, percent_return_next_dividend DOUBLE) ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' LINES TERMINATED BY '\n' STORED AS TEXTFILE LOCATION '/user/rashmi/dowjones';
```
<ol>
6. execute GROUPBY HiveQL to get the desired result set and store it in local FS
</ol>
```
INSERT OVERWRITE LOCAL DIRECTORY '/Users/rashmi/output' ROW FORMAT DELIMITED FIELDS TERMINATED BY ',' select quarter, stock, SUM(volume) from dowjones GROUP BY quarter, stock;
```

<ol>
7. Copy HiveQL output from local FS toHDFS
</ol>
```
$ hadoop fs -put /Users/rashmi/output /user/rashmi/dowjones/output
```

<ol>
8. Run sqoop
</ol>
Export MapReduce output into MySQL
```
$ sqoop export --connect jdbc:mysql://localhost/dowjones --table quarter_stock_volumes --export-dir /user/rashmi/dowjones/output --username root --input-fields-terminated-by '\t' --input-lines-terminated-by '\n'
```
