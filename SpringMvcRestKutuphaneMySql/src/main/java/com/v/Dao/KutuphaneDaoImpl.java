package com.v.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.v.Domain.Kitap;
import com.v.Domain.Ogrenci;

@Repository
public class KutuphaneDaoImpl implements KutuphaneDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Kitap> getKitaplar() {
		Session session = sessionFactory.getCurrentSession();
		Query<Kitap> query = session.createQuery("from Kitap ORDER BY kitapAdi", Kitap.class);
		List<Kitap> resultList = query.getResultList();
		return resultList;
	}
	
	@Override
	public Kitap getKitap(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Kitap.class, id);
	}

	@Override
	public void saveKitap(Kitap ktp) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(ktp);
		
	}

	@Override
	public Ogrenci getOgrenci(int indeks) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Ogrenci.class, indeks);
	}

	

}
