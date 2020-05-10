package com.Entity.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.E.Kurs;
import com.Entity.E.Ogretmen;
@Repository
public class KursDAOImpl implements KursDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public List<Kurs> getKurslar() {
		Session session=sessionFactory.getCurrentSession();
		Query<Kurs> query=session.createQuery("from Kurs", Kurs.class);
		List<Kurs> resultList=query.getResultList();
		return resultList;
	}


	@Override
	public void saveKurs(Kurs krs) {
		Session session=sessionFactory.getCurrentSession();		
		session.saveOrUpdate(krs);
	}


	@Override
	public Kurs getKurs(int id) {
		Session session=sessionFactory.getCurrentSession();
		Kurs kurs=session.get(Kurs.class, id);
		return kurs;
	}


	@Override
	public void deletekurs(int id) {
		Session session=sessionFactory.getCurrentSession();
		Kurs kurs=session.get(Kurs.class, id);
		session.delete(kurs);
		
	}


	@Override
	public List<Ogretmen> getOgretmenList() {
		Session session=sessionFactory.getCurrentSession();
		Query<Ogretmen> query=session.createQuery("from Ogretmen", Ogretmen.class);
		List<Ogretmen> resultList=query.getResultList();
		return resultList;
	}


	@Override
	public Kurs KursAdiKayitlimi(String kursAd) {
		Session session=sessionFactory.getCurrentSession();
		Query<Kurs> query=session.createQuery("from Kurs where kursAdi='"+kursAd+"'", Kurs.class);
		List<Kurs> resultList=query.getResultList();
		if(resultList.isEmpty()) {				
			return null;
		}else {
			Kurs krs=resultList.get(0);
			return krs;
		}
	}


	@Override
	public List<Kurs> SearchKurs(Integer id, String kursAdi, Integer saat) {
		String sql_query="";
		if(id!=null) {
			sql_query+=" and id like "+id;
		}
		if(kursAdi!="") {
			sql_query+=" and kursAdi like '"+kursAdi+"'";
		}		
		if(saat!=null) {
			sql_query+=" and saat like "+saat;
		}
		
		Session session=sessionFactory.getCurrentSession();
		Query<Kurs> query=session.createQuery("from Kurs where 1=1"+sql_query, Kurs.class);
		List<Kurs> resultList=query.getResultList();
		return resultList;
	}

}
