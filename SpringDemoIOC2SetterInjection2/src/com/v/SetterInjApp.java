package com.v;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjApp {	
	
	public static void main(String[] args) {
	
		
		
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
	
		
		
		Mercedes mercedes=context.getBean("mercedes300",Mercedes.class);
		mercedes.getMotorInfo();
		System.out.println(mercedes); //model bilgisini elle verdik bean de value ile..
		
		
	}
	
	
}
