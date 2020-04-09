package com.vHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vEntity.Ogretmen;
import com.vEntity.OgretmenDetay;

public class HibernateOneToOne {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration()
				.configure("hibernate-config.xml")
				.addAnnotatedClass(Ogretmen.class)
				.addAnnotatedClass(OgretmenDetay.class)
				.buildSessionFactory();
		
		
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();	
		
		OgretmenDetay ogrDetay=new OgretmenDetay("java1", "sinema1", "google.com11", "fbalican1");
		Ogretmen ogr=new Ogretmen("ali1", "can1", "alican@hotma1", ogrDetay);
		
	//	session.save(ogrDetay); cascade kullanýldý gerek kalmadý
		session.save(ogr);
		session.getTransaction().commit();
		session.close();
	}

}
