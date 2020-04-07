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
		System.out.println("hayvan default constructor çalýþtý sonradan set edilecek deðerler");
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
		System.out.println("hayvan nefes alýp verir");
		
	}
	@Override
	public void olur() {
		System.out.println("hayvan ölür");
		
	}
	
	

}
