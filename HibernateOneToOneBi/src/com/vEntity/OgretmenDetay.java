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
@Table(name="OGRETMEN_DETAY")
public class OgretmenDetay {
	
	
	@Id	
	@SequenceGenerator(name="ogr_dty_seq",sequenceName="OGRETMEN_DETAY_SEQ",allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ogr_dty_seq")
	@Column(name="id")
	private Integer id;
	
	@OneToOne(mappedBy="ogretmenDetay")
	private Ogretmen ogretmen;
	
	public Ogretmen getOgretmen() {
		return ogretmen;
	}

	public void setOgretmen(Ogretmen ogretmen) {
		this.ogretmen = ogretmen;
	}
	
	
	@Column(name="expertise")
	private String expertise;
	
	@Column(name="hobby")
	private String hooby;
	
	@Column(name="website")
	private String website;
	
	@Column(name="fb_page")
	private String fb_page;

	
	public OgretmenDetay() {
		
	}

	public OgretmenDetay(String expertise, String hooby, String website, String fb_page) {
		
		this.expertise = expertise;
		this.hooby = hooby;
		this.website = website;
		this.fb_page = fb_page;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public String getHooby() {
		return hooby;
	}

	public void setHooby(String hooby) {
		this.hooby = hooby;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getFb_page() {
		return fb_page;
	}

	public void setFb_page(String fb_page) {
		this.fb_page = fb_page;
	}

	@Override
	public String toString() {
		return "OgretmenDetay [id=" + id + ", ogretmen=" + ogretmen.getId() + ", expertise=" + expertise + ", hooby=" + hooby
				+ ", website=" + website + ", fb_page=" + fb_page + "]";
	}
	
	
	
}
