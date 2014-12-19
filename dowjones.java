// ORM class for table 'dowjones'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Dec 19 00:21:22 PST 2014
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class dowjones extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer quarter;
  public Integer get_quarter() {
    return quarter;
  }
  public void set_quarter(Integer quarter) {
    this.quarter = quarter;
  }
  public dowjones with_quarter(Integer quarter) {
    this.quarter = quarter;
    return this;
  }
  private String stock;
  public String get_stock() {
    return stock;
  }
  public void set_stock(String stock) {
    this.stock = stock;
  }
  public dowjones with_stock(String stock) {
    this.stock = stock;
    return this;
  }
  private String date;
  public String get_date() {
    return date;
  }
  public void set_date(String date) {
    this.date = date;
  }
  public dowjones with_date(String date) {
    this.date = date;
    return this;
  }
  private Double open;
  public Double get_open() {
    return open;
  }
  public void set_open(Double open) {
    this.open = open;
  }
  public dowjones with_open(Double open) {
    this.open = open;
    return this;
  }
  private Double high;
  public Double get_high() {
    return high;
  }
  public void set_high(Double high) {
    this.high = high;
  }
  public dowjones with_high(Double high) {
    this.high = high;
    return this;
  }
  private Double low;
  public Double get_low() {
    return low;
  }
  public void set_low(Double low) {
    this.low = low;
  }
  public dowjones with_low(Double low) {
    this.low = low;
    return this;
  }
  private Double close;
  public Double get_close() {
    return close;
  }
  public void set_close(Double close) {
    this.close = close;
  }
  public dowjones with_close(Double close) {
    this.close = close;
    return this;
  }
  private Long volume;
  public Long get_volume() {
    return volume;
  }
  public void set_volume(Long volume) {
    this.volume = volume;
  }
  public dowjones with_volume(Long volume) {
    this.volume = volume;
    return this;
  }
  private Double percent_change_price;
  public Double get_percent_change_price() {
    return percent_change_price;
  }
  public void set_percent_change_price(Double percent_change_price) {
    this.percent_change_price = percent_change_price;
  }
  public dowjones with_percent_change_price(Double percent_change_price) {
    this.percent_change_price = percent_change_price;
    return this;
  }
  private Double percent_change_volume_over_last_wk;
  public Double get_percent_change_volume_over_last_wk() {
    return percent_change_volume_over_last_wk;
  }
  public void set_percent_change_volume_over_last_wk(Double percent_change_volume_over_last_wk) {
    this.percent_change_volume_over_last_wk = percent_change_volume_over_last_wk;
  }
  public dowjones with_percent_change_volume_over_last_wk(Double percent_change_volume_over_last_wk) {
    this.percent_change_volume_over_last_wk = percent_change_volume_over_last_wk;
    return this;
  }
  private Long previous_weeks_volume;
  public Long get_previous_weeks_volume() {
    return previous_weeks_volume;
  }
  public void set_previous_weeks_volume(Long previous_weeks_volume) {
    this.previous_weeks_volume = previous_weeks_volume;
  }
  public dowjones with_previous_weeks_volume(Long previous_weeks_volume) {
    this.previous_weeks_volume = previous_weeks_volume;
    return this;
  }
  private Double next_weeks_open;
  public Double get_next_weeks_open() {
    return next_weeks_open;
  }
  public void set_next_weeks_open(Double next_weeks_open) {
    this.next_weeks_open = next_weeks_open;
  }
  public dowjones with_next_weeks_open(Double next_weeks_open) {
    this.next_weeks_open = next_weeks_open;
    return this;
  }
  private Double next_weeks_close;
  public Double get_next_weeks_close() {
    return next_weeks_close;
  }
  public void set_next_weeks_close(Double next_weeks_close) {
    this.next_weeks_close = next_weeks_close;
  }
  public dowjones with_next_weeks_close(Double next_weeks_close) {
    this.next_weeks_close = next_weeks_close;
    return this;
  }
  private Double percent_change_next_weeks_price;
  public Double get_percent_change_next_weeks_price() {
    return percent_change_next_weeks_price;
  }
  public void set_percent_change_next_weeks_price(Double percent_change_next_weeks_price) {
    this.percent_change_next_weeks_price = percent_change_next_weeks_price;
  }
  public dowjones with_percent_change_next_weeks_price(Double percent_change_next_weeks_price) {
    this.percent_change_next_weeks_price = percent_change_next_weeks_price;
    return this;
  }
  private Integer days_to_next_dividend;
  public Integer get_days_to_next_dividend() {
    return days_to_next_dividend;
  }
  public void set_days_to_next_dividend(Integer days_to_next_dividend) {
    this.days_to_next_dividend = days_to_next_dividend;
  }
  public dowjones with_days_to_next_dividend(Integer days_to_next_dividend) {
    this.days_to_next_dividend = days_to_next_dividend;
    return this;
  }
  private Double percent_return_next_dividend;
  public Double get_percent_return_next_dividend() {
    return percent_return_next_dividend;
  }
  public void set_percent_return_next_dividend(Double percent_return_next_dividend) {
    this.percent_return_next_dividend = percent_return_next_dividend;
  }
  public dowjones with_percent_return_next_dividend(Double percent_return_next_dividend) {
    this.percent_return_next_dividend = percent_return_next_dividend;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dowjones)) {
      return false;
    }
    dowjones that = (dowjones) o;
    boolean equal = true;
    equal = equal && (this.quarter == null ? that.quarter == null : this.quarter.equals(that.quarter));
    equal = equal && (this.stock == null ? that.stock == null : this.stock.equals(that.stock));
    equal = equal && (this.date == null ? that.date == null : this.date.equals(that.date));
    equal = equal && (this.open == null ? that.open == null : this.open.equals(that.open));
    equal = equal && (this.high == null ? that.high == null : this.high.equals(that.high));
    equal = equal && (this.low == null ? that.low == null : this.low.equals(that.low));
    equal = equal && (this.close == null ? that.close == null : this.close.equals(that.close));
    equal = equal && (this.volume == null ? that.volume == null : this.volume.equals(that.volume));
    equal = equal && (this.percent_change_price == null ? that.percent_change_price == null : this.percent_change_price.equals(that.percent_change_price));
    equal = equal && (this.percent_change_volume_over_last_wk == null ? that.percent_change_volume_over_last_wk == null : this.percent_change_volume_over_last_wk.equals(that.percent_change_volume_over_last_wk));
    equal = equal && (this.previous_weeks_volume == null ? that.previous_weeks_volume == null : this.previous_weeks_volume.equals(that.previous_weeks_volume));
    equal = equal && (this.next_weeks_open == null ? that.next_weeks_open == null : this.next_weeks_open.equals(that.next_weeks_open));
    equal = equal && (this.next_weeks_close == null ? that.next_weeks_close == null : this.next_weeks_close.equals(that.next_weeks_close));
    equal = equal && (this.percent_change_next_weeks_price == null ? that.percent_change_next_weeks_price == null : this.percent_change_next_weeks_price.equals(that.percent_change_next_weeks_price));
    equal = equal && (this.days_to_next_dividend == null ? that.days_to_next_dividend == null : this.days_to_next_dividend.equals(that.days_to_next_dividend));
    equal = equal && (this.percent_return_next_dividend == null ? that.percent_return_next_dividend == null : this.percent_return_next_dividend.equals(that.percent_return_next_dividend));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof dowjones)) {
      return false;
    }
    dowjones that = (dowjones) o;
    boolean equal = true;
    equal = equal && (this.quarter == null ? that.quarter == null : this.quarter.equals(that.quarter));
    equal = equal && (this.stock == null ? that.stock == null : this.stock.equals(that.stock));
    equal = equal && (this.date == null ? that.date == null : this.date.equals(that.date));
    equal = equal && (this.open == null ? that.open == null : this.open.equals(that.open));
    equal = equal && (this.high == null ? that.high == null : this.high.equals(that.high));
    equal = equal && (this.low == null ? that.low == null : this.low.equals(that.low));
    equal = equal && (this.close == null ? that.close == null : this.close.equals(that.close));
    equal = equal && (this.volume == null ? that.volume == null : this.volume.equals(that.volume));
    equal = equal && (this.percent_change_price == null ? that.percent_change_price == null : this.percent_change_price.equals(that.percent_change_price));
    equal = equal && (this.percent_change_volume_over_last_wk == null ? that.percent_change_volume_over_last_wk == null : this.percent_change_volume_over_last_wk.equals(that.percent_change_volume_over_last_wk));
    equal = equal && (this.previous_weeks_volume == null ? that.previous_weeks_volume == null : this.previous_weeks_volume.equals(that.previous_weeks_volume));
    equal = equal && (this.next_weeks_open == null ? that.next_weeks_open == null : this.next_weeks_open.equals(that.next_weeks_open));
    equal = equal && (this.next_weeks_close == null ? that.next_weeks_close == null : this.next_weeks_close.equals(that.next_weeks_close));
    equal = equal && (this.percent_change_next_weeks_price == null ? that.percent_change_next_weeks_price == null : this.percent_change_next_weeks_price.equals(that.percent_change_next_weeks_price));
    equal = equal && (this.days_to_next_dividend == null ? that.days_to_next_dividend == null : this.days_to_next_dividend.equals(that.days_to_next_dividend));
    equal = equal && (this.percent_return_next_dividend == null ? that.percent_return_next_dividend == null : this.percent_return_next_dividend.equals(that.percent_return_next_dividend));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.quarter = JdbcWritableBridge.readInteger(1, __dbResults);
    this.stock = JdbcWritableBridge.readString(2, __dbResults);
    this.date = JdbcWritableBridge.readString(3, __dbResults);
    this.open = JdbcWritableBridge.readDouble(4, __dbResults);
    this.high = JdbcWritableBridge.readDouble(5, __dbResults);
    this.low = JdbcWritableBridge.readDouble(6, __dbResults);
    this.close = JdbcWritableBridge.readDouble(7, __dbResults);
    this.volume = JdbcWritableBridge.readLong(8, __dbResults);
    this.percent_change_price = JdbcWritableBridge.readDouble(9, __dbResults);
    this.percent_change_volume_over_last_wk = JdbcWritableBridge.readDouble(10, __dbResults);
    this.previous_weeks_volume = JdbcWritableBridge.readLong(11, __dbResults);
    this.next_weeks_open = JdbcWritableBridge.readDouble(12, __dbResults);
    this.next_weeks_close = JdbcWritableBridge.readDouble(13, __dbResults);
    this.percent_change_next_weeks_price = JdbcWritableBridge.readDouble(14, __dbResults);
    this.days_to_next_dividend = JdbcWritableBridge.readInteger(15, __dbResults);
    this.percent_return_next_dividend = JdbcWritableBridge.readDouble(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.quarter = JdbcWritableBridge.readInteger(1, __dbResults);
    this.stock = JdbcWritableBridge.readString(2, __dbResults);
    this.date = JdbcWritableBridge.readString(3, __dbResults);
    this.open = JdbcWritableBridge.readDouble(4, __dbResults);
    this.high = JdbcWritableBridge.readDouble(5, __dbResults);
    this.low = JdbcWritableBridge.readDouble(6, __dbResults);
    this.close = JdbcWritableBridge.readDouble(7, __dbResults);
    this.volume = JdbcWritableBridge.readLong(8, __dbResults);
    this.percent_change_price = JdbcWritableBridge.readDouble(9, __dbResults);
    this.percent_change_volume_over_last_wk = JdbcWritableBridge.readDouble(10, __dbResults);
    this.previous_weeks_volume = JdbcWritableBridge.readLong(11, __dbResults);
    this.next_weeks_open = JdbcWritableBridge.readDouble(12, __dbResults);
    this.next_weeks_close = JdbcWritableBridge.readDouble(13, __dbResults);
    this.percent_change_next_weeks_price = JdbcWritableBridge.readDouble(14, __dbResults);
    this.days_to_next_dividend = JdbcWritableBridge.readInteger(15, __dbResults);
    this.percent_return_next_dividend = JdbcWritableBridge.readDouble(16, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(quarter, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(stock, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(open, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(high, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(low, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(close, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeLong(volume, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(percent_change_price, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(percent_change_volume_over_last_wk, 10 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeLong(previous_weeks_volume, 11 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(next_weeks_open, 12 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(next_weeks_close, 13 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(percent_change_next_weeks_price, 14 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(days_to_next_dividend, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(percent_return_next_dividend, 16 + __off, 8, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(quarter, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(stock, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(open, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(high, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(low, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(close, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeLong(volume, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(percent_change_price, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(percent_change_volume_over_last_wk, 10 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeLong(previous_weeks_volume, 11 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(next_weeks_open, 12 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(next_weeks_close, 13 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(percent_change_next_weeks_price, 14 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(days_to_next_dividend, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDouble(percent_return_next_dividend, 16 + __off, 8, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.quarter = null;
    } else {
    this.quarter = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.stock = null;
    } else {
    this.stock = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.date = null;
    } else {
    this.date = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.open = null;
    } else {
    this.open = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.high = null;
    } else {
    this.high = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.low = null;
    } else {
    this.low = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.close = null;
    } else {
    this.close = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.volume = null;
    } else {
    this.volume = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.percent_change_price = null;
    } else {
    this.percent_change_price = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.percent_change_volume_over_last_wk = null;
    } else {
    this.percent_change_volume_over_last_wk = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.previous_weeks_volume = null;
    } else {
    this.previous_weeks_volume = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.next_weeks_open = null;
    } else {
    this.next_weeks_open = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.next_weeks_close = null;
    } else {
    this.next_weeks_close = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.percent_change_next_weeks_price = null;
    } else {
    this.percent_change_next_weeks_price = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.days_to_next_dividend = null;
    } else {
    this.days_to_next_dividend = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.percent_return_next_dividend = null;
    } else {
    this.percent_return_next_dividend = Double.valueOf(__dataIn.readDouble());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.quarter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.quarter);
    }
    if (null == this.stock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stock);
    }
    if (null == this.date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date);
    }
    if (null == this.open) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.open);
    }
    if (null == this.high) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.high);
    }
    if (null == this.low) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.low);
    }
    if (null == this.close) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.close);
    }
    if (null == this.volume) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.volume);
    }
    if (null == this.percent_change_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.percent_change_price);
    }
    if (null == this.percent_change_volume_over_last_wk) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.percent_change_volume_over_last_wk);
    }
    if (null == this.previous_weeks_volume) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.previous_weeks_volume);
    }
    if (null == this.next_weeks_open) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.next_weeks_open);
    }
    if (null == this.next_weeks_close) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.next_weeks_close);
    }
    if (null == this.percent_change_next_weeks_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.percent_change_next_weeks_price);
    }
    if (null == this.days_to_next_dividend) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.days_to_next_dividend);
    }
    if (null == this.percent_return_next_dividend) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.percent_return_next_dividend);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.quarter) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.quarter);
    }
    if (null == this.stock) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, stock);
    }
    if (null == this.date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date);
    }
    if (null == this.open) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.open);
    }
    if (null == this.high) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.high);
    }
    if (null == this.low) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.low);
    }
    if (null == this.close) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.close);
    }
    if (null == this.volume) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.volume);
    }
    if (null == this.percent_change_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.percent_change_price);
    }
    if (null == this.percent_change_volume_over_last_wk) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.percent_change_volume_over_last_wk);
    }
    if (null == this.previous_weeks_volume) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.previous_weeks_volume);
    }
    if (null == this.next_weeks_open) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.next_weeks_open);
    }
    if (null == this.next_weeks_close) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.next_weeks_close);
    }
    if (null == this.percent_change_next_weeks_price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.percent_change_next_weeks_price);
    }
    if (null == this.days_to_next_dividend) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.days_to_next_dividend);
    }
    if (null == this.percent_return_next_dividend) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.percent_return_next_dividend);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(quarter==null?"null":"" + quarter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock==null?"null":stock, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date==null?"null":date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(open==null?"null":"" + open, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(high==null?"null":"" + high, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(low==null?"null":"" + low, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(close==null?"null":"" + close, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(volume==null?"null":"" + volume, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(percent_change_price==null?"null":"" + percent_change_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(percent_change_volume_over_last_wk==null?"null":"" + percent_change_volume_over_last_wk, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(previous_weeks_volume==null?"null":"" + previous_weeks_volume, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(next_weeks_open==null?"null":"" + next_weeks_open, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(next_weeks_close==null?"null":"" + next_weeks_close, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(percent_change_next_weeks_price==null?"null":"" + percent_change_next_weeks_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(days_to_next_dividend==null?"null":"" + days_to_next_dividend, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(percent_return_next_dividend==null?"null":"" + percent_return_next_dividend, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(quarter==null?"null":"" + quarter, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(stock==null?"null":stock, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date==null?"null":date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(open==null?"null":"" + open, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(high==null?"null":"" + high, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(low==null?"null":"" + low, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(close==null?"null":"" + close, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(volume==null?"null":"" + volume, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(percent_change_price==null?"null":"" + percent_change_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(percent_change_volume_over_last_wk==null?"null":"" + percent_change_volume_over_last_wk, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(previous_weeks_volume==null?"null":"" + previous_weeks_volume, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(next_weeks_open==null?"null":"" + next_weeks_open, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(next_weeks_close==null?"null":"" + next_weeks_close, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(percent_change_next_weeks_price==null?"null":"" + percent_change_next_weeks_price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(days_to_next_dividend==null?"null":"" + days_to_next_dividend, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(percent_return_next_dividend==null?"null":"" + percent_return_next_dividend, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.quarter = null; } else {
      this.quarter = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.stock = null; } else {
      this.stock = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.date = null; } else {
      this.date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.open = null; } else {
      this.open = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.high = null; } else {
      this.high = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.low = null; } else {
      this.low = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.close = null; } else {
      this.close = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.volume = null; } else {
      this.volume = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.percent_change_price = null; } else {
      this.percent_change_price = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.percent_change_volume_over_last_wk = null; } else {
      this.percent_change_volume_over_last_wk = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.previous_weeks_volume = null; } else {
      this.previous_weeks_volume = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.next_weeks_open = null; } else {
      this.next_weeks_open = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.next_weeks_close = null; } else {
      this.next_weeks_close = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.percent_change_next_weeks_price = null; } else {
      this.percent_change_next_weeks_price = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.days_to_next_dividend = null; } else {
      this.days_to_next_dividend = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.percent_return_next_dividend = null; } else {
      this.percent_return_next_dividend = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.quarter = null; } else {
      this.quarter = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.stock = null; } else {
      this.stock = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.date = null; } else {
      this.date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.open = null; } else {
      this.open = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.high = null; } else {
      this.high = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.low = null; } else {
      this.low = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.close = null; } else {
      this.close = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.volume = null; } else {
      this.volume = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.percent_change_price = null; } else {
      this.percent_change_price = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.percent_change_volume_over_last_wk = null; } else {
      this.percent_change_volume_over_last_wk = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.previous_weeks_volume = null; } else {
      this.previous_weeks_volume = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.next_weeks_open = null; } else {
      this.next_weeks_open = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.next_weeks_close = null; } else {
      this.next_weeks_close = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.percent_change_next_weeks_price = null; } else {
      this.percent_change_next_weeks_price = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.days_to_next_dividend = null; } else {
      this.days_to_next_dividend = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.percent_return_next_dividend = null; } else {
      this.percent_return_next_dividend = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    dowjones o = (dowjones) super.clone();
    return o;
  }

  public void clone0(dowjones o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("quarter", this.quarter);
    __sqoop$field_map.put("stock", this.stock);
    __sqoop$field_map.put("date", this.date);
    __sqoop$field_map.put("open", this.open);
    __sqoop$field_map.put("high", this.high);
    __sqoop$field_map.put("low", this.low);
    __sqoop$field_map.put("close", this.close);
    __sqoop$field_map.put("volume", this.volume);
    __sqoop$field_map.put("percent_change_price", this.percent_change_price);
    __sqoop$field_map.put("percent_change_volume_over_last_wk", this.percent_change_volume_over_last_wk);
    __sqoop$field_map.put("previous_weeks_volume", this.previous_weeks_volume);
    __sqoop$field_map.put("next_weeks_open", this.next_weeks_open);
    __sqoop$field_map.put("next_weeks_close", this.next_weeks_close);
    __sqoop$field_map.put("percent_change_next_weeks_price", this.percent_change_next_weeks_price);
    __sqoop$field_map.put("days_to_next_dividend", this.days_to_next_dividend);
    __sqoop$field_map.put("percent_return_next_dividend", this.percent_return_next_dividend);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("quarter", this.quarter);
    __sqoop$field_map.put("stock", this.stock);
    __sqoop$field_map.put("date", this.date);
    __sqoop$field_map.put("open", this.open);
    __sqoop$field_map.put("high", this.high);
    __sqoop$field_map.put("low", this.low);
    __sqoop$field_map.put("close", this.close);
    __sqoop$field_map.put("volume", this.volume);
    __sqoop$field_map.put("percent_change_price", this.percent_change_price);
    __sqoop$field_map.put("percent_change_volume_over_last_wk", this.percent_change_volume_over_last_wk);
    __sqoop$field_map.put("previous_weeks_volume", this.previous_weeks_volume);
    __sqoop$field_map.put("next_weeks_open", this.next_weeks_open);
    __sqoop$field_map.put("next_weeks_close", this.next_weeks_close);
    __sqoop$field_map.put("percent_change_next_weeks_price", this.percent_change_next_weeks_price);
    __sqoop$field_map.put("days_to_next_dividend", this.days_to_next_dividend);
    __sqoop$field_map.put("percent_return_next_dividend", this.percent_return_next_dividend);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("quarter".equals(__fieldName)) {
      this.quarter = (Integer) __fieldVal;
    }
    else    if ("stock".equals(__fieldName)) {
      this.stock = (String) __fieldVal;
    }
    else    if ("date".equals(__fieldName)) {
      this.date = (String) __fieldVal;
    }
    else    if ("open".equals(__fieldName)) {
      this.open = (Double) __fieldVal;
    }
    else    if ("high".equals(__fieldName)) {
      this.high = (Double) __fieldVal;
    }
    else    if ("low".equals(__fieldName)) {
      this.low = (Double) __fieldVal;
    }
    else    if ("close".equals(__fieldName)) {
      this.close = (Double) __fieldVal;
    }
    else    if ("volume".equals(__fieldName)) {
      this.volume = (Long) __fieldVal;
    }
    else    if ("percent_change_price".equals(__fieldName)) {
      this.percent_change_price = (Double) __fieldVal;
    }
    else    if ("percent_change_volume_over_last_wk".equals(__fieldName)) {
      this.percent_change_volume_over_last_wk = (Double) __fieldVal;
    }
    else    if ("previous_weeks_volume".equals(__fieldName)) {
      this.previous_weeks_volume = (Long) __fieldVal;
    }
    else    if ("next_weeks_open".equals(__fieldName)) {
      this.next_weeks_open = (Double) __fieldVal;
    }
    else    if ("next_weeks_close".equals(__fieldName)) {
      this.next_weeks_close = (Double) __fieldVal;
    }
    else    if ("percent_change_next_weeks_price".equals(__fieldName)) {
      this.percent_change_next_weeks_price = (Double) __fieldVal;
    }
    else    if ("days_to_next_dividend".equals(__fieldName)) {
      this.days_to_next_dividend = (Integer) __fieldVal;
    }
    else    if ("percent_return_next_dividend".equals(__fieldName)) {
      this.percent_return_next_dividend = (Double) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("quarter".equals(__fieldName)) {
      this.quarter = (Integer) __fieldVal;
      return true;
    }
    else    if ("stock".equals(__fieldName)) {
      this.stock = (String) __fieldVal;
      return true;
    }
    else    if ("date".equals(__fieldName)) {
      this.date = (String) __fieldVal;
      return true;
    }
    else    if ("open".equals(__fieldName)) {
      this.open = (Double) __fieldVal;
      return true;
    }
    else    if ("high".equals(__fieldName)) {
      this.high = (Double) __fieldVal;
      return true;
    }
    else    if ("low".equals(__fieldName)) {
      this.low = (Double) __fieldVal;
      return true;
    }
    else    if ("close".equals(__fieldName)) {
      this.close = (Double) __fieldVal;
      return true;
    }
    else    if ("volume".equals(__fieldName)) {
      this.volume = (Long) __fieldVal;
      return true;
    }
    else    if ("percent_change_price".equals(__fieldName)) {
      this.percent_change_price = (Double) __fieldVal;
      return true;
    }
    else    if ("percent_change_volume_over_last_wk".equals(__fieldName)) {
      this.percent_change_volume_over_last_wk = (Double) __fieldVal;
      return true;
    }
    else    if ("previous_weeks_volume".equals(__fieldName)) {
      this.previous_weeks_volume = (Long) __fieldVal;
      return true;
    }
    else    if ("next_weeks_open".equals(__fieldName)) {
      this.next_weeks_open = (Double) __fieldVal;
      return true;
    }
    else    if ("next_weeks_close".equals(__fieldName)) {
      this.next_weeks_close = (Double) __fieldVal;
      return true;
    }
    else    if ("percent_change_next_weeks_price".equals(__fieldName)) {
      this.percent_change_next_weeks_price = (Double) __fieldVal;
      return true;
    }
    else    if ("days_to_next_dividend".equals(__fieldName)) {
      this.days_to_next_dividend = (Integer) __fieldVal;
      return true;
    }
    else    if ("percent_return_next_dividend".equals(__fieldName)) {
      this.percent_return_next_dividend = (Double) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
