package com.vEntity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "kurs_ogrenci", joinColumns = @JoinColumn(name = "kurs_id"), inverseJoinColumns = @JoinColumn(name = "ogrenci_id"))
	private List<Ogrenci> ogrenciler;
	
	public void addOgrenci(Ogrenci ogrenci) {
		if(ogrenciler==null) {
			ogrenciler=new ArrayList<Ogrenci>();
		}
		ogrenciler.add(ogrenci);
	}
	@Column(name = "saat")
	private Integer saat;

	public Kurs() {
		super();
	}

	public Kurs(Ogretmen ogretmen, String kurs_adi, Integer saat) {
		super();
		this.ogretmen = ogretmen;
		this.kurs_adi = kurs_adi;
		
		this.saat = saat;
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

	public List<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}

	public void setOgrenciler(List<Ogrenci> ogrenciler) {
		this.ogrenciler = ogrenciler;
	}

	public Integer getSaat() {
		return saat;
	}

	public void setSaat(Integer saat) {
		this.saat = saat;
	}

	
}
