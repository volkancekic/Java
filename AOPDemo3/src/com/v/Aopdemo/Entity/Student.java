package com.v.Aopdemo.Entity;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String isim;
	private String soyisim;

	
	public int getId() {
		System.out.println("get id called.");
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		System.out.println("get isim called.");
		try {
			TimeUnit.SECONDS.sleep(5);//5 Saniye Bekle
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		System.out.println("get soyisim called.");
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public String getIsimSoyisim() {
		if(this.isim!=null) {
			throw new RuntimeException("getIsimSoyisim Hatasý.");
		}
		return this.isim+" "+this.soyisim;
	}
	
}
