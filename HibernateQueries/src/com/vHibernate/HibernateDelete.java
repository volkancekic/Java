package com.vHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vEntity.Department;


public class HibernateDelete {

	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration()
				.configure("hibernate-config.xml")
				.addAnnotatedClass(Department.class)
				.buildSessionFactory();
				
		Session session=sessionFactory.getCurrentSession();
		
		
		session.beginTransaction();		
		Department dept=session.get(Department.class, 301);
		System.out.println(dept.getName());
		session.delete(dept);	
		session.getTransaction().commit();
		
		/*
		//Alternatif yöntem
		session.beginTransaction();
		
			session.createQuery("delete Department where department_id=291")
			.executeUpdate();		
		session.getTransaction().commit();
		*/
	}

	

}
