package com.Entity.E;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JOBS")
public class Jobs {
	@Id
	@Column(name = "JOB_ID")
	private String id;
	
	@Column(name = "JOB_TITLE")
	private String title;

	public Jobs() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
			
}
