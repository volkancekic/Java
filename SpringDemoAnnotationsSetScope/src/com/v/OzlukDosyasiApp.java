package com.v;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OzlukDosyasiApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("personel singleton,ogrenci prototype");
		Personel p1=context.getBean("personel",Personel.class);
		
		System.out.println(p1);
		Personel p2=context.getBean("personel",Personel.class);
		
		System.out.println(p2);
		System.out.println("personellerin adresi aynýmý?"+(p1==p2));
		
		Ogrenci o1=context.getBean("ogrenci",Ogrenci.class);
		
		System.out.println(o1);
		Ogrenci o2=context.getBean("ogrenci",Ogrenci.class);
		
		System.out.println(o2);
		System.out.println("ogrencilerin adresi aynýmý?"+(o1==o2));
		
		//personellerin hepsine ayný adresli personel nesnesini verir
		//ogrencide her seferinde farklý adrese sahip nesne verir
		o1.destroyOgrenci();
		o2.destroyOgrenci();
		context.close();

	}

}
