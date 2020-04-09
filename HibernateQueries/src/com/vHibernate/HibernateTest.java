package com.vHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vEntity.Jobs;

public class HibernateTest {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration()
				.configure("hibernate-config.xml")
				.addAnnotatedClass(Jobs.class)
				.buildSessionFactory();
		
		
		Session session=sessionFactory.getCurrentSession();

		session.beginTransaction();	
		Jobs jobs=new Jobs("test","test muh",3000,5000);	
		session.save(jobs);
		session.getTransaction().commit();
		session.close();
	}

}
