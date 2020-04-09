package com.vEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENTS")
public class Department {
	
	
	@Id	
	@SequenceGenerator(name="dept_seq",sequenceName="DEPARTMENTS_SEQ",allocationSize = 10)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="dept_seq")
	@Column(name="department_id")
	private Integer id;
	
	@Column(name="department_name")
	private String name;
	
	@Column(name="manager_id")
	private Integer manager_id;
	
	@Column(name="location_id")
	private Integer location_id;
	
	public Department(String name, Integer manager_id, Integer location_id) {
		
	//id yok sequence kullanýlcak, elle vermedik
		this.name = name;
		this.manager_id = manager_id;
		this.location_id = location_id;
	}
	
	public Department() {
		
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getManager_id() {
		return manager_id;
	}
	public void setManager_id(Integer manager_id) {
		this.manager_id = manager_id;
	}
	public Integer getLocation_id() {
		return location_id;
	}
	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}
	
	
	
}
