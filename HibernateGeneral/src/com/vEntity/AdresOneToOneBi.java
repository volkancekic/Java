package com.vEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="adres")
public class AdresOneToOneBi {
	@Id	
	@SequenceGenerator(name="adres_seq",sequenceName="ADRES_SEQ",allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="adres_seq")
	@Column(name="id")
	private Integer id;
	
	@Column(name="adres")
	private String adres;
	
	@OneToOne(mappedBy="adres")
	private KisiOneToOneBi kisi;
	
	public AdresOneToOneBi(String adres) {
		super();
		this.adres = adres;
	}
	public AdresOneToOneBi() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public KisiOneToOneBi getKisi() {
		return kisi;
	}
	public void setKisi(KisiOneToOneBi kisi) {
		this.kisi = kisi;
	}
	
	
}
