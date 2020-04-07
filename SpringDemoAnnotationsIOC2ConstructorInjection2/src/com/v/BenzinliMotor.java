package com.v;

import org.springframework.stereotype.Component;


public class BenzinliMotor implements Motor{

	@Override
	public int getMotorHacmi() {
		
		return 2000;
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
