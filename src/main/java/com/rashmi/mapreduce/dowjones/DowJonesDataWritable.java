package com.rashmi.mapreduce.dowjones;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.WritableComparable;

public class DowJonesDataWritable implements WritableComparable<DowJonesDataWritable> {

	private Text quater;
	private Text volume;
	
	public void set(Text quater, Text volume) {
		this.quater = quater;
		this.volume = volume;
	}
	
	public DowJonesDataWritable() {
		set(new Text(), new Text());
	}
	
	public DowJonesDataWritable(String quater, String volumen) {
		set(new Text(quater), new Text(volume));
	}
	
	public Text getQuater() {
		return quater;
	}
	
	public Text getVolume() {
		return volume;
	}
	
	@Override
	public void readFields(DataInput in) throws IOException {
		// TODO Auto-generated method stub
		quater.readFields(in);
		volume.readFields(in);
	}

	@Override
	public void write(DataOutput out) throws IOException {
		// TODO Auto-generated method stub
		quater.write(out);
		volume.write(out);
	}

	@Override
	public int compareTo(DowJonesDataWritable o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
