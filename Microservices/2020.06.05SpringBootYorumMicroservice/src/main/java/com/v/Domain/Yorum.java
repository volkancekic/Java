package com.v.Domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
@Entity
@Table(name = "YORUM")
public class Yorum {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "isim")
	private String isim;

	@Column(name = "soyisim")
	private String soyisim;
	
	@Column(name = "tarih")
	@CreationTimestamp
	private Date tarih;

	@Column(name = "urun_id")
	private Integer urun_id;

	@Column(name = "yorum")
	private String yorum;

	
	
	public Yorum(String isim, String soyisim, Integer urun_id, String yorum) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.urun_id = urun_id;
		this.yorum = yorum;
	}

	
	public Yorum() {
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

	public Date getTarih() {
		return tarih;
	}

	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}

	public Integer getUrun_id() {
		return urun_id;
	}

	public void setUrun_id(Integer urun_id) {
		this.urun_id = urun_id;
	}

	public String getYorum() {
		return yorum;
	}

	public void setYorum(String yorum) {
		this.yorum = yorum;
	}

}
