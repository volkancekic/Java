package com.Ogrenci;

public class Ogrenci {

	
	public static int id1=100;
	int id;
	String name;
	public Ogrenci(String name) {
		super();
		id=id1++; //�nce ata sonra art�r.
		this.name = name;
	}
	
}
