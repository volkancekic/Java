package com.v.Dao;

import java.util.List;

import com.v.Domain.Ogrenci;

public interface OgrenciDAO {

	List<Ogrenci> getOgrenciler();

	Ogrenci getOgrenci(int ogrenciId);

}
