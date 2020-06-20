package com.v.Servis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.v.Dao.KutuphaneDao;
import com.v.Domain.Kitap;
import com.v.Domain.Ogrenci;
@Service
public class KutuphaneServisiImpl implements KutuphaneServisi{

	@Autowired
	private KutuphaneDao kutuphaneDao;

	@Transactional
	@Override
	public List<Kitap> getKitaplar() {
		return kutuphaneDao.getKitaplar();
	}

	@Transactional
	@Override
	public Kitap getKitap(int id) {
		return kutuphaneDao.getKitap(id);
	}

	@Transactional
	@Override
	public void saveKitap(Kitap ktp) {
		kutuphaneDao.saveKitap(ktp);
		
	}

	@Transactional
	@Override
	public Ogrenci getOgrenci(int indeks) {
		return kutuphaneDao.getOgrenci(indeks);
	}
	
	
	
	

}
