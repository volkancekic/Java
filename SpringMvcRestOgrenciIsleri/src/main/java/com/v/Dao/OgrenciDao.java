package com.v.Dao;

import java.util.List;

import com.v.Domain.Ogrenci;

public interface OgrenciDao {

	List<Ogrenci> getOgrenciler();

	Ogrenci getOgrenci(int id);

	void saveOgrenci(Ogrenci ogrenci);

	Ogrenci getOgrencifromOgrNo(int ogrNo);

}
