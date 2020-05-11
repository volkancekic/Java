package com.v.Domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="OGRENCI")
public class Ogrenci {
	@Id
	@SequenceGenerator(name = "ogr_seq", sequenceName = "OGR_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ogr_seq")
	@Column(name="ID")
	private int id;
	
	@Column(name="ISIM")
	private String isim;
	
	@Column(name="SOYISIM")
	private String soyisim;
	
	@Column(name="OGRENCI_NO")
	private int ogrenciNo;
	
	@Column(name="MEZUNIYET_TARIHI")
	private Date mezuniyetTarihi;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getOgrenciNo() {
		return ogrenciNo;
	}
	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}
	public Date getMezuniyetTarihi() {
		return mezuniyetTarihi;
	}
	public void setMezuniyetTarihi(Date mezuniyetTarihi) {
		this.mezuniyetTarihi = mezuniyetTarihi;
	}

	
}
