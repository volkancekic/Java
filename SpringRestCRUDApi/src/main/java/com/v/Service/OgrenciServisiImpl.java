package com.v.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.v.Dao.OgrenciDAO;
import com.v.Domain.Ogrenci;

@Service
public class OgrenciServisiImpl implements OgrenciServisi{
	@Autowired
	private OgrenciDAO ogrenciDAO;
	
	@Transactional
	@Override
	public List<Ogrenci> getOgrenciler() {		
		return ogrenciDAO.getOgrenciler();
	}
	
	@Transactional
	@Override
	public Ogrenci getOgrenci(int ogrenciId) {
		return ogrenciDAO.getOgrenci(ogrenciId);
	}
	
	@Transactional
	@Override
	public void saveOgrenci(Ogrenci ogrenci) {		
		ogrenciDAO.saveOgrenci(ogrenci);
		
	}
	
	@Transactional
	@Override
	public void updateOgrenci(Ogrenci ogrenci) {
		ogrenciDAO.saveOgrenci(ogrenci);		
	}

	@Transactional
	@Override
	public int deleteOgrenci(int ogrId) {
		return ogrenciDAO.deleteOgrenci(ogrId);	
		
	}

}
