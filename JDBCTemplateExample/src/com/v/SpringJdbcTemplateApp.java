package com.v;

import com.v.dao.SpringJdbcDaoImpl;
import com.v.model.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJdbcTemplateApp {
    public static void main(String[] args) {

        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        SpringJdbcDaoImpl dao=ctx.getBean("springJdbcDaoImpl",SpringJdbcDaoImpl.class);

        System.out.println(dao.getDeptCount());
        System.out.println(dao.getDeptName(10));
        System.out.println(dao.getDepartment(30));
        Department department=new Department(500,"Java Course");
        dao.InsertDepartment(department);
        System.out.println("-Department list -");
        for(Department dept:dao.listOfDepartments()){
            System.out.println(dept);
        }
    }

}
