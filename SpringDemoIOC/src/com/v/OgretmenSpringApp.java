package com.v;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OgretmenSpringApp {

	public static void main(String[] args) {
		System.out.println("merhaba");
		
			//Ogretmen hoca=new FenOgretmeni();
			//hoca.neDersin();
		
		
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Ogretmen hoca=context.getBean("turkceci",Ogretmen.class);
		hoca.neDersin();
		hoca=context.getBean("fenci",Ogretmen.class);
		hoca.neDersin();
		
		
		System.out.println("güle güle");
	}

}
