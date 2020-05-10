package com.vHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vEntity.AdresOneToOneBi;
import com.vEntity.KisiOneToOneBi;


public class HibernateOneToOneBi {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration()
				.configure("hibernate-config.xml")
				.addAnnotatedClass(AdresOneToOneBi.class)
				.addAnnotatedClass(KisiOneToOneBi.class)				
				.buildSessionFactory();
		
		
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();	
		
		/*KisiOneToOneBi kisi=session.get(KisiOneToOneBi.class, 1);
		System.out.println("kisi ve kisinin adresi");
		System.out.println(kisi.getAd());
		System.out.println(kisi.getAdres().getAdres());
		
		AdresOneToOneBi adres=session.get(AdresOneToOneBi.class, 2);
		System.out.println("adres ve adresin kisisi");
		System.out.println(adres.getAdres());
		System.out.println(adres.getKisi().getAd());
		*/
		
		//silme iþlemi
		/*AdresOneToOneBi adres1=session.get(AdresOneToOneBi.class, 6);
		session.delete(adres1);
		*/
		session.getTransaction().commit();
		session.close();
	}

}
