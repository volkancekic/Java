package com.Entity.Service;

import java.util.List;

import com.Entity.E.Departments;
import com.Entity.E.Employees;
import com.Entity.E.Jobs;

public interface EmployeesServisi {

	public List<Employees> getEmployees();

	public void saveEmployees(Employees emp);

	public Employees getEmployees(int id);

	public void deleteemp(int id);

	public List<Jobs> getJobList();

	public List<Employees> getManagerList();

	public List<Departments> getDepartmentList();

}
