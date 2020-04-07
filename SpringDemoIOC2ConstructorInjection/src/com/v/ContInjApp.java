package com.v;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContInjApp {	
	
	public static void main(String[] args) {
		//Mercedes m1=new Mercedes(new DizelMotor() );
		
		System.out.println();
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Mercedes mercedes=context.getBean("mercedes200",Mercedes.class);
		mercedes.getMotorInfo();
		
		Mercedes mercedes190d=context.getBean("mercedes190D",Mercedes.class);
		mercedes190d.getMotorInfo();
		
	}
	
	
}
