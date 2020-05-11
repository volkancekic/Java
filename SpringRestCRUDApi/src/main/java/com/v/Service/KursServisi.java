package com.v.Service;

import java.util.List;

import com.v.Domain.Kurs;

public interface KursServisi {

	List<Kurs> getKurslar();

	Kurs getKurs(int kursId);

	void addKurs(Kurs kurs);

	void updateKurs(Kurs kurs);

	int deleteKurs(int kursId);

}
