package com.Entity.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.E.Ogrenci;
@Repository
public class OgrenciDAOImpl implements OgrenciDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public List<Ogrenci> getOgrenciler() {
		Session session=sessionFactory.getCurrentSession();		
		Query<Ogrenci> query=session.createQuery("from Ogrenci",Ogrenci.class);
		List<Ogrenci> resultList=query.getResultList();		
		return resultList;
	}
	
	
	@Override
	public void saveOgrenci(Ogrenci ogr) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(ogr);
	}


	@Override
	public Ogrenci getOgrenci(int ogrid) {
		Session session=sessionFactory.getCurrentSession();
		Ogrenci ogr=session.get(Ogrenci.class, ogrid);
		return ogr;
	}


	@Override
	public void deleteOgrenci(int ogrid) {
		Session session=sessionFactory.getCurrentSession();
		Ogrenci ogr=session.get(Ogrenci.class, ogrid);
		session.delete(ogr);
	}


	@Override
	public Ogrenci OgrNoKayitlimi(Integer ogrNo) {
		Session session=sessionFactory.getCurrentSession();		
		Query<Ogrenci> query=session.createQuery("from Ogrenci where ogrenci_no="+ogrNo,Ogrenci.class);
		List<Ogrenci> resultList=query.getResultList();
			if(resultList.isEmpty()) {				
				return null;
			}else {
				Ogrenci ogr=resultList.get(0);
				return ogr;
			}		
	}


	@Override
	public List<Ogrenci> SearchOgrenci(Integer id, String isim, String soyisim, Integer ogrenci_no) {
		String sql_query="";
		if(id!=null) {
			sql_query+=" and id like "+id;
		}
		if(isim!="") {
			sql_query+=" and isim like '"+isim+"'";
		}
		if(soyisim!="") {
			sql_query+=" and soyisim like '"+soyisim+"'";
		}
		if(ogrenci_no!=null) {
			sql_query+=" and ogrenci_no like "+ogrenci_no;
		}
		
		Session session=sessionFactory.getCurrentSession();		
		Query<Ogrenci> query=session.createQuery("from Ogrenci where 1=1"+sql_query,Ogrenci.class);
		List<Ogrenci> resultList=query.getResultList();		
		return resultList;
	}
	
}
