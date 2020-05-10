package com.Entity.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.E.Departments;
import com.Entity.E.Employees;
import com.Entity.E.Jobs;

@Repository
public class EmployeesDAOImpl implements EmployeesDAO{

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Employees> getEmployees() {
		Session session=sessionFactory.getCurrentSession();
		Query<Employees> query=session.createQuery("from Employees", Employees.class);
		List<Employees> resultList=query.getResultList();
		return resultList;
	}

	@Override
	public void saveEmployees(Employees emp) {
		Session session=sessionFactory.getCurrentSession();				
		session.saveOrUpdate(emp);		
	}	

	@Override
	public Employees getEmployees(int id) {
		Session session=sessionFactory.getCurrentSession();
		Employees emp=session.get(Employees.class, id);	
		return emp;
	}

	@Override
	public void deleteemp(int id) {
		Session session=sessionFactory.getCurrentSession();		
		Employees emp=session.get(Employees.class, id);		
		session.delete(emp);	
	}

	@Override
	public List<Jobs> getJobList() {
		Session session=sessionFactory.getCurrentSession();
		Query<Jobs> query=session.createQuery("from Jobs", Jobs.class);
		List<Jobs> resultList=query.getResultList();
		return resultList;
	}

	@Override
	public List<Employees> getManagerList() {
		Session session=sessionFactory.getCurrentSession();
		Query<Employees> query=session.createQuery("from Employees", Employees.class);
		List<Employees> resultList=query.getResultList();
		return resultList;
	}

	@Override
	public List<Departments> getDepartmentList() {
		Session session=sessionFactory.getCurrentSession();
		Query<Departments> query=session.createQuery("from Departments", Departments.class);
		List<Departments> resultList=query.getResultList();
		return resultList;
	}

	@Override
	public void clearJobHistory() {
		//tüm tablo verileri silinir
		Session session=sessionFactory.getCurrentSession();
		session.createQuery("delete JobHistory").executeUpdate();
		
	}

	@Override
	public Employees EmailKayitlimi(String eposta) {
		Session session=sessionFactory.getCurrentSession();
		Query<Employees> query=session.createQuery("from Employees where email='"+eposta+"'", Employees.class);
		List<Employees> resultList=query.getResultList();
		if(resultList.isEmpty()) {				
			return null;
		}else {
			Employees emp=resultList.get(0);		
			return emp;
		}
	}

	@Override
	public List<Employees> SearchEmployees(Integer id, String firstName, String lastName, String phoneNumber,
			Double salary, String email,Double cpct) {
		
		String sql_query="";
		if(id!=null) {
			sql_query+=" and id like "+id;
		}
		if(firstName!="") {
			sql_query+=" and firstName like '"+firstName+"'";
		}
		if(lastName!="") {
			sql_query+=" and lastName like '"+lastName+"'";
		}
		if(phoneNumber!="") {
			sql_query+=" and phoneNumber like '"+phoneNumber+"'";
		}		
		if(salary!=null) {
			sql_query+=" and salary like "+salary;
		}
		if(email!="") {
			sql_query+=" and email like '"+email+"'";
		}		
		if(cpct!=null) {
			sql_query+=" and cpct like "+cpct;
		}
		
		
		Session session=sessionFactory.getCurrentSession();
		Query<Employees> query=session.createQuery("from Employees where 1=1"+sql_query, Employees.class);
		List<Employees> resultList=query.getResultList();
		return resultList;
	}	
}
