package com.v.Aopdemo.Entity;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String isim;
	private String soyisim;

	public Student() {
		super();
	}

	public Student(String isim, String soyisim) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
	}

	public String getIsim() {
		System.out.println("get isim called.");
		return isim;
	}

	public void setIsim(String isim) {
		System.out.println("set isim called.");
		this.isim = isim;
	}

	public String getSoyisim() {
		System.out.println("get soyisim called.");
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		System.out.println("set soyisim called.");
		this.soyisim = soyisim;
	}
	public String getAdSoyad() {
		return this.isim+" "+this.getSoyisim();
	}
	public void setAdSoyad(String Ad,String Soyad) {
		this.isim=Ad;
		this.soyisim=Soyad;
	}
	public Student getKanka() {
		Student st=new Student("osman", "yýldýz");
		return st;
	}
	
	
}
