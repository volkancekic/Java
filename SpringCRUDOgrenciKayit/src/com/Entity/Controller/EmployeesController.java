package com.Entity.Controller;

import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
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
		
		Employees emp=new Employees();
		model.addAttribute("empsearch",emp);
		
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
	public String empkaydet(@Valid @ModelAttribute("employees")Employees emp, BindingResult bindingResult, Model model) {
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		if(bindingResult.hasErrors()) {
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
			
			model.addAttribute("employees", emp);
			return "employeesform";
		}
		//çalýsan maasý yonetici maasýný gecemez
		Employees EmpManager=employeesServisi.getEmployees(emp.getManager().getId());
		if((emp.getSalary()>=EmpManager.getSalary())&&(emp.getManager().getId()!=emp.getId())) {
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
			//validation error olusturuldu
			bindingResult.addError(new FieldError("emp", "salary",emp.getSalary(), false, null, null, "Çalýþan Maaþý Yönetici Maaþýný Geçemez."));
			model.addAttribute("employees", emp);
			return "employeesform";
		}	
		
		//Email Unique'lik kontrolü
				Employees gelenEmp=employeesServisi.EmailKayitlimi(emp.getEmail());
				if(gelenEmp!=null) {
					if(emp.getId()==null) {
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
						bindingResult.addError(new FieldError("emp", "email",emp.getEmail(), false, null, null, "Email Daha Önce Kullanýlmýþtýr."));
						model.addAttribute("employees", emp);
						return "employeesform";
					}else if(!gelenEmp.getId().equals(emp.getId())){
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
						bindingResult.addError(new FieldError("emp", "email",emp.getEmail(), false, null, null, "Email Daha Önce Kullanýlmýþtýr."));
						model.addAttribute("employees", emp);
						return "employeesform";
					}
				}
		
		
		//job_History tablosu sýfýrlanýr sorun olmamasý icin
		employeesServisi.clearJobHistory();
		
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
	public String empsil(@RequestParam("employeesid")int id,Model model) {
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}		
		
		List<Employees> emplist=employeesServisi.getEmployees();	
		for (Employees employees : emplist) {
			if((employees.getManager()!=null) && (employees.getManager().getId()==id)) {
				Employees emp=new Employees();
				model.addAttribute("empsearch",emp);
				model.addAttribute("message", "UYARI: "+id+" Nolu Kiþi Yönetici Konumundadýr. Silmek Ýçin Baðlý Olduðu Personellerin Yöneticilerini Deðiþtiriniz.");
				model.addAttribute("employees", emplist);		
				return "employeeslist";
			}
			
		}
		
		//job_History tablosu sýfýrlanýr sorun olmamasý icin
		employeesServisi.clearJobHistory();
		
		employeesServisi.deleteemp(id);
		return "redirect:/employeeslist";
	}
	@PostMapping("/employeesSearch")
	public String employeesSearch(@ModelAttribute("empsearch") Employees emps,Model model) {
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		Employees emp=new Employees();
		model.addAttribute("empsearch",emp);
		
		List<Employees> emplist=employeesServisi.SearchEmployees(emps.getId(),emps.getFirstName(),emps.getLastName(),emps.getPhoneNumber(),emps.getSalary(),emps.getEmail(),emps.getCommissionPct());
		model.addAttribute("employees", emplist);		
		return "employeeslist";
	}
}
