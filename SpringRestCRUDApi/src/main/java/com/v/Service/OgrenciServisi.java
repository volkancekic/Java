package com.v.Service;

import java.util.List;

import com.v.Domain.Ogrenci;

public interface OgrenciServisi {
	public List<Ogrenci> getOgrenciler();
	
	public Ogrenci getOgrenci(int ogrenciId);

	public void saveOgrenci(Ogrenci ogrenci);

	public void updateOgrenci(Ogrenci ogrenci);

	public int deleteOgrenci(int ogrId);
}
