package com.v;

public class Mercedes {
	
	private String model;
	private Motor motor;
	
	
	public Mercedes() {
		
		System.out.println("mercedes olu�turuldu");
	
	}
	
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public void getMotorInfo() {
		System.out.println("Motor B�lgisi: "+" Motor: "+motor+" G��:"+motor.getGuc()+" Hacim:"+motor.getMotorHacmi()+" Tork:"+motor.getTork()+"\n");
	}



	@Override
	public String toString() {
		return "Mercedes [model=" + model + ", motor=" + motor + "]";
	}
	
	
	
}
