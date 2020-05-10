package com.v.Service;

import java.util.List;

import com.v.Domain.Ogrenci;

public interface OgrenciServisi {
	public List<Ogrenci> getOgrenciler();
	
	public Ogrenci getOgrenci(int ogrenciId);
}
