package com.Entity.E;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "OGRENCI")
public class Ogrenci {
	@Id
	@SequenceGenerator(name = "ogr_seq", sequenceName = "OGR_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ogr_seq")
	@Column(name = "id")
	private Integer id;

	@NotEmpty(message="Bu Alan Zorunludur.")
	@Length(min=3, message="En Az 3 Harf Giriniz.")
	@Length(max=20, message="En Fazla 20 Karakter Olabilir.")
	@Pattern(regexp="^[a-zA-ZðüþöçýÝÐÜÞÖÇ ]+$", message="Sadece Harf Girilebilir.")
	@Column(name = "isim")
	private String isim;

	@NotEmpty(message="Bu Alan Zorunludur.")
	@Length(min=3, message="En Az 3 Harf Giriniz.")
	@Length(max=20, message="En Fazla 20 Karakter Olabilir.")
	@Pattern(regexp="^[a-zA-ZðüþöçýÝÐÜÞÖÇ ]+$", message="Sadece Harf Girilebilir.")
	@Column(name = "soyisim")
	private String soyisim;

	@NotNull(message="Bu Alan Zorunludur.")
	@Min(value=1, message="Ogr No Pozitif Olmalýdýr.")		
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

	

	public Integer getOgrenci_no() {
		return ogrenci_no;
	}

	public void setOgrenci_no(Integer ogrenci_no) {
		this.ogrenci_no = ogrenci_no;
	}

}
