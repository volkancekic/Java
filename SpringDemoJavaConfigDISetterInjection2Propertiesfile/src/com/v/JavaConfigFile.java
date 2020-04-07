package com.v;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:propertiesFile")
public class JavaConfigFile {
	
	@Bean
	public Motor benzin() {
		return new BenzinliMotor();
	}
	

	@Bean
	public Motor dizel() {
		return new DizelMotor();
	}
	
	
	@Bean
	public Mercedes mercedes() {
		Mercedes m=new Mercedes();
		m.setMotor(dizel());
		return m;
	}
}
