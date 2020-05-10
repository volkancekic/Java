package com.Entity.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Entity.Dao.OgrenciDAO;
import com.Entity.E.Ogrenci;
@Service
public class OgrenciServisiImpl implements OgrenciServisi{
	@Autowired
	private OgrenciDAO ogrenciDAO;
	
	@Transactional
	@Override
	public List<Ogrenci> getOgrenciler() {
		// TODO Auto-generated method stub
		return ogrenciDAO.getOgrenciler();
	}
	
	@Transactional
	@Override
	public void saveOgrenci(Ogrenci ogr) {
		ogrenciDAO.saveOgrenci(ogr);
		
	}
	@Transactional
	@Override
	public Ogrenci getOgrenci(int ogrid) {
		
		return ogrenciDAO.getOgrenci(ogrid);
	}
	@Transactional
	@Override
	public void deleteOgrenci(int ogrid) {
		ogrenciDAO.deleteOgrenci(ogrid);
		
	}
	

}
