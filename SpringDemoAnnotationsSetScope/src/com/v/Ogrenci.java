package com.v;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Ogrenci {
	public Ogrenci(String isim, String soyisim) {
		System.out.println("isim soyisim ile 2'li const çalýþtý");
		this.isim = isim;
		this.soyisim = soyisim;
	}
	public Ogrenci() {
		System.out.println("ogrenci default const çalýþtý");
	}
	
	private String isim;
	private String soyisim;
	private OzlukDosyasi ozlukdosyasi;
	public String getIsim() {
		return isim;
	}
	
	
	public void setOzlukdosyasi(OzlukDosyasi ozlukdosyasi) {
		this.ozlukdosyasi = ozlukdosyasi;
	}
	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", soyisim=" + soyisim + ", ozlukdosyasi=" + ozlukdosyasi + "]";
	}
	@PostConstruct
	public void initOgrenci() {
		System.out.println("ogrenci init method");
	}
	@PreDestroy
	public void destroyOgrenci() {
		System.out.println("ogrenci destroy method");
	}
	
	
	
}
