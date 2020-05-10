package com.vEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="kurs")
public class KursOneToManyBi {
	@Id	
	@SequenceGenerator(name="kurs_seq",sequenceName="KURS_SEQ",allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="kurs_seq")
	@Column(name="id")
	private Integer id;
	
	@Column(name="ad")
	private String ad;
	
	@ManyToOne
	@JoinColumn(name="egitmen_id")
	private EgitmenOneToManyBi egitmen;

	public KursOneToManyBi(String ad, EgitmenOneToManyBi egitmen) {
		super();
		this.ad = ad;
		this.egitmen = egitmen;
	}

	public KursOneToManyBi() {
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

	public EgitmenOneToManyBi getEgitmen() {
		return egitmen;
	}

	public void setEgitmen(EgitmenOneToManyBi egitmen) {
		this.egitmen = egitmen;
	}
	
	
}
