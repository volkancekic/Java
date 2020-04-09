package com.vHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vEntity.Department;


public class HibernateQuery {

	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration()
				.configure("hibernate-config.xml")
				.addAnnotatedClass(Department.class)
				.buildSessionFactory();
				
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		//HQL:hibernate query language
		List<Department> depts=session.createQuery("from Department where location_id=1700")
				.getResultList();
		
		for(Department dept:depts) {
			System.out.println(dept.getName());
		}
		session.getTransaction().commit();
		
		
	}

	

}
