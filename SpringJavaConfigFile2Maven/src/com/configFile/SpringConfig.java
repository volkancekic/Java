package com.configFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.configFileEntity.Personel;

@Configuration
@ComponentScan
public class SpringConfig {
	@Bean
	public Personel omer() {
		Personel p=new Personel();
		p.setIsim("ömer");
		p.setYas(43);
		return p;
		
	}
	
	@Bean
	public Personel personel() {
		return new Personel();
		
	}
}
