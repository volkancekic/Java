package com.v;

public class DizelMotor implements Motor{

	@Override
	public int getMotorHacmi() {
		
		return 1500;
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
