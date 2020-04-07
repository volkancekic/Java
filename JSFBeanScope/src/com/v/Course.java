package com.v;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Course {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String selectCourse(){
		if((name!=null) && name.equals("java")) {
			
			return "Java-home";
			
		}else {
			
			return "Python-home";
		}
	}
}
