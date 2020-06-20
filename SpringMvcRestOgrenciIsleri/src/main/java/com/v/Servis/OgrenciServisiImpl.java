package com.v.Servis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.v.Dao.OgrenciDao;
import com.v.Domain.Ogrenci;
@Service
public class OgrenciServisiImpl implements OgrenciServisi{

	@Autowired
	private OgrenciDao ogrenciDao;
	
	@Transactional
	@Override
	public List<Ogrenci> getOgrenciler() {
		return ogrenciDao.getOgrenciler();
	}
	
	@Transactional
	@Override
	public Ogrenci getOgrenci(int id) {
		return ogrenciDao.getOgrenci(id);
	}

	@Transactional
	@Override
	public void saveOgrenci(Ogrenci ogrenci) {
		ogrenciDao.saveOgrenci(ogrenci);
	}
	
	@Transactional
	@Override
	public Ogrenci getOgrencifromOgrNo(int ogrNo) {
		return ogrenciDao.getOgrencifromOgrNo(ogrNo);
	}
	
	

}
