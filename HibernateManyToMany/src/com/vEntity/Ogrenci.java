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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "OGRENCI")
public class Ogrenci {
	@Id
	@SequenceGenerator(name = "ogr_seq", sequenceName = "OGR_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ogr_seq")
	@Column(name = "id")
	private Integer id;

	@Column(name = "isim")
	private String isim;

	@Column(name = "soyisim")
	private String soyisim;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "kurs_ogrenci", joinColumns = @JoinColumn(name = "ogrenci_id"), inverseJoinColumns = @JoinColumn(name = "kurs_id"))
	private List<Kurs> kurslar;

	public void addKurs(Kurs kurs) {
		if(kurslar==null) {
			kurslar=new ArrayList<Kurs>();
		}
		kurslar.add(kurs);
	}
	@Column(name = "ogrenci_no")
	private Integer ogrenci_no;

	public Ogrenci(String isim, String soyisim, Integer ogrenci_no) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;

		this.ogrenci_no = ogrenci_no;
	}

	public Ogrenci() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public List<Kurs> getKurslar() {
		return kurslar;
	}

	public void setKurslar(List<Kurs> kurslar) {
		this.kurslar = kurslar;
	}

	public Integer getOgrenci_no() {
		return ogrenci_no;
	}

	public void setOgrenci_no(Integer ogrenci_no) {
		this.ogrenci_no = ogrenci_no;
	}

}
