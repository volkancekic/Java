package com.v;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Personel {
	public Personel(String isim, String soyisim) {
		System.out.println("isim soyisim ile 2'li const çalýþtý");
		this.isim = isim;
		this.soyisim = soyisim;
	}
	public Personel() {
		System.out.println("personel default const çalýþtý");
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
		return "Personel [isim=" + isim + ", soyisim=" + soyisim + ", ozlukdosyasi=" + ozlukdosyasi + "]";
	}
	@PostConstruct
	public void initPersonel() {
		System.out.println("personel init method");
	}
	@PreDestroy
	public void destroyPersonel() {
		System.out.println("personel destroy method");
	}
	
	
	
}
