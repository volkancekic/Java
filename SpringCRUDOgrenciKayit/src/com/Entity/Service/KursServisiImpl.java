package com.Entity.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Entity.Dao.KursDAO;
import com.Entity.E.Kurs;
import com.Entity.E.Ogretmen;
@Service 
public class KursServisiImpl implements KursServisi{

	@Autowired
	private KursDAO kursDAO;
	
	@Transactional
	@Override
	public List<Kurs> getKurslar() {		
		return kursDAO.getKurslar();
	}
	@Transactional
	@Override
	public void saveKurs(Kurs krs) {
		kursDAO.saveKurs(krs);		
	}
	@Transactional
	@Override
	public Kurs getKurs(int id) {
		Kurs kurs=kursDAO.getKurs(id);
		return kurs;
	}
	@Transactional
	@Override
	public void deletekurs(int id) {
		kursDAO.deletekurs(id);
		
	}
	@Transactional
	@Override
	public List<Ogretmen> getOgretmenList() {		
		return kursDAO.getOgretmenList();
	}
	@Transactional
	@Override
	public Kurs KursAdiKayitlimi(String kursAd) {
		return kursDAO.KursAdiKayitlimi(kursAd);
	}
	@Transactional
	@Override
	public List<Kurs> SearchKurs(Integer id, String kursAdi, Integer saat) {
		return kursDAO.SearchKurs(id, kursAdi, saat);
	}

}
