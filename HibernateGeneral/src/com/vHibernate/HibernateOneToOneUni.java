package com.vHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vEntity.AdresOneToOneUni;
import com.vEntity.KisiOneToOneUni;


public class HibernateOneToOneUni {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration()
				.configure("hibernate-config.xml")
				.addAnnotatedClass(AdresOneToOneUni.class)
				.addAnnotatedClass(KisiOneToOneUni.class)				
				.buildSessionFactory();
		
		
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();	
		//Ekleme iþlemi
		/*AdresOneToOneUni adres1=new AdresOneToOneUni("pembe sokak no:2 ankara");
		KisiOneToOneUni kisi1=new KisiOneToOneUni("yaðmur", "yýldýz", "ankara", adres1);
		session.save(kisi1);*/
		
		//Update iþlemi
		/*KisiOneToOneUni kisi=session.get(KisiOneToOneUni.class, 6);
		System.out.println(kisi.getAd());
		kisi.setAd("hasan");*/
	
		//Silme iþlemi iliþki ile birlikte
		/*KisiOneToOneUni kisi=session.get(KisiOneToOneUni.class, 8);
		session.delete(kisi);*/
		
		//Silme iþlemi iliþki ile birlikte
		/*AdresOneToOneUni adres1=session.get(AdresOneToOneUni.class, 5);
		session.delete(adres1);*/
		
		//silme iþlemi iliþkisiz
		//kisi silindi adres kaldý
		KisiOneToOneUni kisi=session.get(KisiOneToOneUni.class, 4);
		kisi.setAdres(null);
		session.delete(kisi);
		
		
		session.getTransaction().commit();
		session.close();
	}

}
