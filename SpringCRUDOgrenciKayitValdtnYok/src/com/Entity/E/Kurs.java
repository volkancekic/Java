package com.Entity.E;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="KURS")
public class Kurs {
	@Id
	@SequenceGenerator(name = "kurs_seq", sequenceName = "KURS_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kurs_seq")
	@Column(name = "id")
	private Integer id;
	
	
	@Column(name="kurs_adi")
	private String kursAdi;
	
	
	@Column(name="saat")
	private Integer saat;
	
	@ManyToOne
	@JoinColumn(name="ogretmen_id")
	private Ogretmen ogretmen;

	public Kurs(String kursAdi, Integer saat) {
		super();
		this.kursAdi = kursAdi;
		this.saat = saat;
	}

	public Kurs() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKursAdi() {
		return kursAdi;
	}

	public void setKursAdi(String kursAdi) {
		this.kursAdi = kursAdi;
	}

	public Integer getSaat() {
		return saat;
	}

	public void setSaat(Integer saat) {
		this.saat = saat;
	}

	public Ogretmen getOgretmen() {
		return ogretmen;
	}

	public void setOgretmen(Ogretmen ogretmen) {
		this.ogretmen = ogretmen;
	}
	
	
	
}
