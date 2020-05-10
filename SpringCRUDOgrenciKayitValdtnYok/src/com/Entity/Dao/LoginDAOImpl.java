package com.Entity.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.E.Login;
@Repository
public class LoginDAOImpl implements LoginDAO{

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Login girisKontrol(Login lgn) {
		Session session=sessionFactory.getCurrentSession();
		Query<Login> query=session.createQuery("from Login where email='"+lgn.getEmail()+"' and sifre='"+lgn.getSifre()+"'", Login.class);
		List<Login> resultList=query.getResultList();
		
		if(resultList.size()>0) {
			Login lgn1=resultList.get(0);
			return lgn1;
		}else {
			Login lgn1=new Login();			
			return lgn1;
		}
		
	}
	
}
