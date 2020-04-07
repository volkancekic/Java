package com.sahis;

public class Sahis {

	String isim;
	String soyisim;
	long tcno;
	char cinsiyet;
	
	
	
	public Sahis(String isim, String soyisim, long tcno, char cinsiyet) {
		super();
		System.out.println("sahis const çalýþtý");
		this.isim = isim;
		this.soyisim = soyisim;
		this.tcno = tcno;
		this.cinsiyet = cinsiyet;
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
	public long getTcno() {
		return tcno;
	}
	public void setTcno(long tcno) {
		this.tcno = tcno;
	}
	public char getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(char cinsiyet) {
		this.cinsiyet = cinsiyet;
	}	
	public Sahis() {
		
	}
	@Override
	public String toString() {
		return "Sahis [isim=" + isim + ", soyisim=" + soyisim + ", tcno=" + tcno + ", cinsiyet=" + cinsiyet + "]";
	}
	
	
	
}

