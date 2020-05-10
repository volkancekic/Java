package com.vEntity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="egitmen")
public class EgitmenOneToManyBi {
	
	@Id	
	@SequenceGenerator(name="egitmen_seq",sequenceName="EGITMEN_SEQ",allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="egitmen_seq")
	@Column(name="id")
	private Integer id;
	
	@Column(name="ad")
	private String ad;
	
	@OneToMany(mappedBy="egitmen",cascade=CascadeType.ALL)
	private List<KursOneToManyBi> kursListesi;
	
	public EgitmenOneToManyBi(String ad) {
		super();
		this.ad = ad;
	}

	public EgitmenOneToManyBi() {
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

	public List<KursOneToManyBi> getKursListesi() {
		return kursListesi;
	}

	public void setKursListesi(List<KursOneToManyBi> kursListesi) {
		this.kursListesi = kursListesi;
	}
	public void kursekle(KursOneToManyBi krs) {
		if(kursListesi==null) {
			kursListesi=new ArrayList<KursOneToManyBi>();
		}
		kursListesi.add(krs);
	}
}
