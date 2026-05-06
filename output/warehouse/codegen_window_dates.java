// ORM class for table 'window_dates'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Apr 15 21:51:51 MSK 2026
// For connector: org.apache.sqoop.manager.PostgresqlManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
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
import java.util.HashMap;

public class codegen_window_dates extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("windowid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_window_dates.this.windowid = (Integer)value;
      }
    });
    setters.put("trainstart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_window_dates.this.trainstart = (java.sql.Timestamp)value;
      }
    });
    setters.put("teststart", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_window_dates.this.teststart = (java.sql.Timestamp)value;
      }
    });
    setters.put("testend", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_window_dates.this.testend = (java.sql.Timestamp)value;
      }
    });
  }
  public codegen_window_dates() {
    init0();
  }
  private Integer windowid;
  public Integer get_windowid() {
    return windowid;
  }
  public void set_windowid(Integer windowid) {
    this.windowid = windowid;
  }
  public codegen_window_dates with_windowid(Integer windowid) {
    this.windowid = windowid;
    return this;
  }
  private java.sql.Timestamp trainstart;
  public java.sql.Timestamp get_trainstart() {
    return trainstart;
  }
  public void set_trainstart(java.sql.Timestamp trainstart) {
    this.trainstart = trainstart;
  }
  public codegen_window_dates with_trainstart(java.sql.Timestamp trainstart) {
    this.trainstart = trainstart;
    return this;
  }
  private java.sql.Timestamp teststart;
  public java.sql.Timestamp get_teststart() {
    return teststart;
  }
  public void set_teststart(java.sql.Timestamp teststart) {
    this.teststart = teststart;
  }
  public codegen_window_dates with_teststart(java.sql.Timestamp teststart) {
    this.teststart = teststart;
    return this;
  }
  private java.sql.Timestamp testend;
  public java.sql.Timestamp get_testend() {
    return testend;
  }
  public void set_testend(java.sql.Timestamp testend) {
    this.testend = testend;
  }
  public codegen_window_dates with_testend(java.sql.Timestamp testend) {
    this.testend = testend;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_window_dates)) {
      return false;
    }
    codegen_window_dates that = (codegen_window_dates) o;
    boolean equal = true;
    equal = equal && (this.windowid == null ? that.windowid == null : this.windowid.equals(that.windowid));
    equal = equal && (this.trainstart == null ? that.trainstart == null : this.trainstart.equals(that.trainstart));
    equal = equal && (this.teststart == null ? that.teststart == null : this.teststart.equals(that.teststart));
    equal = equal && (this.testend == null ? that.testend == null : this.testend.equals(that.testend));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_window_dates)) {
      return false;
    }
    codegen_window_dates that = (codegen_window_dates) o;
    boolean equal = true;
    equal = equal && (this.windowid == null ? that.windowid == null : this.windowid.equals(that.windowid));
    equal = equal && (this.trainstart == null ? that.trainstart == null : this.trainstart.equals(that.trainstart));
    equal = equal && (this.teststart == null ? that.teststart == null : this.teststart.equals(that.teststart));
    equal = equal && (this.testend == null ? that.testend == null : this.testend.equals(that.testend));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.windowid = JdbcWritableBridge.readInteger(1, __dbResults);
    this.trainstart = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.teststart = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.testend = JdbcWritableBridge.readTimestamp(4, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.windowid = JdbcWritableBridge.readInteger(1, __dbResults);
    this.trainstart = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.teststart = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.testend = JdbcWritableBridge.readTimestamp(4, __dbResults);
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
    JdbcWritableBridge.writeInteger(windowid, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(trainstart, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(teststart, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(testend, 4 + __off, 93, __dbStmt);
    return 4;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(windowid, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(trainstart, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(teststart, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(testend, 4 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.windowid = null;
    } else {
    this.windowid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.trainstart = null;
    } else {
    this.trainstart = new Timestamp(__dataIn.readLong());
    this.trainstart.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.teststart = null;
    } else {
    this.teststart = new Timestamp(__dataIn.readLong());
    this.teststart.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.testend = null;
    } else {
    this.testend = new Timestamp(__dataIn.readLong());
    this.testend.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.windowid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.windowid);
    }
    if (null == this.trainstart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.trainstart.getTime());
    __dataOut.writeInt(this.trainstart.getNanos());
    }
    if (null == this.teststart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.teststart.getTime());
    __dataOut.writeInt(this.teststart.getNanos());
    }
    if (null == this.testend) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.testend.getTime());
    __dataOut.writeInt(this.testend.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.windowid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.windowid);
    }
    if (null == this.trainstart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.trainstart.getTime());
    __dataOut.writeInt(this.trainstart.getNanos());
    }
    if (null == this.teststart) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.teststart.getTime());
    __dataOut.writeInt(this.teststart.getNanos());
    }
    if (null == this.testend) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.testend.getTime());
    __dataOut.writeInt(this.testend.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(windowid==null?"null":"" + windowid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(trainstart==null?"null":"" + trainstart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(teststart==null?"null":"" + teststart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(testend==null?"null":"" + testend, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(windowid==null?"null":"" + windowid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(trainstart==null?"null":"" + trainstart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(teststart==null?"null":"" + teststart, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(testend==null?"null":"" + testend, delimiters));
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
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.windowid = null; } else {
      this.windowid = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.trainstart = null; } else {
      this.trainstart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.teststart = null; } else {
      this.teststart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.testend = null; } else {
      this.testend = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.windowid = null; } else {
      this.windowid = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.trainstart = null; } else {
      this.trainstart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.teststart = null; } else {
      this.teststart = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.testend = null; } else {
      this.testend = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_window_dates o = (codegen_window_dates) super.clone();
    o.trainstart = (o.trainstart != null) ? (java.sql.Timestamp) o.trainstart.clone() : null;
    o.teststart = (o.teststart != null) ? (java.sql.Timestamp) o.teststart.clone() : null;
    o.testend = (o.testend != null) ? (java.sql.Timestamp) o.testend.clone() : null;
    return o;
  }

  public void clone0(codegen_window_dates o) throws CloneNotSupportedException {
    o.trainstart = (o.trainstart != null) ? (java.sql.Timestamp) o.trainstart.clone() : null;
    o.teststart = (o.teststart != null) ? (java.sql.Timestamp) o.teststart.clone() : null;
    o.testend = (o.testend != null) ? (java.sql.Timestamp) o.testend.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("windowid", this.windowid);
    __sqoop$field_map.put("trainstart", this.trainstart);
    __sqoop$field_map.put("teststart", this.teststart);
    __sqoop$field_map.put("testend", this.testend);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("windowid", this.windowid);
    __sqoop$field_map.put("trainstart", this.trainstart);
    __sqoop$field_map.put("teststart", this.teststart);
    __sqoop$field_map.put("testend", this.testend);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
