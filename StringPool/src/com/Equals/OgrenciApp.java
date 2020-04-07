package com.Equals;

public class OgrenciApp {

	public static void main(String[] args) {
	
		Ogrenci ogr1=new Ogrenci(1, "Ali", "Yýldýz");
		Ogrenci ogr2=new Ogrenci(1, "Ali", "Yýldýz");
		
		System.out.println(ogr1==ogr2);
		System.out.println(ogr1.equals(ogr2));
		

	}

}
