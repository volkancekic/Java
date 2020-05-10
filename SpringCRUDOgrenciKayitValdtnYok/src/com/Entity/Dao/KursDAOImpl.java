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

}
