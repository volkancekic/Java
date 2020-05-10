package com.Entity.Controller;

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

import com.Entity.E.Login;
import com.Entity.E.Ogrenci;
import com.Entity.Service.OgrenciServisi;

@Controller
public class OgrenciController {
	@Autowired
	OgrenciServisi ogrenciServisi;
	
	@Autowired
	private ApplicationContext context;
	
	
	
	@RequestMapping("/menu")
	public String menu() {	
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		return "menu";
	}
	
	@RequestMapping("/")
	public String redictTohomepage() {
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		return "redirect:/ogrenci";
	}
	@RequestMapping("/ogrenci")
	public String redictTomainpage() {
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		return "ogrenci";
	}
	@RequestMapping("/list")
	public String listOgrenciler(Model model) {
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		List<Ogrenci> ogrList=ogrenciServisi.getOgrenciler();
		model.addAttribute("ogrenciler", ogrList);
		return "ogrencilist";
	}
	@GetMapping("/ogrenciekle")
	public String ogrenciekle(Model model) {
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		Ogrenci ogr=new Ogrenci();
		model.addAttribute("ogrenci",ogr);
		return "ogrenciform";
	}
	@PostMapping("/ogrencikaydet")
	public String ogrencikaydet(@ModelAttribute("ogrenci") Ogrenci ogr) {
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		ogrenciServisi.saveOgrenci(ogr);
		return "redirect:/list"; //tekrar listeye dönmüþ olacak
	}
	@GetMapping("/ogrenciguncelle")
	public String ogrenciguncelle(Model model,@RequestParam("ogrenciid")int ogrid) {
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		Ogrenci ogr=ogrenciServisi.getOgrenci(ogrid);
		model.addAttribute("ogrenci",ogr);
		return "ogrenciform";
	}
	@GetMapping("/ogrencisil")
	public String ogrencisil(@RequestParam("ogrenciid")int ogrid) {
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		ogrenciServisi.deleteOgrenci(ogrid);		
		return "redirect:/list";
	}
}
