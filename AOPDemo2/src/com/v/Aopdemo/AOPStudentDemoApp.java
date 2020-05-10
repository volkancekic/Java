package com.v.Aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.v.Aopdemo.Entity.Student;

public class AOPStudentDemoApp {
	public static void main(String[] args) {
		
		
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AOPDemoConfig.class);
		System.out.println("context started.");
				
		
		/*Student s=context.getBean("student",Student.class);
		System.out.println("---------------------------");
		s.setAdSoyad("murat", "yýlmaz");		
		System.out.println(s.getAdSoyad());		
		System.out.println("---------------------------");*/
		
		
		//sonuca müdahale ettik @afterresulting'de
	
		Student stdnt=context.getBean("student",Student.class);
		Student kanka=stdnt.getKanka();
		//isim getKankadan osman gelirken müdahale sonucu hasan oldu
		System.out.println(kanka.getIsim()+""+kanka.getSoyisim());
		context.close();
		System.out.println("context closed.");
	
	}

}
