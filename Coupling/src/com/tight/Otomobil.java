package com.tight;

public class Otomobil {
	String marka;
	int hiz=0;
	
	public Otomobil(String marka) {
		super();
		this.marka = marka;
		System.out.println(marka+" marka otomobil oluþturuldu.");
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}
	public int hizlan(int degisim) {
		this.hiz=degisim;
		System.out.println("otomobil "+degisim+" kadar hýzlandý");
		return this.hiz;
	}
	
	
	
}
