package com.vEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "KONU")
public class Konu {

	@Id
	@SequenceGenerator(name = "konu_seq", sequenceName = "KONU_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "konu_seq")
	@Column(name = "id")
	private Integer id;

	@Column(name = "konu_baslik")
	private String konu_baslik;

	@Column(name = "konu_detay")
	private String konu_detay;

	public Konu(String konu_baslik, String konu_detay) {
		super();
		this.konu_baslik = konu_baslik;
		this.konu_detay = konu_detay;

	}

	public Konu() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKonu_baslik() {
		return konu_baslik;
	}

	public void setKonu_baslik(String konu_baslik) {
		this.konu_baslik = konu_baslik;
	}

	public String getKonu_detay() {
		return konu_detay;
	}

	public void setKonu_detay(String konu_detay) {
		this.konu_detay = konu_detay;
	}

}
