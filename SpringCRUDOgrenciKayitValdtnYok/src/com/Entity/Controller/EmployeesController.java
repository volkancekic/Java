package com.Entity.Controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Entity.E.Departments;
import com.Entity.E.Employees;
import com.Entity.E.Jobs;
import com.Entity.E.Login;
import com.Entity.Service.EmployeesServisi;

@Controller
public class EmployeesController {
	@Autowired
	EmployeesServisi employeesServisi;
	
	@Autowired
	private ApplicationContext context;
	
	
	
	@RequestMapping("/employeeslist")
	public String emplistesi(Model model) {
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		List<Employees> emplist=employeesServisi.getEmployees();
		model.addAttribute("employees", emplist);
		return "employeeslist";
	}
	@GetMapping("/employeesekle")
	public String empekle(Model model) {	
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		//combobox verileri baslangic
		HashMap<String, String> jobMap=new HashMap<String, String>();
		List<Jobs> joblist=employeesServisi.getJobList();
		for (Jobs job : joblist) {
			jobMap.put(job.getId(), job.getTitle());
		}
		model.addAttribute("jobList",jobMap);
		
		
		HashMap<Integer, String> managerMap=new HashMap<Integer, String>();
		List<Employees> managerlist=employeesServisi.getManagerList();
		for (Employees e : managerlist) {
			managerMap.put(e.getId(), e.getFirstName()+" "+e.getLastName());
		}
		model.addAttribute("managerList",managerMap);
		
		
		
		HashMap<Integer, String> deptMap=new HashMap<Integer, String>();
		List<Departments> deptlist=employeesServisi.getDepartmentList();
		for (Departments d : deptlist) {
			deptMap.put(d.getId(), d.getName());
		}
		model.addAttribute("departmentList",deptMap);
		//combobox verileri son
		
		Employees emp=new Employees();
		model.addAttribute("employees", emp);
		return "employeesform";
	}
	@PostMapping("/employeeskaydet")
	public String empkaydet(@ModelAttribute("employees")Employees emp) {
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		employeesServisi.saveEmployees(emp);
		return "redirect:/employeeslist";
	}
	@GetMapping("/employeesguncelle")
	public String empguncelle(@RequestParam("employeesid")int id,Model model) {
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		//combobox verileri baslangic
				HashMap<String, String> jobMap=new HashMap<String, String>();
				List<Jobs> joblist=employeesServisi.getJobList();
				for (Jobs job : joblist) {
					jobMap.put(job.getId(), job.getTitle());
				}
				model.addAttribute("jobList",jobMap);
				
				
				HashMap<Integer, String> managerMap=new HashMap<Integer, String>();
				List<Employees> managerlist=employeesServisi.getManagerList();
				for (Employees e : managerlist) {
					managerMap.put(e.getId(), e.getFirstName()+" "+e.getLastName());
				}
				model.addAttribute("managerList",managerMap);
				
				
				
				HashMap<Integer, String> deptMap=new HashMap<Integer, String>();
				List<Departments> deptlist=employeesServisi.getDepartmentList();
				for (Departments d : deptlist) {
					deptMap.put(d.getId(), d.getName());
				}
				model.addAttribute("departmentList",deptMap);
				//combobox verileri son
		
		Employees emp=employeesServisi.getEmployees(id);
		model.addAttribute("employees",emp);
		return "employeesform";
	}
	@GetMapping("/employeessil")
	public String empsil(@RequestParam("employeesid")int id) {
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		employeesServisi.deleteemp(id);
		return "redirect:/employeeslist";
	}
	
}
