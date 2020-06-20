package com.v.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.v.Domain.Link;
import com.v.Domain.Student;
import com.v.Service.StudentRestService;

@Controller
public class StudentController {	

	@Autowired
	private StudentRestService studentRestService;
	//REST URL
	final String serverUrl = "http://localhost:8282/api/students";
	String getStudentSelfLink=null;
	
	@RequestMapping("/")
	public String test() {
		return "welcome";
	}
	
	@RequestMapping("/studentList")
	public String studentList(Model model) {
		List<Student> stdList=studentRestService.getList(serverUrl);
		model.addAttribute("ogrenciler",stdList);		
		Link link=studentRestService.getPageLinks(serverUrl);
		model.addAttribute("sayfalink",link);		
		return "student-list";
	}
	
	@GetMapping("/getstudent")
	public String getstudent(@RequestParam("ogrenciId")int ogrId,@RequestParam("link")String selflink, Model model) {
		Student stdnt=studentRestService.getStudent(ogrId,serverUrl);
		model.addAttribute("ogr",stdnt);
		getStudentSelfLink=selflink;//gelen ogrencinin bulundugu sayfa bilgisi alindi
		model.addAttribute("geridonlink",selflink);//listeye donerse aynı sayfaya donsun	
		return "student-form";
	}
	@PostMapping("/saveorupdate")
	public String saveorupdate(@ModelAttribute("ogr") Student student,Model model) {
		//Ekleme mi? guncelleme mi? ayrimi yapılıyor
		if(student.getId()==null) {
			//eger yeni student ekleniyorsa liste bastan gösterilecek
			getStudentSelfLink=serverUrl;
			model.addAttribute("mesaj","Kayit basariyla eklendi.");
		}else {
			model.addAttribute("mesaj","Guncelleme islemi basari ile gerceklestirildi.");
		}
		studentRestService.save(student,serverUrl);
		List<Student> stdList=studentRestService.getList(getStudentSelfLink);
		model.addAttribute("ogrenciler",stdList);		
		Link link=studentRestService.getPageLinks(getStudentSelfLink);
		model.addAttribute("sayfalink",link);	
		return "student-list";
	}
	@GetMapping("/deletestudent")
	public String deleteStudent(@RequestParam("ogrenciId")int StudentId,@RequestParam("link")String selflink,Model model) {
		studentRestService.deleteStudent(StudentId,serverUrl);
		List<Student> stdList=studentRestService.getList(selflink);
		model.addAttribute("ogrenciler",stdList);		
		Link link=studentRestService.getPageLinks(selflink);
		model.addAttribute("sayfalink",link);
		model.addAttribute("mesaj",StudentId+" id'li kayit basari ile silindi.");
		return "student-list";
		
	}
	@GetMapping("/addstudent")
	public String addstudent(@RequestParam("link")String selflink,Model model) {
		Student student=new Student();
		student.setId(null);
		model.addAttribute("ogr",student);
		model.addAttribute("geridonlink",selflink);//listeye donerse aynı sayfaya donsun	
		return "student-form";
	}
	@GetMapping("/pageButtonLink")
	public String pageButtonLink(@RequestParam("link")String pagelink,Model model) {		
		List<Student> stdList=studentRestService.getList(pagelink);
		model.addAttribute("ogrenciler",stdList);		
		Link link=studentRestService.getPageLinks(pagelink);
		model.addAttribute("sayfalink",link);		
		return "student-list";
	}
	@RequestMapping("/kriteruygula")
	public String kriterUygula(HttpServletRequest request,Model model) {		
		int sayi=Integer.valueOf(request.getParameter("kayitsayisi"));
		String kriter=request.getParameter("siralamakriteri");
		String siralama=request.getParameter("siralamasekli");
		//kriterleri uygulayıp listeliyoruz
		String newLink=serverUrl+"?size="+sayi+"&sort="+kriter+","+siralama;
		
		List<Student> stdList=studentRestService.getList(newLink);
		model.addAttribute("ogrenciler",stdList);		
		Link link=studentRestService.getPageLinks(newLink);
		model.addAttribute("sayfalink",link);		
		return "student-list";
		
	}
	@GetMapping("/listeyedon")
	public String listeyedon(@RequestParam("link")String selflink,Model model) {		
		List<Student> stdList=studentRestService.getList(selflink);
		model.addAttribute("ogrenciler",stdList);		
		Link link=studentRestService.getPageLinks(selflink);
		model.addAttribute("sayfalink",link);		
		return "student-list";
	}

}
