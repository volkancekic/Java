package com.v.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.v.Domain.Ogrenci;

@Repository
public class OgrenciDaoImpl implements OgrenciDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Ogrenci> getOgrenciler() {
		Session session=sessionFactory.getCurrentSession();		
		Query<Ogrenci> query=session.createQuery("from Ogrenci ORDER BY ad",Ogrenci.class);
		List<Ogrenci> resultList=query.getResultList();		
		return resultList;
	}


	@Override
	public Ogrenci getOgrenci(int id) {
		Session session=sessionFactory.getCurrentSession();
		return session.get(Ogrenci.class, id);
	}


	@Override
	public void saveOgrenci(Ogrenci ogrenci) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(ogrenci);
		
	}


	@Override
	public Ogrenci getOgrencifromOgrNo(int ogrNo) {
		Session session=sessionFactory.getCurrentSession();		
		Query<Ogrenci> query=session.createQuery("from Ogrenci where ogrenciNo=:ogrNumber and"
				+ " ogrencilikDurumu=:aktiflik",Ogrenci.class);
		query.setParameter("ogrNumber", ogrNo);
		query.setParameter("aktiflik", 1); //ogrenciligi aktif olanlar
		List<Ogrenci> resultList=query.getResultList();	
		if(!resultList.isEmpty()) {
			return resultList.get(0);
		}else {
			return null;
		}
	}

}
