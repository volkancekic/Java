package com.v.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.v.Domain.Kurs;

@Repository
public class KursDaoImpl implements KursDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Kurs> getOgrenciler() {
		Session session=sessionFactory.getCurrentSession();
		Query<Kurs> query=session.createQuery("from Kurs ORDER BY kursAdi",Kurs.class);
		List<Kurs> resultList=query.getResultList();
		return resultList;
	}

	@Override
	public Kurs getKurs(int kursId) {
		Session session=sessionFactory.getCurrentSession();
		return session.get(Kurs.class, kursId);
	}

	@Override
	public void saveKurs(Kurs kurs) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(kurs);
		
	}

	@Override
	public int deleteKurs(int kursId) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("delete from Kurs where id=:kursid");
		query.setParameter("kursid", kursId);
		return query.executeUpdate();
	}
}
