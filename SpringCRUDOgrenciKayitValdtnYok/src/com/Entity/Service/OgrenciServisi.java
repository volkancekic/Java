package com.Entity.Service;

import java.util.List;

import com.Entity.E.Ogrenci;

public interface OgrenciServisi {
	public List<Ogrenci> getOgrenciler();

	public void saveOgrenci(Ogrenci ogr);

	public Ogrenci getOgrenci(int ogrid);

	public void deleteOgrenci(int ogrid);
}
