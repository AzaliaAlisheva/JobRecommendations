// ORM class for table 'jobs'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Apr 15 21:52:03 MSK 2026
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

public class codegen_jobs extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("jobid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_jobs.this.jobid = (Integer)value;
      }
    });
    setters.put("windowid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_jobs.this.windowid = (Integer)value;
      }
    });
    setters.put("title", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_jobs.this.title = (String)value;
      }
    });
    setters.put("description", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_jobs.this.description = (String)value;
      }
    });
    setters.put("requirements", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_jobs.this.requirements = (String)value;
      }
    });
    setters.put("city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_jobs.this.city = (String)value;
      }
    });
    setters.put("state", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_jobs.this.state = (String)value;
      }
    });
    setters.put("country", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_jobs.this.country = (String)value;
      }
    });
    setters.put("zipcode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_jobs.this.zipcode = (String)value;
      }
    });
    setters.put("start", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_jobs.this.start = (java.sql.Timestamp)value;
      }
    });
    setters.put("finish", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_jobs.this.finish = (java.sql.Timestamp)value;
      }
    });
  }
  public codegen_jobs() {
    init0();
  }
  private Integer jobid;
  public Integer get_jobid() {
    return jobid;
  }
  public void set_jobid(Integer jobid) {
    this.jobid = jobid;
  }
  public codegen_jobs with_jobid(Integer jobid) {
    this.jobid = jobid;
    return this;
  }
  private Integer windowid;
  public Integer get_windowid() {
    return windowid;
  }
  public void set_windowid(Integer windowid) {
    this.windowid = windowid;
  }
  public codegen_jobs with_windowid(Integer windowid) {
    this.windowid = windowid;
    return this;
  }
  private String title;
  public String get_title() {
    return title;
  }
  public void set_title(String title) {
    this.title = title;
  }
  public codegen_jobs with_title(String title) {
    this.title = title;
    return this;
  }
  private String description;
  public String get_description() {
    return description;
  }
  public void set_description(String description) {
    this.description = description;
  }
  public codegen_jobs with_description(String description) {
    this.description = description;
    return this;
  }
  private String requirements;
  public String get_requirements() {
    return requirements;
  }
  public void set_requirements(String requirements) {
    this.requirements = requirements;
  }
  public codegen_jobs with_requirements(String requirements) {
    this.requirements = requirements;
    return this;
  }
  private String city;
  public String get_city() {
    return city;
  }
  public void set_city(String city) {
    this.city = city;
  }
  public codegen_jobs with_city(String city) {
    this.city = city;
    return this;
  }
  private String state;
  public String get_state() {
    return state;
  }
  public void set_state(String state) {
    this.state = state;
  }
  public codegen_jobs with_state(String state) {
    this.state = state;
    return this;
  }
  private String country;
  public String get_country() {
    return country;
  }
  public void set_country(String country) {
    this.country = country;
  }
  public codegen_jobs with_country(String country) {
    this.country = country;
    return this;
  }
  private String zipcode;
  public String get_zipcode() {
    return zipcode;
  }
  public void set_zipcode(String zipcode) {
    this.zipcode = zipcode;
  }
  public codegen_jobs with_zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }
  private java.sql.Timestamp start;
  public java.sql.Timestamp get_start() {
    return start;
  }
  public void set_start(java.sql.Timestamp start) {
    this.start = start;
  }
  public codegen_jobs with_start(java.sql.Timestamp start) {
    this.start = start;
    return this;
  }
  private java.sql.Timestamp finish;
  public java.sql.Timestamp get_finish() {
    return finish;
  }
  public void set_finish(java.sql.Timestamp finish) {
    this.finish = finish;
  }
  public codegen_jobs with_finish(java.sql.Timestamp finish) {
    this.finish = finish;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_jobs)) {
      return false;
    }
    codegen_jobs that = (codegen_jobs) o;
    boolean equal = true;
    equal = equal && (this.jobid == null ? that.jobid == null : this.jobid.equals(that.jobid));
    equal = equal && (this.windowid == null ? that.windowid == null : this.windowid.equals(that.windowid));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.description == null ? that.description == null : this.description.equals(that.description));
    equal = equal && (this.requirements == null ? that.requirements == null : this.requirements.equals(that.requirements));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.zipcode == null ? that.zipcode == null : this.zipcode.equals(that.zipcode));
    equal = equal && (this.start == null ? that.start == null : this.start.equals(that.start));
    equal = equal && (this.finish == null ? that.finish == null : this.finish.equals(that.finish));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_jobs)) {
      return false;
    }
    codegen_jobs that = (codegen_jobs) o;
    boolean equal = true;
    equal = equal && (this.jobid == null ? that.jobid == null : this.jobid.equals(that.jobid));
    equal = equal && (this.windowid == null ? that.windowid == null : this.windowid.equals(that.windowid));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.description == null ? that.description == null : this.description.equals(that.description));
    equal = equal && (this.requirements == null ? that.requirements == null : this.requirements.equals(that.requirements));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.zipcode == null ? that.zipcode == null : this.zipcode.equals(that.zipcode));
    equal = equal && (this.start == null ? that.start == null : this.start.equals(that.start));
    equal = equal && (this.finish == null ? that.finish == null : this.finish.equals(that.finish));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.jobid = JdbcWritableBridge.readInteger(1, __dbResults);
    this.windowid = JdbcWritableBridge.readInteger(2, __dbResults);
    this.title = JdbcWritableBridge.readString(3, __dbResults);
    this.description = JdbcWritableBridge.readString(4, __dbResults);
    this.requirements = JdbcWritableBridge.readString(5, __dbResults);
    this.city = JdbcWritableBridge.readString(6, __dbResults);
    this.state = JdbcWritableBridge.readString(7, __dbResults);
    this.country = JdbcWritableBridge.readString(8, __dbResults);
    this.zipcode = JdbcWritableBridge.readString(9, __dbResults);
    this.start = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.finish = JdbcWritableBridge.readTimestamp(11, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.jobid = JdbcWritableBridge.readInteger(1, __dbResults);
    this.windowid = JdbcWritableBridge.readInteger(2, __dbResults);
    this.title = JdbcWritableBridge.readString(3, __dbResults);
    this.description = JdbcWritableBridge.readString(4, __dbResults);
    this.requirements = JdbcWritableBridge.readString(5, __dbResults);
    this.city = JdbcWritableBridge.readString(6, __dbResults);
    this.state = JdbcWritableBridge.readString(7, __dbResults);
    this.country = JdbcWritableBridge.readString(8, __dbResults);
    this.zipcode = JdbcWritableBridge.readString(9, __dbResults);
    this.start = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.finish = JdbcWritableBridge.readTimestamp(11, __dbResults);
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
    JdbcWritableBridge.writeInteger(jobid, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(windowid, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(title, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(description, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(requirements, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country, 8 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(zipcode, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(start, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(finish, 11 + __off, 93, __dbStmt);
    return 11;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(jobid, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(windowid, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(title, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(description, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(requirements, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country, 8 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(zipcode, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(start, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(finish, 11 + __off, 93, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.jobid = null;
    } else {
    this.jobid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.windowid = null;
    } else {
    this.windowid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.title = null;
    } else {
    this.title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.description = null;
    } else {
    this.description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.requirements = null;
    } else {
    this.requirements = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city = null;
    } else {
    this.city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.state = null;
    } else {
    this.state = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.country = null;
    } else {
    this.country = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.zipcode = null;
    } else {
    this.zipcode = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.start = null;
    } else {
    this.start = new Timestamp(__dataIn.readLong());
    this.start.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.finish = null;
    } else {
    this.finish = new Timestamp(__dataIn.readLong());
    this.finish.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.jobid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.jobid);
    }
    if (null == this.windowid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.windowid);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, description);
    }
    if (null == this.requirements) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, requirements);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country);
    }
    if (null == this.zipcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, zipcode);
    }
    if (null == this.start) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.start.getTime());
    __dataOut.writeInt(this.start.getNanos());
    }
    if (null == this.finish) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.finish.getTime());
    __dataOut.writeInt(this.finish.getNanos());
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.jobid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.jobid);
    }
    if (null == this.windowid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.windowid);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, description);
    }
    if (null == this.requirements) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, requirements);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.state) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, state);
    }
    if (null == this.country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country);
    }
    if (null == this.zipcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, zipcode);
    }
    if (null == this.start) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.start.getTime());
    __dataOut.writeInt(this.start.getNanos());
    }
    if (null == this.finish) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.finish.getTime());
    __dataOut.writeInt(this.finish.getNanos());
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
    __sb.append(FieldFormatter.escapeAndEnclose(jobid==null?"null":"" + jobid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(windowid==null?"null":"" + windowid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(description==null?"null":description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(requirements==null?"null":requirements, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zipcode==null?"null":zipcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start==null?"null":"" + start, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(finish==null?"null":"" + finish, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(jobid==null?"null":"" + jobid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(windowid==null?"null":"" + windowid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(description==null?"null":description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(requirements==null?"null":requirements, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zipcode==null?"null":zipcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start==null?"null":"" + start, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(finish==null?"null":"" + finish, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.jobid = null; } else {
      this.jobid = Integer.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.description = null; } else {
      this.description = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.requirements = null; } else {
      this.requirements = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.country = null; } else {
      this.country = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.zipcode = null; } else {
      this.zipcode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start = null; } else {
      this.start = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.finish = null; } else {
      this.finish = java.sql.Timestamp.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.jobid = null; } else {
      this.jobid = Integer.valueOf(__cur_str);
    }

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
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.description = null; } else {
      this.description = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.requirements = null; } else {
      this.requirements = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.state = null; } else {
      this.state = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.country = null; } else {
      this.country = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.zipcode = null; } else {
      this.zipcode = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start = null; } else {
      this.start = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.finish = null; } else {
      this.finish = java.sql.Timestamp.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_jobs o = (codegen_jobs) super.clone();
    o.start = (o.start != null) ? (java.sql.Timestamp) o.start.clone() : null;
    o.finish = (o.finish != null) ? (java.sql.Timestamp) o.finish.clone() : null;
    return o;
  }

  public void clone0(codegen_jobs o) throws CloneNotSupportedException {
    o.start = (o.start != null) ? (java.sql.Timestamp) o.start.clone() : null;
    o.finish = (o.finish != null) ? (java.sql.Timestamp) o.finish.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("jobid", this.jobid);
    __sqoop$field_map.put("windowid", this.windowid);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("description", this.description);
    __sqoop$field_map.put("requirements", this.requirements);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("zipcode", this.zipcode);
    __sqoop$field_map.put("start", this.start);
    __sqoop$field_map.put("finish", this.finish);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("jobid", this.jobid);
    __sqoop$field_map.put("windowid", this.windowid);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("description", this.description);
    __sqoop$field_map.put("requirements", this.requirements);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("zipcode", this.zipcode);
    __sqoop$field_map.put("start", this.start);
    __sqoop$field_map.put("finish", this.finish);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
