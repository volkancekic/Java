package com.v;

import org.springframework.stereotype.Component;

@Component("ali")
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
	
	public String getIsim() {
		return isim;
	}	
	@Override
	public String toString() {
		return "Personel [isim=" + isim + ", soyisim=" + soyisim +  "]";
	}
	public void initPersonel() {
		System.out.println("personel init method");
	}
	public void destroyPersonel() {
		System.out.println("personel destroy method");
	}
	
	
	
}
