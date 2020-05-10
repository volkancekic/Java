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
@Table(name = "KURS")
public class Kurs {

	@Id
	@SequenceGenerator(name = "kurs_seq", sequenceName = "KURS_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kurs_seq")
	@Column(name = "id")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "ogretmen_id")
	private Ogretmen ogretmen;

	@Column(name = "kurs_adi")
	private String kurs_adi;

	@Column(name = "saat")
	private Integer saat;

	public Kurs(Ogretmen ogretmen, String kurs_adi, Integer saat) {

		this.ogretmen = ogretmen;
		this.kurs_adi = kurs_adi;
		this.saat = saat;
	}

	public Kurs() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Ogretmen getOgretmen() {
		return ogretmen;
	}

	public void setOgretmen(Ogretmen ogretmen) {
		this.ogretmen = ogretmen;
	}

	public String getKurs_adi() {
		return kurs_adi;
	}

	public void setKurs_adi(String kurs_adi) {
		this.kurs_adi = kurs_adi;
	}

	public Integer getSaat() {
		return saat;
	}

	public void setSaat(Integer saat) {
		this.saat = saat;
	}

	@Override
	public String toString() {
		return "Kurs [id=" + id + ", ogretmen=" + ogretmen.getId() + ", kurs_adi=" + kurs_adi + ", saat=" + saat + "]";
	}
	
}
