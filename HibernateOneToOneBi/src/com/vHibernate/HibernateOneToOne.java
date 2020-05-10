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
		
		OgretmenDetay ogrDetay=session.get(OgretmenDetay.class, 1);
		System.out.println(ogrDetay);
		System.out.println(ogrDetay.getOgretmen());
		
		session.getTransaction().commit();
		session.close();
	}

}
