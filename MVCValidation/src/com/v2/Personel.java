package com.v2;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;








public class Personel {
	@NotEmpty(message="bu alan zorunludur")
	private String firstname;
	private String lastname;
	private String department;
	private String gender;
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="uygun formatta degil!")
	private String postalCode;
	@Range(min=100,max=10000,message="maaþ 100 ile 1000 arasý olmalýdýr.")
	private Integer salary;
	private String[] sideBenefits;//yan haklar
	
	private LinkedHashMap<String,String> departments;//departmanlarýn listesi
	
	public Personel() {
		System.out.println("contructor çalýþtý");
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
	
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String[] getSideBenefits() {
		return sideBenefits;
	}
	public void setSideBenefits(String[] sideBenefits) {
		this.sideBenefits = sideBenefits;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	
	
	
	
}
