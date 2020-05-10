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

@Entity 
@Table(name = "EMPLOYEES")
public class Employees {
	@Id
	@SequenceGenerator(name = "emp_seq", sequenceName = "EMPLOYEES_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	@Column(name = "EMPLOYEE_ID")
	private Integer id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@Column(name = "HIRE_DATE")
	private Date date;

	@ManyToOne
	@JoinColumn(name = "JOB_ID")
	private Jobs job;

	@Column(name = "SALARY")
	private Integer salary;

	@Column(name = "COMMISSION_PCT")
	private Integer commissionPct;

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

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getCommissionPct() {
		return commissionPct;
	}

	public void setCommissionPct(Integer commissionPct) {
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
