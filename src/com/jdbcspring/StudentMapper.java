package com.jdbcspring;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {
    public Student mapRow(ResultSet rs, int rownum) throws SQLException {
    Student student=new Student();
        student.setID(rs.getInt("ID"));
        student.setName(rs.getString("name"));
        student.setOnlineID(rs.getString("onlineID"));
        student.setQQ(rs.getLong("QQ"));
        student.setSwear(rs.getString("swear"));
        return student;
}
}

