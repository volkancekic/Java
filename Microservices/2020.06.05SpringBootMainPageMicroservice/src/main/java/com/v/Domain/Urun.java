package com.v.Domain;

import java.sql.Date;

public class Urun {

	private Integer id;

	private String urunAdi;

	private Integer stokSayisi;

	private Double satisFiyati;

	private Date tarih;
	
	private String resimAdi;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrunAdi() {
		return urunAdi;
	}

	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}

	public Integer getStokSayisi() {
		return stokSayisi;
	}

	public void setStokSayisi(Integer stokSayisi) {
		this.stokSayisi = stokSayisi;
	}

	public Double getSatisFiyati() {
		return satisFiyati;
	}

	public void setSatisFiyati(Double satisFiyati) {
		this.satisFiyati = satisFiyati;
	}

	public Date getTarih() {
		return tarih;
	}

	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}

	public String getResimAdi() {
		return resimAdi;
	}

	public void setResimAdi(String resimAdi) {
		this.resimAdi = resimAdi;
	}

}
