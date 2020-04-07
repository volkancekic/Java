package com.configFile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configFileEntity.Personel;

public class ConfigFileApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Personel omer=context.getBean("omer",Personel.class);
		System.out.println(omer);
		
		Personel p1=context.getBean("personel",Personel.class);
		System.out.println(p1);
		
	}

}
