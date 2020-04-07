package com.v;

public class Insan implements Canli{

	private String isim;
	private int dogumYili;
	private Insan babasi;
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getDogumYili() {
		return dogumYili;
	}
	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}
	public Insan getBabasi() {
		return babasi;
	}
	public void setBabasi(Insan babasi) {
		this.babasi = babasi;
	}
	
	public Insan(String isim, int dogumYili) {
		System.out.println("insan constructor ý calisti, isim ve dogumyýlý parametre aldý babasýný set yapacaðýz");
		this.isim = isim;
		this.dogumYili = dogumYili;
	}
	@Override
	public String toString() {
		return "Insan [isim=" + isim + ", dogumYili=" + dogumYili + ", babasi=" + babasi + "]";
	}
	@Override
	public void dogar() {
		System.out.println("insan dogar");
		
	}
	@Override
	public void solunum() {
		System.out.println("insan nefes alýp verir");
		
	}
	@Override
	public void olur() {
		System.out.println("insan ölür");
		
	}
	

}
