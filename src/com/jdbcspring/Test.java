package com.jdbcspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;
//测试类
public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
        StudentJDBCTemplate studentJDBCTemplate=(StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
        List<Student> students=studentJDBCTemplate.listStudent();
        Iterator<Student> it=students.iterator();
        while (it.hasNext()){
            Student st=(Student) it.next();
            System.out.println("ID="+st.getID()+st.getName()+st.getOnlineID());
        }
    }
}
