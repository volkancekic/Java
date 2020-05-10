package com.vHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vEntity.Ogretmen;
import com.vEntity.Kurs;

public class HibernateEagerLazy {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration()
				.configure("hibernate-config.xml")
				.addAnnotatedClass(Ogretmen.class)
				.addAnnotatedClass(Kurs.class)
				.buildSessionFactory();
		
		
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		
		/*Ogretmen ogr=new Ogretmen("ali5", "can5", "email15");
		
		ogr.addKurs(new Kurs(null, "te1", 6100));
		ogr.addKurs(new Kurs(null, "te2", 5300));
		ogr.addKurs(new Kurs(null, "te3", 4570));
		ogr.addKurs(new Kurs(null, "te4", 4100));
		
		session.save(ogr); */
		Ogretmen ogr=session.get(Ogretmen.class, 19);
			
		System.out.println(ogr);
		System.out.println(ogr.getKurslar());	
		
		session.getTransaction().commit();
		session.close();
		
	/*	System.out.println(ogr);
		System.out.println(ogr.getKurslar());*/ //fetch lazy de bu satýr çalýþmaz çünkü session kapalý ihtiyac halinde sorgu atýlamaz
												//ama eager da çalýþýr çünkü iliþkilerle birlikte alýndý nesne.		
	
	}

}
