package com.v.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.v.Domain.Ogrenci;
import com.v.Servis.OgrenciServisi;

@Controller
public class OgrIslController {
	@Autowired
	private OgrenciServisi ogrenciServisi;
	
	//rest-Client
	 final String serverUrl = "http://localhost:8081/2020.05.12SpringMvcRestKutuphaneMySql/api";
	 RestTemplate restTemplate = new RestTemplate();
	
	@RequestMapping("/")	
	public String test() {
		return "welcome";
	}
	@RequestMapping("/ogrenciisleri")	
	public String ogrList(Model model) {
		List<Ogrenci> ogrList=ogrenciServisi.getOgrenciler();
		model.addAttribute("ogrenciler",ogrList);	
		
		return "ogrList";
	}
	@RequestMapping("/mezuniyet")	
	public String mezuniyet(@RequestParam("ogrenciId")int id,Model model) {
		Ogrenci ogrenci=ogrenciServisi.getOgrenci(id);
		model.addAttribute("ogr",ogrenci);
		return "ogrForm";
	}
	@PostMapping("/mezunEt")
	public String mezunEt(@ModelAttribute("ogr")Ogrenci ogrenci,Model model) {
		
		Ogrenci ogrGelen=ktphnKytSorgu(ogrenci.getId());
		//kutuphane kaydi kontrol
		if(ogrGelen!=null) {
			String uyari="UYARI : "+ogrenci.getOgrenciNo()+" numaralı öğrenci "+ogrenci.getAd()+" "
		+ogrenci.getSoyad()+" ödünç aldığı kitapları kütüphaneye iade etmemiştir. Bu sebepten mezun olamaz.";
			
			model.addAttribute("mesaj",uyari);	
			
			List<Ogrenci> ogrList=ogrenciServisi.getOgrenciler();
			model.addAttribute("ogrenciler",ogrList);	
			
			return "ogrList";
		}
		
		ogrenciServisi.saveOgrenci(ogrenci);
		return "redirect:/ogrenciisleri";
	}
	
	
	//Rest Metotlari
	public Ogrenci ktphnKytSorgu(int ogrId) {
		return restTemplate.getForObject(serverUrl+"/"+ogrId, Ogrenci.class);

	}
	
}
