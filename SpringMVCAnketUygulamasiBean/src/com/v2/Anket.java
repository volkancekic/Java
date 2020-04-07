package com.v2;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")

public class Anket {
	static Connection myConn;
	@NotEmpty(message="Bu alan zorunludur")
	private String ad;
	@NotEmpty(message="Bu alan zorunludur")
	private String soyad;
	private String cinsiyet;
	private String sehir;
	private String yas;
	private String ogrenim_durumu;
	private String sektor;
	private String gelir;
	private String[] harcama;
	private String[] bos_zaman;
	
	private static List<String> sehirlerlistesi;
	private static List<String> ogr_durum;
	private static List<String> aylik_gelir;
	
	public static void verilerekle() {
	
		sehirlerlistesi=new ArrayList<String>();
		
		sehirlerlistesi.add("Adana");
		sehirlerlistesi.add("Adıyaman");
		sehirlerlistesi.add("Afyonkarahisar");
		sehirlerlistesi.add("Ağrı");
		sehirlerlistesi.add("Amasya");
		sehirlerlistesi.add("Ankara");
		sehirlerlistesi.add("Antalya");
		sehirlerlistesi.add("Artvin");
		sehirlerlistesi.add("Aydın");
		sehirlerlistesi.add("Balıkesir");
		sehirlerlistesi.add("Bilecik");
		sehirlerlistesi.add("Bingöl");
		sehirlerlistesi.add("Bitlis");
		sehirlerlistesi.add("Bolu");
		sehirlerlistesi.add("Burdur");
		sehirlerlistesi.add("Bursa");
		sehirlerlistesi.add("Çanakkale");
		sehirlerlistesi.add("Çankırı");
		sehirlerlistesi.add("Çorum");
		sehirlerlistesi.add("Denizli");
		sehirlerlistesi.add("Diyarbakır");
		sehirlerlistesi.add("Edirne");
		sehirlerlistesi.add("Elazığ");
		sehirlerlistesi.add("Erzincan");
		sehirlerlistesi.add("Erzurum");
		sehirlerlistesi.add("Eskişehir");
		sehirlerlistesi.add("Gaziantep");
		sehirlerlistesi.add("Giresun");
		sehirlerlistesi.add("Gümüşhane");
		sehirlerlistesi.add("Hakkari");
		sehirlerlistesi.add("Hatay");
		sehirlerlistesi.add("Isparta");
		sehirlerlistesi.add("Mersin");
		sehirlerlistesi.add("İstanbul");
		sehirlerlistesi.add("İzmir");
		sehirlerlistesi.add("Kars");
		sehirlerlistesi.add("Kastamonu");
		sehirlerlistesi.add("Kayseri");
		sehirlerlistesi.add("Adana");
		sehirlerlistesi.add("Kırklareli");
		sehirlerlistesi.add("Kırşehir");
		sehirlerlistesi.add("Konya");
		sehirlerlistesi.add("Kütahya");
		sehirlerlistesi.add("Malatya");
		sehirlerlistesi.add("Manisa");
		sehirlerlistesi.add("Kahramanmaraş");
		sehirlerlistesi.add("Mardin");
		sehirlerlistesi.add("Muğla");
		sehirlerlistesi.add("Muş");
		sehirlerlistesi.add("Nevşehir");
		sehirlerlistesi.add("Niğde");
		sehirlerlistesi.add("Ordu");
		sehirlerlistesi.add("Rize");
		sehirlerlistesi.add("Sakarya");
		sehirlerlistesi.add("Samsun");
		sehirlerlistesi.add("Siirt");
		sehirlerlistesi.add("Sinop");
		sehirlerlistesi.add("Sivas");
		sehirlerlistesi.add("Tekirdağ");
		sehirlerlistesi.add("Tokat");
		sehirlerlistesi.add("Trabzon");
		sehirlerlistesi.add("Tunceli");
		sehirlerlistesi.add("Şanlıurfa");
		sehirlerlistesi.add("Uşak");
		sehirlerlistesi.add("Van");
		sehirlerlistesi.add("Yozgat");
		sehirlerlistesi.add("Zonguldak");
		sehirlerlistesi.add("Aksaray");
		sehirlerlistesi.add("Bayburt");
		sehirlerlistesi.add("Karaman");
		sehirlerlistesi.add("Kırıkkale");
		sehirlerlistesi.add("Batman");
		sehirlerlistesi.add("Şırnak");
		sehirlerlistesi.add("Bartın");
		sehirlerlistesi.add("Ardahan");
		sehirlerlistesi.add("Iğdır");
		sehirlerlistesi.add("Yalova");
		sehirlerlistesi.add("Karabük");
		sehirlerlistesi.add("Kilis");
		sehirlerlistesi.add("Osmaniye");
		sehirlerlistesi.add("Düzce");
		
	
	
		ogr_durum=new ArrayList<String>();
		ogr_durum.add("Ilkokul");
		ogr_durum.add("Lise");
		ogr_durum.add("Universite");
		ogr_durum.add("Diger");
	
	
		aylik_gelir=new ArrayList<String>();
		aylik_gelir.add("1000tl-2000tl");
		aylik_gelir.add("2000tl-3000tl");
		aylik_gelir.add("3000tl-4000tl");
		aylik_gelir.add("4000tl ve uzeri");
	}
	public Anket() {
		System.out.println("Default Constructor Çalıştı");	
		verilerekle();
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

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public String getSehir() {
		return sehir;
	}

	public void setSehir(String sehir) {
		this.sehir = sehir;
	}

	public String getYas() {
		return yas;
	}

	public void setYas(String yas) {
		this.yas = yas;
	}

	public String getOgrenim_durumu() {
		return ogrenim_durumu;
	}

	public void setOgrenim_durumu(String ogrenim_durumu) {
		this.ogrenim_durumu = ogrenim_durumu;
	}

	public String getSektor() {
		return sektor;
	}

	public void setSektor(String sektor) {
		this.sektor = sektor;
	}

	public String getGelir() {
		return gelir;
	}

	public void setGelir(String gelir) {
		this.gelir = gelir;
	}

	public String[] getHarcama() {
		return harcama;
	}

	public void setHarcama(String[] harcama) {
		this.harcama = harcama;
	}

	public String[] getBos_zaman() {
		return bos_zaman;
	}

	public void setBos_zaman(String[] bos_zaman) {
		this.bos_zaman = bos_zaman;
	}

	public List<String> getSehirlerlistesi() {
		return sehirlerlistesi;
	}

	public void setSehirlerlistesi(List<String> sehirlerlistesi) {
		this.sehirlerlistesi = sehirlerlistesi;
	}

	public List<String> getOgr_durum() {
		return ogr_durum;
	}

	public void setOgr_durum(List<String> ogr_durum) {
		this.ogr_durum = ogr_durum;
	}

	public List<String> getAylik_gelir() {
		return aylik_gelir;
	}

	public void setAylik_gelir(List<String> aylik_gelir) {
		this.aylik_gelir = aylik_gelir;
	}
}

