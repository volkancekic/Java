package com.vHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vEntity.Department;


public class HibernateUpdate {

	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration()
				.configure("hibernate-config.xml")
				.addAnnotatedClass(Department.class)
				.buildSessionFactory();
				
		Session session=sessionFactory.getCurrentSession();
		
		/*
		session.beginTransaction();		
		Department dept=session.get(Department.class, 20);
		System.out.println(dept.getName());
		dept.setName("UpdatedDptName");	
		session.getTransaction().commit();
		*/
		
		//Alternatif yöntem
		session.beginTransaction();
		
			session.createQuery("update Department set department_name='updatedname2' where department_id=20")
			.executeUpdate();		
		session.getTransaction().commit();
		
	}

	

}
