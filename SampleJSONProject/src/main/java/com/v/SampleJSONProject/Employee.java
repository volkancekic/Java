package com.v.SampleJSONProject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {
	private String firstName;
	private String lastName;
	private int salary;
	public String getFirstName() {
		System.out.println("get firstName...");
		return firstName;
	}
	public void setFirstName(String firstName) {
		System.out.println("set firstName...");
		this.firstName = firstName;
	}
	public String getLastName() {
		System.out.println("get lastName...");
		return lastName;
	}
	public void setLastName(String lastName) {
		System.out.println("set lastName...");
		this.lastName = lastName;
	}
	public int getSalary() {
		System.out.println("get salary...");
		return salary;
	}
	public void setSalary(int salary) {
		System.out.println("set salary...");
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}
		
}
