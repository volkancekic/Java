package com.v.Dao;

import java.util.List;

import com.v.Domain.Kitap;
import com.v.Domain.Ogrenci;

public interface KutuphaneDao {

	List<Kitap> getKitaplar();

	void saveKitap(Kitap ktp);

	Kitap getKitap(int id);

	Ogrenci getOgrenci(int indeks);

}
