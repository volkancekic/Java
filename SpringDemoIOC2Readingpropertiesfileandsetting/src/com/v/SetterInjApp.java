package com.v;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjApp {	
	
	public static void main(String[] args) {
		//Mercedes m1=new Mercedes(new DizelMotor() );
		
		System.out.println("buradaki her iki iþlemde ayný þeyi yapar\n");
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Motor motor=new BenzinliMotor();
		Mercedes m=new Mercedes();
		m.setMotor(motor);
		m.getMotorInfo();
		
		System.out.println("");
		
		
		Mercedes mercedes=context.getBean("mercedes200",Mercedes.class);
		mercedes.getMotorInfo();
		System.out.println(mercedes); //model bilgisini elle verdik bean de value ile..
		
		
	}
	
	
}
