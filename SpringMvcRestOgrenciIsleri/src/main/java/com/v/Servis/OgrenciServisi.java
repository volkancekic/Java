package com.v.Servis;

import java.util.List;

import com.v.Domain.Ogrenci;

public interface OgrenciServisi {

	List<Ogrenci> getOgrenciler();

	Ogrenci getOgrenci(int id);

	void saveOgrenci(Ogrenci ogrenci);

	Ogrenci getOgrencifromOgrNo(int ogrNo);

	

}
