// ORM class for table 'users'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Apr 15 21:51:14 MSK 2026
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

public class codegen_users extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("userid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_users.this.userid = (Integer)value;
      }
    });
    setters.put("windowid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_users.this.windowid = (Integer)value;
      }
    });
    setters.put("split", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_users.this.split = (String)value;
      }
    });
    setters.put("city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_users.this.city = (String)value;
      }
    });
    setters.put("state", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_users.this.state = (String)value;
      }
    });
    setters.put("country", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_users.this.country = (String)value;
      }
    });
    setters.put("zipcode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_users.this.zipcode = (String)value;
      }
    });
    setters.put("degree", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_users.this.degree = (String)value;
      }
    });
    setters.put("major", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_users.this.major = (String)value;
      }
    });
    setters.put("graddate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_users.this.graddate = (java.sql.Timestamp)value;
      }
    });
    setters.put("jobcnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_users.this.jobcnt = (Integer)value;
      }
    });
    setters.put("yearsexp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_users.this.yearsexp = (Integer)value;
      }
    });
    setters.put("employed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_users.this.employed = (Boolean)value;
      }
    });
    setters.put("managerexp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_users.this.managerexp = (Boolean)value;
      }
    });
    setters.put("emplcnt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_users.this.emplcnt = (Integer)value;
      }
    });
  }
  public codegen_users() {
    init0();
  }
  private Integer userid;
  public Integer get_userid() {
    return userid;
  }
  public void set_userid(Integer userid) {
    this.userid = userid;
  }
  public codegen_users with_userid(Integer userid) {
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
  public codegen_users with_windowid(Integer windowid) {
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
  public codegen_users with_split(String split) {
    this.split = split;
    return this;
  }
  private String city;
  public String get_city() {
    return city;
  }
  public void set_city(String city) {
    this.city = city;
  }
  public codegen_users with_city(String city) {
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
  public codegen_users with_state(String state) {
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
  public codegen_users with_country(String country) {
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
  public codegen_users with_zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }
  private String degree;
  public String get_degree() {
    return degree;
  }
  public void set_degree(String degree) {
    this.degree = degree;
  }
  public codegen_users with_degree(String degree) {
    this.degree = degree;
    return this;
  }
  private String major;
  public String get_major() {
    return major;
  }
  public void set_major(String major) {
    this.major = major;
  }
  public codegen_users with_major(String major) {
    this.major = major;
    return this;
  }
  private java.sql.Timestamp graddate;
  public java.sql.Timestamp get_graddate() {
    return graddate;
  }
  public void set_graddate(java.sql.Timestamp graddate) {
    this.graddate = graddate;
  }
  public codegen_users with_graddate(java.sql.Timestamp graddate) {
    this.graddate = graddate;
    return this;
  }
  private Integer jobcnt;
  public Integer get_jobcnt() {
    return jobcnt;
  }
  public void set_jobcnt(Integer jobcnt) {
    this.jobcnt = jobcnt;
  }
  public codegen_users with_jobcnt(Integer jobcnt) {
    this.jobcnt = jobcnt;
    return this;
  }
  private Integer yearsexp;
  public Integer get_yearsexp() {
    return yearsexp;
  }
  public void set_yearsexp(Integer yearsexp) {
    this.yearsexp = yearsexp;
  }
  public codegen_users with_yearsexp(Integer yearsexp) {
    this.yearsexp = yearsexp;
    return this;
  }
  private Boolean employed;
  public Boolean get_employed() {
    return employed;
  }
  public void set_employed(Boolean employed) {
    this.employed = employed;
  }
  public codegen_users with_employed(Boolean employed) {
    this.employed = employed;
    return this;
  }
  private Boolean managerexp;
  public Boolean get_managerexp() {
    return managerexp;
  }
  public void set_managerexp(Boolean managerexp) {
    this.managerexp = managerexp;
  }
  public codegen_users with_managerexp(Boolean managerexp) {
    this.managerexp = managerexp;
    return this;
  }
  private Integer emplcnt;
  public Integer get_emplcnt() {
    return emplcnt;
  }
  public void set_emplcnt(Integer emplcnt) {
    this.emplcnt = emplcnt;
  }
  public codegen_users with_emplcnt(Integer emplcnt) {
    this.emplcnt = emplcnt;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_users)) {
      return false;
    }
    codegen_users that = (codegen_users) o;
    boolean equal = true;
    equal = equal && (this.userid == null ? that.userid == null : this.userid.equals(that.userid));
    equal = equal && (this.windowid == null ? that.windowid == null : this.windowid.equals(that.windowid));
    equal = equal && (this.split == null ? that.split == null : this.split.equals(that.split));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.zipcode == null ? that.zipcode == null : this.zipcode.equals(that.zipcode));
    equal = equal && (this.degree == null ? that.degree == null : this.degree.equals(that.degree));
    equal = equal && (this.major == null ? that.major == null : this.major.equals(that.major));
    equal = equal && (this.graddate == null ? that.graddate == null : this.graddate.equals(that.graddate));
    equal = equal && (this.jobcnt == null ? that.jobcnt == null : this.jobcnt.equals(that.jobcnt));
    equal = equal && (this.yearsexp == null ? that.yearsexp == null : this.yearsexp.equals(that.yearsexp));
    equal = equal && (this.employed == null ? that.employed == null : this.employed.equals(that.employed));
    equal = equal && (this.managerexp == null ? that.managerexp == null : this.managerexp.equals(that.managerexp));
    equal = equal && (this.emplcnt == null ? that.emplcnt == null : this.emplcnt.equals(that.emplcnt));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_users)) {
      return false;
    }
    codegen_users that = (codegen_users) o;
    boolean equal = true;
    equal = equal && (this.userid == null ? that.userid == null : this.userid.equals(that.userid));
    equal = equal && (this.windowid == null ? that.windowid == null : this.windowid.equals(that.windowid));
    equal = equal && (this.split == null ? that.split == null : this.split.equals(that.split));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.state == null ? that.state == null : this.state.equals(that.state));
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.zipcode == null ? that.zipcode == null : this.zipcode.equals(that.zipcode));
    equal = equal && (this.degree == null ? that.degree == null : this.degree.equals(that.degree));
    equal = equal && (this.major == null ? that.major == null : this.major.equals(that.major));
    equal = equal && (this.graddate == null ? that.graddate == null : this.graddate.equals(that.graddate));
    equal = equal && (this.jobcnt == null ? that.jobcnt == null : this.jobcnt.equals(that.jobcnt));
    equal = equal && (this.yearsexp == null ? that.yearsexp == null : this.yearsexp.equals(that.yearsexp));
    equal = equal && (this.employed == null ? that.employed == null : this.employed.equals(that.employed));
    equal = equal && (this.managerexp == null ? that.managerexp == null : this.managerexp.equals(that.managerexp));
    equal = equal && (this.emplcnt == null ? that.emplcnt == null : this.emplcnt.equals(that.emplcnt));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.userid = JdbcWritableBridge.readInteger(1, __dbResults);
    this.windowid = JdbcWritableBridge.readInteger(2, __dbResults);
    this.split = JdbcWritableBridge.readString(3, __dbResults);
    this.city = JdbcWritableBridge.readString(4, __dbResults);
    this.state = JdbcWritableBridge.readString(5, __dbResults);
    this.country = JdbcWritableBridge.readString(6, __dbResults);
    this.zipcode = JdbcWritableBridge.readString(7, __dbResults);
    this.degree = JdbcWritableBridge.readString(8, __dbResults);
    this.major = JdbcWritableBridge.readString(9, __dbResults);
    this.graddate = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.jobcnt = JdbcWritableBridge.readInteger(11, __dbResults);
    this.yearsexp = JdbcWritableBridge.readInteger(12, __dbResults);
    this.employed = JdbcWritableBridge.readBoolean(13, __dbResults);
    this.managerexp = JdbcWritableBridge.readBoolean(14, __dbResults);
    this.emplcnt = JdbcWritableBridge.readInteger(15, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.userid = JdbcWritableBridge.readInteger(1, __dbResults);
    this.windowid = JdbcWritableBridge.readInteger(2, __dbResults);
    this.split = JdbcWritableBridge.readString(3, __dbResults);
    this.city = JdbcWritableBridge.readString(4, __dbResults);
    this.state = JdbcWritableBridge.readString(5, __dbResults);
    this.country = JdbcWritableBridge.readString(6, __dbResults);
    this.zipcode = JdbcWritableBridge.readString(7, __dbResults);
    this.degree = JdbcWritableBridge.readString(8, __dbResults);
    this.major = JdbcWritableBridge.readString(9, __dbResults);
    this.graddate = JdbcWritableBridge.readTimestamp(10, __dbResults);
    this.jobcnt = JdbcWritableBridge.readInteger(11, __dbResults);
    this.yearsexp = JdbcWritableBridge.readInteger(12, __dbResults);
    this.employed = JdbcWritableBridge.readBoolean(13, __dbResults);
    this.managerexp = JdbcWritableBridge.readBoolean(14, __dbResults);
    this.emplcnt = JdbcWritableBridge.readInteger(15, __dbResults);
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
    JdbcWritableBridge.writeString(city, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(zipcode, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(degree, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(major, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(graddate, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(jobcnt, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(yearsexp, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBoolean(employed, 13 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(managerexp, 14 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeInteger(emplcnt, 15 + __off, 4, __dbStmt);
    return 15;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(userid, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(windowid, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(split, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(state, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(zipcode, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(degree, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(major, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(graddate, 10 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(jobcnt, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(yearsexp, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBoolean(employed, 13 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(managerexp, 14 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeInteger(emplcnt, 15 + __off, 4, __dbStmt);
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
        this.degree = null;
    } else {
    this.degree = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.major = null;
    } else {
    this.major = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.graddate = null;
    } else {
    this.graddate = new Timestamp(__dataIn.readLong());
    this.graddate.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.jobcnt = null;
    } else {
    this.jobcnt = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.yearsexp = null;
    } else {
    this.yearsexp = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.employed = null;
    } else {
    this.employed = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.managerexp = null;
    } else {
    this.managerexp = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.emplcnt = null;
    } else {
    this.emplcnt = Integer.valueOf(__dataIn.readInt());
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
    if (null == this.degree) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, degree);
    }
    if (null == this.major) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, major);
    }
    if (null == this.graddate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.graddate.getTime());
    __dataOut.writeInt(this.graddate.getNanos());
    }
    if (null == this.jobcnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.jobcnt);
    }
    if (null == this.yearsexp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.yearsexp);
    }
    if (null == this.employed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.employed);
    }
    if (null == this.managerexp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.managerexp);
    }
    if (null == this.emplcnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.emplcnt);
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
    if (null == this.degree) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, degree);
    }
    if (null == this.major) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, major);
    }
    if (null == this.graddate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.graddate.getTime());
    __dataOut.writeInt(this.graddate.getNanos());
    }
    if (null == this.jobcnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.jobcnt);
    }
    if (null == this.yearsexp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.yearsexp);
    }
    if (null == this.employed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.employed);
    }
    if (null == this.managerexp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.managerexp);
    }
    if (null == this.emplcnt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.emplcnt);
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
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zipcode==null?"null":zipcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(degree==null?"null":degree, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(major==null?"null":major, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(graddate==null?"null":"" + graddate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(jobcnt==null?"null":"" + jobcnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(yearsexp==null?"null":"" + yearsexp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(employed==null?"null":"" + employed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(managerexp==null?"null":"" + managerexp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(emplcnt==null?"null":"" + emplcnt, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(state==null?"null":state, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(zipcode==null?"null":zipcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(degree==null?"null":degree, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(major==null?"null":major, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(graddate==null?"null":"" + graddate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(jobcnt==null?"null":"" + jobcnt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(yearsexp==null?"null":"" + yearsexp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(employed==null?"null":"" + employed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(managerexp==null?"null":"" + managerexp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(emplcnt==null?"null":"" + emplcnt, delimiters));
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
    if (__cur_str.equals("null")) { this.degree = null; } else {
      this.degree = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.major = null; } else {
      this.major = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.graddate = null; } else {
      this.graddate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.jobcnt = null; } else {
      this.jobcnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.yearsexp = null; } else {
      this.yearsexp = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.employed = null; } else {
      this.employed = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.managerexp = null; } else {
      this.managerexp = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.emplcnt = null; } else {
      this.emplcnt = Integer.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.degree = null; } else {
      this.degree = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.major = null; } else {
      this.major = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.graddate = null; } else {
      this.graddate = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.jobcnt = null; } else {
      this.jobcnt = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.yearsexp = null; } else {
      this.yearsexp = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.employed = null; } else {
      this.employed = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.managerexp = null; } else {
      this.managerexp = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.emplcnt = null; } else {
      this.emplcnt = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_users o = (codegen_users) super.clone();
    o.graddate = (o.graddate != null) ? (java.sql.Timestamp) o.graddate.clone() : null;
    return o;
  }

  public void clone0(codegen_users o) throws CloneNotSupportedException {
    o.graddate = (o.graddate != null) ? (java.sql.Timestamp) o.graddate.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("userid", this.userid);
    __sqoop$field_map.put("windowid", this.windowid);
    __sqoop$field_map.put("split", this.split);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("zipcode", this.zipcode);
    __sqoop$field_map.put("degree", this.degree);
    __sqoop$field_map.put("major", this.major);
    __sqoop$field_map.put("graddate", this.graddate);
    __sqoop$field_map.put("jobcnt", this.jobcnt);
    __sqoop$field_map.put("yearsexp", this.yearsexp);
    __sqoop$field_map.put("employed", this.employed);
    __sqoop$field_map.put("managerexp", this.managerexp);
    __sqoop$field_map.put("emplcnt", this.emplcnt);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("userid", this.userid);
    __sqoop$field_map.put("windowid", this.windowid);
    __sqoop$field_map.put("split", this.split);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("state", this.state);
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("zipcode", this.zipcode);
    __sqoop$field_map.put("degree", this.degree);
    __sqoop$field_map.put("major", this.major);
    __sqoop$field_map.put("graddate", this.graddate);
    __sqoop$field_map.put("jobcnt", this.jobcnt);
    __sqoop$field_map.put("yearsexp", this.yearsexp);
    __sqoop$field_map.put("employed", this.employed);
    __sqoop$field_map.put("managerexp", this.managerexp);
    __sqoop$field_map.put("emplcnt", this.emplcnt);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
