package com.vHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vEntity.Ogretmen;
import com.vEntity.OgretmenDetay;

public class HibernateOneToOneDelete {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration()
				.configure("hibernate-config.xml")
				.addAnnotatedClass(Ogretmen.class)
				.addAnnotatedClass(OgretmenDetay.class)
				.buildSessionFactory();
		
		
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		
		OgretmenDetay ogrdty=session.get(OgretmenDetay.class, 11);
		
		session.delete(ogrdty);	
		session.getTransaction().commit();
		session.close();
	}

}
