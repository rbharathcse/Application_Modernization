package com.day_9;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.format.number.CurrencyStyleFormatter;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-demo-config.xml");
        
//        Student student = (Student)context.getBean("student",Student.class);
        
        CustomerDao cst = (CustomerDao) context.getBean("daoObject",CustomerDao.class);
        
        cst.selectAllRows();
        
        
        
    }
}
