package com.v;

public class Bitki implements Canli{
	private String renk;
	private String isim;
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	@Override
	public String toString() {
		return "Bitki [renk=" + renk + ", isim=" + isim + "]";
	}
	public Bitki(String renk, String isim) {
	System.out.println("bitki constructor çalýþtý renk ve isim parametresi var");
		this.renk = renk;
		this.isim = isim;
	}
	@Override
	public void dogar() {
		System.out.println("bitki doðar");
		
	}
	@Override
	public void solunum() {
		System.out.println("bitki solunum yapar");
		
	}
	@Override
	public void olur() {
		System.out.println("bitki ölür");
		
	}
	
	
	

}
