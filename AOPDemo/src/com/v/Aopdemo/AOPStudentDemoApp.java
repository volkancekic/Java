package com.v.Aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.v.Aopdemo.Entity.Student;

public class AOPStudentDemoApp {
	public static void main(String[] args) {
		
		
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AOPDemoConfig.class);
		System.out.println("context started.");
				
		
		Student s=context.getBean("student",Student.class);
		s.setIsim("alican");
		
		System.out.println(s.getIsim());
		
		
		context.close();
		System.out.println("context closed.");
		//getaspect2
		/*AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AOPDemoConfig.class);
		System.out.println("Context started");
		Student std = ctx.getBean("student",Student.class);
		ctx.close();
		System.out.println("Context closed");*/
	}

}
