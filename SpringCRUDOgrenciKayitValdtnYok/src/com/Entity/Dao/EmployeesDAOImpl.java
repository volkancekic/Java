package com.Entity.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Entity.E.Departments;
import com.Entity.E.Employees;
import com.Entity.E.JobHistory;
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
		JobHistory jobh=session.get(JobHistory.class, id);
		Employees emp=session.get(Employees.class, id);
		session.delete(jobh);//önce history siliniyor sorun olmamasý icin
		session.delete(emp);//daha sonrada employees siliniyor		
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
}
