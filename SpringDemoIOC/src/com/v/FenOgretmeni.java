package com.v;

public class FenOgretmeni implements Ogretmen{
	public FenOgretmeni() {
		System.out.println("fen ogretmeni oluþturuldu");
	}

	public FenOgretmeni(String isim) {
		super();
		this.isim = isim;
	}

	String isim;

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	@Override
	public void neDersin() {
		System.out.println("bilim onemli");
		
	}
	
	
}
