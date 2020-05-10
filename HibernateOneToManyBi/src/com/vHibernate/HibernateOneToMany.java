package com.vHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vEntity.Ogretmen;
import com.vEntity.Kurs;

public class HibernateOneToMany {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration()
				.configure("hibernate-config.xml")
				.addAnnotatedClass(Ogretmen.class)
				.addAnnotatedClass(Kurs.class)
				.buildSessionFactory();
		
		
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();	
		
		/*Ogretmen ogr=new Ogretmen("ali3", "can3", "email13");
		ogr.addKurs(new Kurs(null, "eng1", 600));
		ogr.addKurs(new Kurs(null, "eng2", 500));
		ogr.addKurs(new Kurs(null, "eng3", 4500));
		
		session.save(ogr);*/
		
		/*
		
		Ogretmen ogr=session.get(Ogretmen.class, 18);
		for(int i=0;i<ogr.getKurslar().size();i++) {
			System.out.println(ogr.getKurslar().get(i).getKurs_adi());
		}
		*/
		Ogretmen ogr=session.get(Ogretmen.class, 18);
		Kurs kurs=(ogr.getKurslar()).remove(0);
		session.remove(kurs);
		
		Kurs k2=(ogr.getKurslar().get(0));
		k2.setKurs_adi("newCourseName1");
	
		
		session.save(ogr);
		
		
		session.getTransaction().commit();
		session.close();
	}

}
