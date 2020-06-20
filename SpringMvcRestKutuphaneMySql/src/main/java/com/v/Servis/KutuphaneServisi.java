package com.v.Servis;

import java.util.List;

import com.v.Domain.Kitap;
import com.v.Domain.Ogrenci;

public interface KutuphaneServisi {

	List<Kitap> getKitaplar();

	Kitap getKitap(int id);

	void saveKitap(Kitap ktp);

	Ogrenci getOgrenci(int indeks);

	

	

}
