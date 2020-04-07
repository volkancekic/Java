package com.v;




import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class student4 {
	private String name;
	private String lastname;
	private String takim;
	
	
	
	
	
	
	
	public student4() {
		System.out.println("default constructor");
		
	}
	
	
	
	
	public String getTakim() {
		return takim;
	}




	public void setTakim(String takim) {
		this.takim = takim;
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
