package com.rashmi.mapreduce.dowjones;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class DowJonesReducer extends Reducer<Text, Text, NullWritable, Text> {
		
	public void reduce(Text reducerKey, Iterable<Text> reducerValues, Context context) 
		throws IOException, InterruptedException {

		int Total = 0;
		//String quarter = null;
		//String outputKey = null;
		//String outputValue = null;
		
		Map<Integer,ArrayList<Double>> qCountList = new HashMap<Integer,ArrayList<Double>>();
		Map<Integer,Double> qCount = new HashMap<Integer,Double>();
		
		//foreach Key(stock_symbol) sum the volume in each quarter
		for( Text value : reducerValues) {
			String parts[] = value.toString().split(":");
			if(parts.length != 2) 
				continue;
			
			int quarter = Integer.parseInt(parts[0]);
			double volume = Double.parseDouble(parts[1]);
			
			if(qCount.containsKey(quarter)) {
				qCount.put(quarter, qCount.get(quarter)+ volume);
			} else {
				qCount.put(quarter,volume);
			}
		}
		
		for (Map.Entry<Integer, Double> entry : qCount.entrySet()) {
		    Integer key = entry.getKey();
		    Double  value = entry.getValue();
		    String reduceOutput = reducerKey + "\t" + key.toString() + "\t" + value.toString();
		
		    context.write(NullWritable.get(), new Text(reduceOutput));
		}
	}
}