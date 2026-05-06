// ORM class for table 'user_history'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Apr 15 21:51:33 MSK 2026
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

public class codegen_user_history extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("userid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_user_history.this.userid = (Integer)value;
      }
    });
    setters.put("windowid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_user_history.this.windowid = (Integer)value;
      }
    });
    setters.put("split", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_user_history.this.split = (String)value;
      }
    });
    setters.put("sequence", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_user_history.this.sequence = (Integer)value;
      }
    });
    setters.put("jobtitle", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_user_history.this.jobtitle = (String)value;
      }
    });
  }
  public codegen_user_history() {
    init0();
  }
  private Integer userid;
  public Integer get_userid() {
    return userid;
  }
  public void set_userid(Integer userid) {
    this.userid = userid;
  }
  public codegen_user_history with_userid(Integer userid) {
    this.userid = userid;
    return this;
  }
  private Integer windowid;
  public Integer get_windowid() {
    return windowid;
  }
  public void set_windowid(Integer windowid) {
    this.windowid = windowid;
  }
  public codegen_user_history with_windowid(Integer windowid) {
    this.windowid = windowid;
    return this;
  }
  private String split;
  public String get_split() {
    return split;
  }
  public void set_split(String split) {
    this.split = split;
  }
  public codegen_user_history with_split(String split) {
    this.split = split;
    return this;
  }
  private Integer sequence;
  public Integer get_sequence() {
    return sequence;
  }
  public void set_sequence(Integer sequence) {
    this.sequence = sequence;
  }
  public codegen_user_history with_sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }
  private String jobtitle;
  public String get_jobtitle() {
    return jobtitle;
  }
  public void set_jobtitle(String jobtitle) {
    this.jobtitle = jobtitle;
  }
  public codegen_user_history with_jobtitle(String jobtitle) {
    this.jobtitle = jobtitle;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_user_history)) {
      return false;
    }
    codegen_user_history that = (codegen_user_history) o;
    boolean equal = true;
    equal = equal && (this.userid == null ? that.userid == null : this.userid.equals(that.userid));
    equal = equal && (this.windowid == null ? that.windowid == null : this.windowid.equals(that.windowid));
    equal = equal && (this.split == null ? that.split == null : this.split.equals(that.split));
    equal = equal && (this.sequence == null ? that.sequence == null : this.sequence.equals(that.sequence));
    equal = equal && (this.jobtitle == null ? that.jobtitle == null : this.jobtitle.equals(that.jobtitle));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_user_history)) {
      return false;
    }
    codegen_user_history that = (codegen_user_history) o;
    boolean equal = true;
    equal = equal && (this.userid == null ? that.userid == null : this.userid.equals(that.userid));
    equal = equal && (this.windowid == null ? that.windowid == null : this.windowid.equals(that.windowid));
    equal = equal && (this.split == null ? that.split == null : this.split.equals(that.split));
    equal = equal && (this.sequence == null ? that.sequence == null : this.sequence.equals(that.sequence));
    equal = equal && (this.jobtitle == null ? that.jobtitle == null : this.jobtitle.equals(that.jobtitle));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.userid = JdbcWritableBridge.readInteger(1, __dbResults);
    this.windowid = JdbcWritableBridge.readInteger(2, __dbResults);
    this.split = JdbcWritableBridge.readString(3, __dbResults);
    this.sequence = JdbcWritableBridge.readInteger(4, __dbResults);
    this.jobtitle = JdbcWritableBridge.readString(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.userid = JdbcWritableBridge.readInteger(1, __dbResults);
    this.windowid = JdbcWritableBridge.readInteger(2, __dbResults);
    this.split = JdbcWritableBridge.readString(3, __dbResults);
    this.sequence = JdbcWritableBridge.readInteger(4, __dbResults);
    this.jobtitle = JdbcWritableBridge.readString(5, __dbResults);
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
    JdbcWritableBridge.writeInteger(userid, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(windowid, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(split, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(sequence, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(jobtitle, 5 + __off, 12, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(userid, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(windowid, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(split, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(sequence, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(jobtitle, 5 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.userid = null;
    } else {
    this.userid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.windowid = null;
    } else {
    this.windowid = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.split = null;
    } else {
    this.split = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.sequence = null;
    } else {
    this.sequence = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.jobtitle = null;
    } else {
    this.jobtitle = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.userid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.userid);
    }
    if (null == this.windowid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.windowid);
    }
    if (null == this.split) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, split);
    }
    if (null == this.sequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.sequence);
    }
    if (null == this.jobtitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, jobtitle);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.userid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.userid);
    }
    if (null == this.windowid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.windowid);
    }
    if (null == this.split) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, split);
    }
    if (null == this.sequence) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.sequence);
    }
    if (null == this.jobtitle) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, jobtitle);
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
    __sb.append(FieldFormatter.escapeAndEnclose(userid==null?"null":"" + userid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(windowid==null?"null":"" + windowid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(split==null?"null":split, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sequence==null?"null":"" + sequence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(jobtitle==null?"null":jobtitle, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(userid==null?"null":"" + userid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(windowid==null?"null":"" + windowid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(split==null?"null":split, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(sequence==null?"null":"" + sequence, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(jobtitle==null?"null":jobtitle, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.userid = null; } else {
      this.userid = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.split = null; } else {
      this.split = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sequence = null; } else {
      this.sequence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.jobtitle = null; } else {
      this.jobtitle = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.userid = null; } else {
      this.userid = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.split = null; } else {
      this.split = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.sequence = null; } else {
      this.sequence = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.jobtitle = null; } else {
      this.jobtitle = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_user_history o = (codegen_user_history) super.clone();
    return o;
  }

  public void clone0(codegen_user_history o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("userid", this.userid);
    __sqoop$field_map.put("windowid", this.windowid);
    __sqoop$field_map.put("split", this.split);
    __sqoop$field_map.put("sequence", this.sequence);
    __sqoop$field_map.put("jobtitle", this.jobtitle);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("userid", this.userid);
    __sqoop$field_map.put("windowid", this.windowid);
    __sqoop$field_map.put("split", this.split);
    __sqoop$field_map.put("sequence", this.sequence);
    __sqoop$field_map.put("jobtitle", this.jobtitle);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
