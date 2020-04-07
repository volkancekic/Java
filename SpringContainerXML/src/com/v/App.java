package com.v;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {	

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Canli insan1=context.getBean("ilkinsan",Insan.class);
		System.out.println("ilk insan bilgileri:"+insan1);
		insan1.dogar();
		insan1.solunum();
		insan1.olur();
		
		Canli insan2=context.getBean("sonrakiinsan",Insan.class);
		System.out.println("ikinci insan bilgileri:"+insan2);
		insan2.dogar();
		insan2.solunum();
		insan2.olur();
		
		Canli hayvan1=context.getBean("ilkhayvan",Hayvan.class);
		System.out.println("ilk hayvan bilgileri:"+hayvan1);
		hayvan1.dogar();
		hayvan1.solunum();
		hayvan1.olur();
		
		Canli bitki1=context.getBean("ilkbitki",Bitki.class);
		System.out.println("ilk bitkinin bilgileri:"+bitki1);
		bitki1.dogar();
		bitki1.solunum();
		bitki1.olur();
		
		System.out.println("Doðan solunum yapan ve ölen herþey canlýdýr mantýðý vardýr burada.");

	}

}
