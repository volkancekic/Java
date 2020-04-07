package com.v;






import javax.faces.bean.ManagedBean;

@ManagedBean
public class student6 {
	private String name;
	private String lastname;
	private int age;
	
	public student6() {
		System.out.println("default constructor");
		
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
