package com.Equals;

public class Ogrenci {
	private int id;
	private String ad;
	private String soyad;
	public Ogrenci(int id, String ad, String soyad) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
	}
	
	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", ad=" + ad + ", soyad=" + soyad + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ogrenci other = (Ogrenci) obj;
		if (ad == null) {
			if (other.ad != null)
				return false;
		} else if (!ad.equals(other.ad))
			return false;
		if (id != other.id)
			return false;
		if (soyad == null) {
			if (other.soyad != null)
				return false;
		} else if (!soyad.equals(other.soyad))
			return false;
		return true;
	}
	
	
}
