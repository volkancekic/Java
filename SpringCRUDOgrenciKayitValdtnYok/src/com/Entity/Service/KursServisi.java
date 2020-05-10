package com.Entity.Service;

import java.util.List;

import com.Entity.E.Kurs;
import com.Entity.E.Ogretmen;

public interface KursServisi {
	public List<Kurs> getKurslar();

	public void saveKurs(Kurs krs);

	public Kurs getKurs(int id);

	public void deletekurs(int id);

	public List<Ogretmen> getOgretmenList();
}
