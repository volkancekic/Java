package com.v;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		
		Personel p=context.getBean("ali",Personel.class);

	}

}
