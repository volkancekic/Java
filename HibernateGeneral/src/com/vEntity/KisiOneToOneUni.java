package com.vEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="kisi")
public class KisiOneToOneUni {
	
	@Id	
	@SequenceGenerator(name="kisi_seq",sequenceName="KISI_SEQ",allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="kisi_seq")
	@Column(name="id")
	private Integer id;
	
	@Column(name="ad")
	private String ad;
	
	@Column(name="soyad")
	private String soyad;
	
	@Column(name="sehir")
	private String sehir;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="adres_id")
	private AdresOneToOneUni adres;
	
	
	public KisiOneToOneUni(String ad, String soyad, String sehir, AdresOneToOneUni adres) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.sehir = sehir;
		this.adres = adres;
	}
	public KisiOneToOneUni() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	public AdresOneToOneUni getAdres() {
		return adres;
	}
	public void setAdres(AdresOneToOneUni adres) {
		this.adres = adres;
	}
	
	
}
