package com.v;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Mercedes {
	
	
	String model;
	Motor motor;
	
	
	
	
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
	
	public void setMotor(Motor motor) {
		System.out.println("setmotor �al��t�");
		this.motor = motor;
	}

	public void setVars(Motor motor) {
		model="500l";
		System.out.println("setvars �al��t�");
	}
	public void getMotorInfo() {
		System.out.println("Motor B�lgisi: "+" Motor: "+motor+" G��:"+motor.getGuc()+" Hacim:"+motor.getMotorHacmi()+" Tork:"+motor.getTork()+"\n");
	}
	@Override
	public String toString() {
		return "Mercedes [model=" + model + ", motor=" + motor + "]";
	}
	
	
}
