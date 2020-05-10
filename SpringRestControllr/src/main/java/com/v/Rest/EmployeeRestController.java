package com.v.Rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v.Domain.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {
	
	static List<Employee> empList=new ArrayList<Employee>();
	static {
		Employee e1=new Employee("volkan","volkan");
		Employee e2=new Employee("mehmnet","mehmet");
		Employee e3=new Employee("sinan","sinan");
		Employee e4=new Employee("murat","murat");
		e2.setManager(e1);
		e3.setManager(e1);
		e4.setManager(e1);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
	}
	
	/*List<Employee> empList;
	
	@PostConstruct
	public void loadList() {
		empList=new ArrayList<Employee>();
		Employee e1=new Employee("volkan","volkan");
		Employee e2=new Employee("mehmnet","mehmet");
		Employee e3=new Employee("sinan","sinan");
		Employee e4=new Employee("murat","murat");
		e2.setManager(e1);
		e3.setManager(e1);
		e4.setManager(e1);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
	}*/
	
	
	@GetMapping("/mrb")
	public String merhaba() {
		
		return "merhaba";
	}
	
	@GetMapping("/emp")
	public Employee emp() {
		
		return new Employee("volkan","volkan");
	}
	
	@GetMapping("/emps")
	public List<Employee> emps() {		
		//tüm liste döner
		return empList;
	}
	
	@GetMapping("/emps/{indeks}")
	public Employee GetEmp(@PathVariable int indeks) {		
		//listeden istenen index alýnýr
		
		if(indeks>=empList.size() || indeks<0) {
			throw new EmployeeNotFoundException("Böyle bir emp id mevcut deðil."+indeks);
			
			//return new Employee("Limit","Aþýldý");
		}
		return empList.get(indeks);
	}
	//hata yakalama ve hatayý json olarak gönderme
	@ExceptionHandler
	public ResponseEntity<GeneralErrorResponse> hataYakala(EmployeeNotFoundException exc){
		GeneralErrorResponse hata=new GeneralErrorResponse();
		hata.setStatus(HttpStatus.NOT_FOUND.value());
		hata.setMessage(exc.getMessage());
		return new ResponseEntity<>(hata,HttpStatus.NOT_FOUND);
	}
	
	
}
