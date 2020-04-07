package com.Ogrenci;

public class Ogrenci {

	
	public static int id1=100;
	int id;
	String name;
	public Ogrenci(String name) {
		super();
		id=id1++; //önce ata sonra artýr.
		this.name = name;
	}
	
}
