package com.v;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OzlukDosyasiApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Personel p1=context.getBean("personel",Personel.class);
		
		System.out.println(p1);
		
		
		
		
		context.close();

	}

}
