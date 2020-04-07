package com.v;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		
		Arac arac=context.getBean("araba",Otomobil.class);
		arac.hizlan(10);
		System.out.println("güle güle");
		context.close();
		
	}

}
