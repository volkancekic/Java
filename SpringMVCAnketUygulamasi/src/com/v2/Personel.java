package com.v2;

import java.util.LinkedHashMap;

public class Personel {
	
	private String firstname;
	private String lastname;
	private String department;
	private String gender;
	private String[] sideBenefits;//yan haklar
	
	private LinkedHashMap<String,String> departments;//departmanların listesi
	
	public Personel() {
		System.out.println("contructor çalıştı");
		departments=new LinkedHashMap<String, String>();
		departments.put("HR", "Human Resources");
		departments.put("AC", "Accounting");
		departments.put("SA", "Sales");
		departments.put("PR", "Production");
		
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public LinkedHashMap<String, String> getDepartments() {
		return departments;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getSideBenefits() {
		return sideBenefits;
	}
	public void setSideBenefits(String[] sideBenefits) {
		this.sideBenefits = sideBenefits;
	}
	
	
	
	
}
