package com.sahis;

public class Musteri extends Sahis{

	String hesap;
	String adres;
	
	
	
	public Musteri(String hesap) {
		super();
		this.hesap = hesap;
	}
	public String getHesap() {
		return hesap;
	}
	public void setHesap(String hesap) {
		this.hesap = hesap;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	
}
