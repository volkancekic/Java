package com.vHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vEntity.Department;


public class HibernateDepartmentTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration()
				.configure("hibernate-config.xml")
				.addAnnotatedClass(Department.class)
				.buildSessionFactory();
		
		
		Session session=sessionFactory.getCurrentSession();

		session.beginTransaction();	
		Department d1=new Department("deneme4",205,1700);	
		session.save(d1);
		session.getTransaction().commit();
		session.close();
	}

	

}
