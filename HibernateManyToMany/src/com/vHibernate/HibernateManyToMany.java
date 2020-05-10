package com.vHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vEntity.Kurs;
import com.vEntity.Ogrenci;
import com.vEntity.Ogretmen;

public class HibernateManyToMany {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate-config.xml")
				.addAnnotatedClass(Ogretmen.class)
				.addAnnotatedClass(Kurs.class)
				.addAnnotatedClass(Ogrenci.class)
				.buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		//kursa ogrenci ekleme
		/*
		Kurs kurs=session.get(Kurs.class, 6);
		
		Ogrenci ogrnc=new Ogrenci("ali", "can", 1);
		Ogrenci ogrnc2=new Ogrenci("ali2", "can2", 2);
		
		kurs.addOgrenci(ogrnc);
		kurs.addOgrenci(ogrnc2);
		
		session.save(kurs);
		*/
		//var olan kursa var olan ogrenci ekleme
		/*Ogrenci ogr1=session.get(Ogrenci.class, 1);
		Kurs kurs1=session.get(Kurs.class, 13);		
		ogr1.addKurs(kurs1);*/
		
		/*Ogrenci ogr1=session.get(Ogrenci.class, 1);
		System.out.println("ogrencinin aldýðý kurslar:");
		for(int i=0;i<ogr1.getKurslar().size();i++) {
			System.out.println(ogr1.getKurslar().get(i).getKurs_adi());
		}*/
		
		/*Kurs kurs=session.get(Kurs.class, 6);
		System.out.println("kursta kayýtlý olan öðrenciler");
		for(int i=0;i<kurs.getOgrenciler().size();i++) {
			System.out.println(kurs.getOgrenciler().get(i).getIsim());
		}*/
		session.getTransaction().commit();
		session.close();
	}

}
