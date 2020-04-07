package com.v;

public class Mercedes {
	
	String model;
	Motor motor;
	public Mercedes( Motor motor) {
		super();
		System.out.println("mercedes oluþturuldu");
		this.motor = motor;
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
		System.out.println("Motor BÝlgisi: "+" Motor: "+motor+" Güç:"+motor.getGuc()+" Hacim:"+motor.getMotorHacmi()+" Tork:"+motor.getTork()+"\n");
	}
	
	
}
