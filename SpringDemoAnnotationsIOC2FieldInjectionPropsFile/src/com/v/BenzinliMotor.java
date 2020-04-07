package com.v;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BenzinliMotor implements Motor{
	
	
	@Value("${benzinli.hacim}") //dosyaya referans
	private int motorHacim;
	@Override
	public int getMotorHacmi() {
		
		return motorHacim;
	}

	@Override
	public int getGuc() {
		
		return 180;
	}

	@Override
	public int getTork() {
	
		return 200;
	}
	BenzinliMotor(){
		System.out.println("benzinli motor oluþtu");
	}

}
