package com.Entity.Dao;

import java.util.List;

import com.Entity.E.Departments;
import com.Entity.E.Employees;
import com.Entity.E.Jobs;

public interface EmployeesDAO {

	public List<Employees> getEmployees();

	public void saveEmployees(Employees emp);

	public Employees getEmployees(int id);

	public void deleteemp(int id);

	public List<Jobs> getJobList();
	
	public List<Employees> getManagerList();

	public List<Departments> getDepartmentList();

	public void clearJobHistory();

	public Employees EmailKayitlimi(String eposta);

	public List<Employees> SearchEmployees(Integer id, String firstName, String lastName, String phoneNumber,
			Double salary, String email, Double cpct);
	
}
