package com.v;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mercedes {
	
	@Value("${mercedes.model}")
	String model;
	@Autowired
	@Qualifier("benzinliMotor")
	Motor motor;
	
	/*public Mercedes( Motor motor) {
		super();
		System.out.println("mercedes oluþturuldu");
		this.motor = motor;
	}*/
	
	
	public Mercedes() {
		System.out.println("mercedes default constrctor");
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
	/*@Autowired
	public void setMotor(Motor motor) {
		System.out.println("setmotor çalýþtý");
		this.motor = motor;
	}
	*/
	public void getMotorInfo() {
		System.out.println("Motor BÝlgisi: "+" Motor: "+motor+" Güç:"+motor.getGuc()+" Hacim:"+motor.getMotorHacmi()+" Tork:"+motor.getTork()+"\n");
	}
	
	
}
