package com.configFileEntity;

public class Personel {
	
	public Personel() {
		System.out.println("personel default çalýþtý");
	}
	private String isim;
	private int yas;
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	@Override
	public String toString() {
		return "Personel [isim=" + isim + ", yas=" + yas + "]";
	}
	
	
	
}
