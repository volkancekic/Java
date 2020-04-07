package com.v;

public class Kisi {
	private String isim;
	private String soyisim;
	
	public Kisi() {		
		
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	@Override
	public String toString() {
		return isim+" "+soyisim;
	}
	
}
