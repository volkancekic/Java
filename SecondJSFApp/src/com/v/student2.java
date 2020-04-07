package com.v;

import java.util.HashMap;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class student2 {
	private HashMap<String, String> sehirler=new HashMap<String, String>();//plaka kodundan isim yazdýrmak için
	public student2() {
		System.out.println("default constructor");
		sehirler.put("06", "Ankara");
		sehirler.put("01", "Adana");
		sehirler.put("02", "Adýyaman");
	}
	private String name;
	private String lastname;
	private String sehir;
	
	public String getSehir() {	
		System.out.println("getsehir çalýþtý");
		//return sehir;		
		return (sehirler.get(sehir));
	}
	public void setSehir(String sehir) {
		System.out.println("setsehir çalýþtý");
		this.sehir = sehir;
	}
	public String getName() {
		System.out.println("getname çalýþtý");
		return name;
	}
	public void setName(String name) {
		System.out.println("setname çalýþtý");
		this.name = name;
	}
	public String getLastname() {
		System.out.println("getlastname çalýþtý");
		return lastname;
	}
	public void setLastname(String lastname) {
		System.out.println("setlastname çalýþtý");
		this.lastname = lastname;
	}
	
}
