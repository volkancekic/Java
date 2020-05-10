package com.vHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vEntity.EgitmenOneToManyBi;
import com.vEntity.KursOneToManyBi;


public class HibernateOneToManyBi {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory=new Configuration()
				.configure("hibernate-config.xml")
				.addAnnotatedClass(KursOneToManyBi.class)
				.addAnnotatedClass(EgitmenOneToManyBi.class)				
				.buildSessionFactory();
		
		
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();	

		//ekleme
		/*EgitmenOneToManyBi egtmn=new EgitmenOneToManyBi("aslý");
		
		egtmn.kursekle(new KursOneToManyBi("kurs1", egtmn));
		egtmn.kursekle(new KursOneToManyBi("kurs2", egtmn));
		egtmn.kursekle(new KursOneToManyBi("kurs3", egtmn));
		egtmn.kursekle(new KursOneToManyBi("kurs4", egtmn));
		
		session.save(egtmn);*/
		
		//2 yönlü ulaþma
		/*KursOneToManyBi kurs=session.get(KursOneToManyBi.class, 9);
		System.out.println(kurs.getEgitmen().getAd());
		
		EgitmenOneToManyBi e=session.get(EgitmenOneToManyBi.class, 6);
		System.out.println(e.getKursListesi().get(0).getAd());*/
		
		//silme iþlemi
		//sadece kurs silindi
		/*KursOneToManyBi kurs=session.get(KursOneToManyBi.class, 9);
		session.delete(kurs);
		
		//egitmen silinince tüm kurslarýda silindi
		EgitmenOneToManyBi e=session.get(EgitmenOneToManyBi.class, 5);
		session.delete(e);*/
		
		session.getTransaction().commit();
		session.close();
	}

}
