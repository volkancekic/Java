package com.v.Dao;

import java.util.List;

import com.v.Domain.Kurs;

public interface KursDao {

	List<Kurs> getOgrenciler();

	Kurs getKurs(int kursId);

	void saveKurs(Kurs kurs);

	int deleteKurs(int kursId);

}
