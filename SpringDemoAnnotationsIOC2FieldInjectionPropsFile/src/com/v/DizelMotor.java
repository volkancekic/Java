package com.v;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DizelMotor implements Motor{
	
	@Value("${dizel.hacim}") //dosyaya referans
	private int motorHacmi;
	
	@Override
	public int getMotorHacmi() {
		
		return motorHacmi;
	}

	@Override
	public int getGuc() {
		
		return 150;
	}

	@Override
	public int getTork() {
	
		return 250;
	}
	DizelMotor(){
		System.out.println("dizel motor oluþtu");
	}

}
