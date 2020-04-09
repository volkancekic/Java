package com.v;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="DEPARTMENTS")
public class Department {
	
	
	@Id	
	@Column(name="department_id")
	private Integer id;
	

	@Column(name="department_name")
	private String name;
	
	
	@Column(name="manager_id")
	private Integer manager_id;
	
	
	@Column(name="location_id")
	private Integer location_id;
	
	public Department(String name, Integer manager_id, Integer location_id) {
		
	
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
