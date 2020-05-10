package com.v.Aopdemo.Entity;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String isim;

	public String getIsim() {
		System.out.println("get isim called.");
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
}
