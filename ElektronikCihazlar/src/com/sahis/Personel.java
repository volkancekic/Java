package com.sahis;

public class Personel extends Sahis{

	int id;
	String departman;
	
	
	
	public Personel(String isim, String soyisim, long tcno, char cinsiyet, int id, String departman) {
		super(isim, soyisim, tcno, cinsiyet);
		System.out.println("personel const çalıştı");
		this.id = id;
		this.departman = departman;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartman() {
		return departman;
	}
	public void setDepartman(String departman) {
		this.departman = departman;
	}
	@Override
	public String toString() {
		return super.toString()+"Personel [id=" + id + ", departman=" + departman + "]";
	}
	
	
	
}
