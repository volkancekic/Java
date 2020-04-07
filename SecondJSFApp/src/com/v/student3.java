package com.v;




import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class student3 {
	private String name;
	private String lastname;
	private String sehir;
	
	private static List<String> cities;
	
	
	static {
		cities=new ArrayList<String>();
		cities.add("ankara");
		cities.add("adana");
		cities.add("amasya");
	}
	
	
	
	public student3() {
		System.out.println("default constructor");
		
	}
	
	
	
	public String getSehir() {	
		System.out.println("getsehir �al��t�");
		return sehir;		
		
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



	public List<String> getCities() {
		return cities;
	}



	public void setCities(List<String> cities) {
		this.cities = cities;
	}

}
