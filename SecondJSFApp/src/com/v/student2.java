package com.v;

import java.util.HashMap;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class student2 {
	private HashMap<String, String> sehirler=new HashMap<String, String>();//plaka kodundan isim yazd�rmak i�in
	public student2() {
		System.out.println("default constructor");
		sehirler.put("06", "Ankara");
		sehirler.put("01", "Adana");
		sehirler.put("02", "Ad�yaman");
	}
	private String name;
	private String lastname;
	private String sehir;
	
	public String getSehir() {	
		System.out.println("getsehir �al��t�");
		//return sehir;		
		return (sehirler.get(sehir));
	}
	public void setSehir(String sehir) {
		System.out.println("setsehir �al��t�");
		this.sehir = sehir;
	}
	public String getName() {
		System.out.println("getname �al��t�");
		return name;
	}
	public void setName(String name) {
		System.out.println("setname �al��t�");
		this.name = name;
	}
	public String getLastname() {
		System.out.println("getlastname �al��t�");
		return lastname;
	}
	public void setLastname(String lastname) {
		System.out.println("setlastname �al��t�");
		this.lastname = lastname;
	}
	
}
