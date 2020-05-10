package com.Entity.E;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity 
@Table(name = "EMPLOYEES")
public class Employees {
	@Id
	@SequenceGenerator(name = "emp_seq", sequenceName = "EMPLOYEES_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	@Column(name = "EMPLOYEE_ID")
	private Integer id;

	@NotEmpty(message="Bu Alan Zorunludur.")
	@Length(min=3, message="En Az 3 Harf Giriniz.")
	@Length(max=20, message="En Fazla 20 Karakter Olabilir.")
	@Pattern(regexp="^[a-zA-ZðüþöçýÝÐÜÞÖÇ ]+$", message="Sadece Harf Girilebilir.")
	@Column(name = "FIRST_NAME")
	private String firstName;

	@NotEmpty(message="Bu Alan Zorunludur.")
	@Length(min=3, message="En Az 3 Harf Giriniz.")
	@Length(max=20, message="En Fazla 20 Karakter Olabilir.")
	@Pattern(regexp="^[a-zA-ZðüþöçýÝÐÜÞÖÇ ]+$", message="Sadece Harf Girilebilir.")
	@Column(name = "LAST_NAME")
	private String lastName;

	@NotEmpty(message="Bu Alan Zorunludur.")
	@Length(min=3, message="En Az 3 Harf Giriniz.")
	@Length(max=20, message="En Fazla 30 Karakter Olabilir.")
	@Column(name = "EMAIL")
	private String email;
	
	//@Pattern(regexp="^[0-9]{3}+\\.+[0-9]{2}+\\.[0-9]{4}+\\.[0-9]{6}+$", message="***.**.****.****** Þeklinde Giriniz.")
	@NotEmpty(message="Bu Alan Zorunludur.")
	@Pattern(regexp="^[0-9]{3}+\\.+[0-9]{3}+\\.[0-9]{4}+$", message="***.***.**** Þeklinde Sayý Giriniz.")
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name = "HIRE_DATE")
	private Date date;

	@ManyToOne
	@JoinColumn(name = "JOB_ID")
	private Jobs job;

	@NotNull(message="Bu Alan Zorunludur.")
	@Column(name = "SALARY")
	private Double salary;

	
	@Column(name = "COMMISSION_PCT")
	private Double commissionPct;

	@ManyToOne
	@JoinColumn(name = "MANAGER_ID")
	private Employees manager;

	@ManyToOne
	@JoinColumn(name = "DEPARTMENT_ID")
	private Departments department;

	public Employees() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Jobs getJob() {
		return job;
	}

	public void setJob(Jobs job) {
		this.job = job;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getCommissionPct() {
		return commissionPct;
	}

	public void setCommissionPct(Double commissionPct) {
		this.commissionPct = commissionPct;
	}

	public Employees getManager() {
		return manager;
	}

	public void setManager(Employees manager) {
		this.manager = manager;
	}

	public Departments getDepartment() {
		return department;
	}

	public void setDepartment(Departments department) {
		this.department = department;
	}
}
