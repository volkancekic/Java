package com.v;






import javax.faces.bean.ManagedBean;

@ManagedBean
public class student5 {
	private String name;
	private String lastname;
	
	private String[] hobiler;
	public student5() {
		System.out.println("default constructor");
		
		
	}


	
	public String[] getHobiler() {
		return hobiler;
	}


	public void setHobiler(String[] hobiler) {
		this.hobiler = hobiler;
	}


	

	public String getName() {
		System.out.println("getname �al��t�");
		return name;
	}
	public void setName(String name) {
		System.out.println("setname �al��t�");
		this.name = name;
	}
	public String getLastname() {
		System.out.println("getlastname �al��t�");
		return lastname;
	}
	public void setLastname(String lastname) {
		System.out.println("setlastname �al��t�");
		this.lastname = lastname;
	}



}
