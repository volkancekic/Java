package com.Entity.E;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENTS")
public class Departments {
	@Id
	@Column(name = "DEPARTMENT_ID")
	private Integer id;
	
	@Column(name = "DEPARTMENT_NAME")
	private String name;

	public Departments() {
		super();
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
	
	
}
