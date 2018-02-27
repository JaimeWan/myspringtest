package com.jdbcspring;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import java.util.List;
//定义的 DAO 接口 StudentDAO 的实现类文件
public class StudentJDBCTemplate implements Dao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    @Override
    public void setDatasource(DataSource dataSource) {
        this.dataSource=dataSource;
        this.jdbcTemplateObject=new JdbcTemplate(dataSource);

    }

    @Override
    public Student getStudent(int ID) {
        String sql="select * from student where ID=?";
        Student student=jdbcTemplateObject.queryForObject(sql,new Object[]{ID},new StudentMapper());
           return student;
    }
    @Override
    public List<Student> listStudent() {
        String sql="select * from student";
        List<Student> students=jdbcTemplateObject.query(sql,new StudentMapper());
        return students;
    }
}
