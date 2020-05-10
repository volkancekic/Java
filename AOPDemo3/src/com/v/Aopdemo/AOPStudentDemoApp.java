package com.v.Aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.v.Aopdemo.Entity.Student;

public class AOPStudentDemoApp {
	public static void main(String[] args) {
		
		
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AOPDemoConfig.class);
		System.out.println("context started.");
				
		
		Student s=context.getBean("student",Student.class);
		s.setIsim("Murat");
		s.setSoyisim("Yýlmaz");
		//ErrorAspect kýsmý
		/*try {
			System.out.println(s.getId());
			System.out.println(s.getIsimSoyisim());
		} catch (Exception e) {
			//System.out.println(e);
		}*/
		
		//AroundAspect kýsmý
		System.out.println(s.getIsim());
		context.close();
		System.out.println("context closed.");
		
	}

}
