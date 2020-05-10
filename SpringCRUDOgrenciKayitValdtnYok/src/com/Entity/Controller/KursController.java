package com.Entity.Controller;

import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Entity.E.Kurs;
import com.Entity.E.Login;
import com.Entity.E.Ogretmen;
import com.Entity.Service.KursServisi;

@Controller
public class KursController {
	
	@Autowired
	KursServisi kursServisi;
	
	@Autowired
	private ApplicationContext context;
	

	
	@RequestMapping("/kurslist")
	public String kurslistesi(Model model) {	
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		List<Kurs> kurslist=kursServisi.getKurslar();
		model.addAttribute("kurslar", kurslist);
		return "kurslist";
	}
	@GetMapping("/kursekle")
	public String kursekle(Model model) {
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		HashMap<Integer, String> ogrmap=new HashMap<Integer, String>();
		List<Ogretmen> ogrlist=kursServisi.getOgretmenList();
		for (Ogretmen ogr : ogrlist) {
			ogrmap.put(ogr.getId(), ogr.getName()+" "+ogr.getLastname());
		}
		model.addAttribute("ogretmenlerList",ogrmap);
		
		Kurs kurs=new Kurs();
		model.addAttribute("kurs",kurs);
		return "kursform";
	}
	@PostMapping("/kurskaydet")
	public String kurskaydet(@ModelAttribute("kurs")Kurs krs) {
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}		
		kursServisi.saveKurs(krs);
		return "redirect:/kurslist";
	}
	@GetMapping("/kursguncelle")
	public String kursguncelle(@RequestParam("kursid")int id,Model model) {
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		Kurs kurs=kursServisi.getKurs(id);
		model.addAttribute("kurs",kurs);
		
		HashMap<Integer, String> ogrmap=new HashMap<Integer, String>();
		List<Ogretmen> ogrlist=kursServisi.getOgretmenList();
		for (Ogretmen ogr : ogrlist) {
			ogrmap.put(ogr.getId(), ogr.getName()+" "+ogr.getLastname());
		}
		model.addAttribute("ogretmenlerList",ogrmap);
		
		return "kursform";
	}
	@GetMapping("/kurssil")
	public String kurssil(@RequestParam("kursid")int id) {
		Login loginInf=context.getBean("login",Login.class);
		if(loginInf.getId()==null) {
			return "redirect:/login";
		}
		
		kursServisi.deletekurs(id);
		return "redirect:/kurslist";
	}
	
}
