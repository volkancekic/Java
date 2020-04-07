package com.v;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigSetterInjApp {	
	
	public static void main(String[] args) {
		//Mercedes m1=new Mercedes(new DizelMotor() );
		
		System.out.println();
		
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfigFile.class);
	Mercedes m=context.getBean("mercedes",Mercedes.class);
	System.out.println(m);
		
	
	}
	
	
}
