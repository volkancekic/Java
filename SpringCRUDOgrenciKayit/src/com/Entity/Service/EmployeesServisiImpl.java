package com.Entity.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Entity.Dao.EmployeesDAO;
import com.Entity.E.Departments;
import com.Entity.E.Employees;
import com.Entity.E.Jobs;
@Service 
public class EmployeesServisiImpl implements EmployeesServisi{
	@Autowired
	private EmployeesDAO employeesDAO;
	
	@Transactional
	@Override
	public List<Employees> getEmployees() {		
		return employeesDAO.getEmployees();
	}
	@Transactional
	@Override
	public void saveEmployees(Employees emp) {
		employeesDAO.saveEmployees(emp);		
	}
	@Transactional
	@Override
	public Employees getEmployees(int id) {	
		
		Employees emp=employeesDAO.getEmployees(id);
		return emp;
	}
	@Transactional
	@Override
	public void deleteemp(int id) {
		employeesDAO.deleteemp(id);
		
	}
	@Transactional
	@Override
	public List<Jobs> getJobList() {		
		return employeesDAO.getJobList();
	}
	@Transactional
	@Override
	public List<Employees> getManagerList() {		
		return employeesDAO.getManagerList();
	}
	@Transactional
	@Override
	public List<Departments> getDepartmentList() {		
		return employeesDAO.getDepartmentList();
	}
	@Transactional
	@Override
	public void clearJobHistory() {
		employeesDAO.clearJobHistory();		
	}
	@Transactional
	@Override
	public Employees EmailKayitlimi(String eposta) {
		return employeesDAO.EmailKayitlimi(eposta);
	}
	@Transactional
	@Override
	public List<Employees> SearchEmployees(Integer id, String firstName, String lastName, String phoneNumber,
			Double salary, String email,Double cpct) {		
		return employeesDAO.SearchEmployees(id, firstName, lastName, phoneNumber, salary, email, cpct);
	}		
}
