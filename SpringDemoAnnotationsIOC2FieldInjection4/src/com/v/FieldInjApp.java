package com.v;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FieldInjApp {	
	
	public static void main(String[] args) {
		//Mercedes m1=new Mercedes(new DizelMotor() );
		
		System.out.println();
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Mercedes mercedes=context.getBean("mercedes",Mercedes.class);
		mercedes.getMotorInfo();
		
	
	}
	
	
}
