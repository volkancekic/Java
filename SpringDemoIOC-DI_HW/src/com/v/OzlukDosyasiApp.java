package com.v;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OzlukDosyasiApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Personel p1=context.getBean("ali",Personel.class);
		
		System.out.println(p1);
		
		Personel p2=context.getBean("veli",Personel.class);
		
		System.out.println(p2);
		
		Personel p3=context.getBean("yeni_baskan",Personel.class);
		
		System.out.println(p3);
		
		context.close();

	}

}
