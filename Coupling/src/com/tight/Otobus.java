package com.tight;

public class Otobus {
	int kapasite;
	int hiz=0;
	
	public Otobus(int kapasite) {
		super();
		this.kapasite = kapasite;
		System.out.println(kapasite+" kapasiteli otobüs oluþturuldu.");
	}
	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}
	public int hizlan(int degisim) {
		this.hiz=degisim;
		System.out.println("otobüs "+degisim+" kadar hýzlandý");
		return this.hiz;
		
	}
	
}
