package com.rashmi.mapreduce.dowjones;

import java.io.IOException;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class DowJonesMapper extends Mapper<LongWritable, Text, Text, DowJonesDataWritable>{
		
	@Override
	public void map(LongWritable key, Text value, Context context) 
		throws IOException, InterruptedException{
		
		String record = value.toString();
		String[] parts = record.split(",");

		// 2,WMT,6/17/2011,0.0,0.0,0.0,0.0,68996550,-0.1701,17.44814099,58746396,0.0,0.0,-0.550285,54,0.700492
		// write you own writable
		// String mapperValue = "quarter:" + parts[0] + ":volume:" + parts[7];
		// sending quarter : volume as the mapper value
		String mapperValue = parts[0] + ":" + parts[7];
		DowJonesDataWritable dowJonesData = new DowJonesDataWritable(parts[0], parts[7]);
		//Key = stock_symbol, Value = quarter:<which_quarter>:volume:<volume_num>
		//which_quarter = 1,2,3,4
		context.write(new Text(parts[1]), dowJonesData);
	}
}
