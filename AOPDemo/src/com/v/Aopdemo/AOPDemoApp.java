package com.v.Aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.v.Aopdemo.DAO.StudentDAO;
import com.v.Aopdemo.Entity.Student;

public class AOPDemoApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AOPDemoConfig.class);
		System.out.println("context started.");
		
		StudentDAO stdntDAO=context.getBean("studentDAO",StudentDAO.class);
		stdntDAO.addStudent(new Student());	
		
		
		context.close();
		System.out.println("context closed.");
	}
}
