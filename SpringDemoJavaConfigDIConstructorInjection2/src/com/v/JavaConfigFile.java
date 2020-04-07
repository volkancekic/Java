package com.v;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

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
		Mercedes m=new Mercedes("clk350",dizel());
	
		return m;
	}
}
