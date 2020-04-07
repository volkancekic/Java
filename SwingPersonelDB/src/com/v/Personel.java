package com.v;

import java.io.Serializable;

public class Personel implements Serializable{
	private String ad;
	private String soyad;
	private int sicilNo;
	private int girisYili;
	private String dogumYeri;
	private Cinsiyet cinsiyet;
	private boolean yonetimPersonel;
	
	public Personel(String ad, String soyad, int sicilNo, int girisYili, String dogumYeri, Cinsiyet cinsiyet,
			boolean yonetimPersonel) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.sicilNo = sicilNo;
		this.girisYili = girisYili;
		this.dogumYeri = dogumYeri;
		this.cinsiyet = cinsiyet;
		this.yonetimPersonel = yonetimPersonel;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(int sicilNo) {
		this.sicilNo = sicilNo;
	}

	public int getGirisYili() {
		return girisYili;
	}

	public void setGirisYili(int girisYili) {
		this.girisYili = girisYili;
	}

	public String getDogumYeri() {
		return dogumYeri;
	}

	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}

	public Cinsiyet getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(Cinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public boolean isYonetimPersonel() {
		return yonetimPersonel;
	}

	public void setYonetimPersonel(boolean yonetimPersonel) {
		this.yonetimPersonel = yonetimPersonel;
	}

	@Override
	public String toString() {
		return "Ad=" + ad + ", Soyad=" + soyad + ", Sicil No=" + sicilNo + ", Giriþ Yýlý=" + girisYili
				+ ", Dogum Yeri=" + dogumYeri + ", Cinsiyet=" + cinsiyet + ", Yönetim=" + yonetimPersonel;
	}
	
	
	
	
}
