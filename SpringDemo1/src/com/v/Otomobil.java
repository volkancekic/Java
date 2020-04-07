package com.v;

public class Otomobil implements Arac{
	String marka;
	int hiz=0;
	
	public Otomobil() {
		super();
		
		System.out.println(" otomobil oluþturuldu.");
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

	@Override
	public int hizlan(int degisim) {
		this.hiz=degisim;
		System.out.println("otomobil "+degisim+" kadar hýzlandý");
		return this.hiz;
	}

	@Override
	public int yavasla(int degisim) {
		this.hiz=degisim;
		System.out.println("otomobil "+degisim+" kadar yavasladý");
		return this.hiz;
	}
	
	
	
	
}
