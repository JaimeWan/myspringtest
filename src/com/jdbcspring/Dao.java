package com.jdbcspring;
// #定义表的数据操作接口
import javax.sql.DataSource;
import java.util.List;

public interface Dao {
    public void setDatasource(DataSource datasource);
    public Student getStudent(int ID);
    public List<Student> listStudent() ;
}
