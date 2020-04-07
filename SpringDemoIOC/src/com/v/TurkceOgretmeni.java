package com.v;

public class TurkceOgretmeni implements Ogretmen{
	String isim;
	public TurkceOgretmeni(String isim) {
		super();
		this.isim = isim;
	}	
	public TurkceOgretmeni() {
		System.out.println("tr ogretmeni oluþturuldu.");
	}
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	@Override
	public void neDersin() {
		System.out.println("dil önemli");
		
	}
	
	
}
