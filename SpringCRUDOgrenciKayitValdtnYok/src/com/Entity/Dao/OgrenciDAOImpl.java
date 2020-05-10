package com.Entity.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.E.Ogrenci;
@Repository
public class OgrenciDAOImpl implements OgrenciDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public List<Ogrenci> getOgrenciler() {
		Session session=sessionFactory.getCurrentSession();
		
		Query<Ogrenci> query=session.createQuery("from Ogrenci",Ogrenci.class);
		List<Ogrenci> resultList=query.getResultList();		
		return resultList;
	}
	
	
	@Override
	public void saveOgrenci(Ogrenci ogr) {
		Session session=sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(ogr);
	}


	@Override
	public Ogrenci getOgrenci(int ogrid) {
		Session session=sessionFactory.getCurrentSession();
		Ogrenci ogr=session.get(Ogrenci.class, ogrid);
		return ogr;
	}


	@Override
	public void deleteOgrenci(int ogrid) {
		Session session=sessionFactory.getCurrentSession();
		Ogrenci ogr=session.get(Ogrenci.class, ogrid);
		session.delete(ogr);
	}
	
}
