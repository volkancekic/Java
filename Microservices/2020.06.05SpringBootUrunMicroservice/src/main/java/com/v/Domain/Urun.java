package com.v.Domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="URUN")
public class Urun {
	@Id
	@SequenceGenerator(name = "urun_seq", sequenceName = "URUN_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "urun_seq")
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "urun_adi")
	private String urunAdi;
	
	@Column(name = "stok_sayisi")
	private Integer stokSayisi;
	
	@Column(name = "satis_fiyati")
	private Double satisFiyati;
	
	@Column(name = "tarih")
	private Date tarih;
	
	@Column(name = "resim_adi")
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
