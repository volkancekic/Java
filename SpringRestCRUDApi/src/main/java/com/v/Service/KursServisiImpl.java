package com.v.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.v.Dao.KursDao;
import com.v.Domain.Kurs;

@Service
public class KursServisiImpl implements KursServisi{
	@Autowired
	private KursDao kursDao;

	@Transactional
	@Override
	public List<Kurs> getKurslar() {
		return kursDao.getOgrenciler();
	}
	
	@Transactional
	@Override
	public Kurs getKurs(int kursId) {
		return kursDao.getKurs(kursId);
	}

	@Transactional
	@Override
	public void addKurs(Kurs kurs) {
		kursDao.saveKurs(kurs);
		
	}
	@Transactional
	@Override
	public void updateKurs(Kurs kurs) {
		kursDao.saveKurs(kurs);
		
	}
	@Transactional
	@Override
	public int deleteKurs(int kursId) {
		return kursDao.deleteKurs(kursId);
	}
}
