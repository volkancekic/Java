package com.v;

public class Hayvan implements Canli{
	private String cinsi;
	private int ayakSayisi;
	public String getCinsi() {
		return cinsi;
	}
	public void setCinsi(String cinsi) {
		this.cinsi = cinsi;
	}
	public int getAyakSayisi() {
		return ayakSayisi;
	}
	public void setAyakSayisi(int ayakSayisi) {
		this.ayakSayisi = ayakSayisi;
	}
	public Hayvan() {
		System.out.println("hayvan default constructor �al��t� sonradan set edilecek de�erler");
	}
	@Override
	public String toString() {
		return "Hayvan [cinsi=" + cinsi + ", ayakSayisi=" + ayakSayisi + "]";
	}
	@Override
	public void dogar() {
		System.out.println("hayvan dogar");
		
	}
	@Override
	public void solunum() {
		System.out.println("hayvan nefes al�p verir");
		
	}
	@Override
	public void olur() {
		System.out.println("hayvan �l�r");
		
	}
	
	

}
