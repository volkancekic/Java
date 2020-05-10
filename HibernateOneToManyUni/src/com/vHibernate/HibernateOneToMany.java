package com.vHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vEntity.Ogretmen;
import com.vEntity.Konu;
import com.vEntity.Kurs;

public class HibernateOneToMany {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate-config.xml")
				.addAnnotatedClass(Ogretmen.class).addAnnotatedClass(Kurs.class).addAnnotatedClass(Konu.class)
				.buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		//ekleme
		/*Ogretmen ogr = session.get(Ogretmen.class, 18);
		Kurs kurs = new Kurs(ogr, "csharp1", 12);

		kurs.addKonu(new Konu("OOp", "Object oriented p"));
		kurs.addKonu(new Konu("OOp2", "Object oriented p2"));
		kurs.addKonu(new Konu("OOp3", "Object oriented p3"));

		session.save(kurs);*/
		
		//kurslar ve konularýný yazdýrma
		/*Ogretmen ogr = session.get(Ogretmen.class, 18);
		for(int i=0;i<ogr.getKurslar().size();i++) {
			System.out.println(ogr.getKurslar().get(i).getKurs_adi());
			System.out.println(" ");
			for(int k=0;k<ogr.getKurslar().get(i).getKonular().size();k++) {
				System.out.println("-"+ogr.getKurslar().get(i).getKonular().get(k).getKonu_baslik());
			}
		}
		*/
		
		session.getTransaction().commit();
		session.close();
	}

}
