package com.v;

public class At implements Arac{
	public At(String ad) {
		super();
		this.ad = ad;
		System.out.println("at oluþturuldu.");
	}
	int hiz;
	String ad;
	public int getHiz() {
		return hiz;
	}
	public void setHiz(int hiz) {
		this.hiz = hiz;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	@Override
	public int hizlan(int degisim) {
		this.hiz=degisim;
		System.out.println("at "+degisim+" kadar hýzlandý");
		return this.hiz;
	}
	@Override
	public int yavasla(int degisim) {
		this.hiz=degisim;
		System.out.println("at "+degisim+" kadar yavasladi");
		return this.hiz;
	}
	
}
