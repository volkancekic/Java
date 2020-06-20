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

import com.v.Domain.Kitap;
import com.v.Domain.Ogrenci;
import com.v.Servis.KutuphaneServisi;

@Controller
public class KutuphaneController {
	@Autowired
	private KutuphaneServisi kutuphaneServisi;
	
	//rest-Client
		 final String serverUrl = "http://localhost:8081/2020.05.12SpringMvcRestOgrenciIsleri/api";
		 RestTemplate restTemplate = new RestTemplate();
		 
	
	@RequestMapping("/")	
	public String test() {
		return "welcome";
	}
	@RequestMapping("/kutuphaneisleri")	
	public String ktphnList(Model model) {
		List<Kitap> kitapList=kutuphaneServisi.getKitaplar();
		model.addAttribute("kitaplar",kitapList);	
		
		return "kitapList";
	}
	@RequestMapping("/oduncAl")	
	public String oduncAl(@RequestParam("kitapId")int id,Model model) {
		Kitap kitap=kutuphaneServisi.getKitap(id);
		model.addAttribute("kitap",kitap);
		return "kitapForm";
	}
	@PostMapping("/kitapteslim")
	public String kitapteslim(@ModelAttribute("kitap")Kitap ktp,Model model) {
		Ogrenci ogr=ogrAktfSorgu(ktp.getOgrenci().getOgrenciNo());
		//aktif öğrenci kontrol
		if(ogr==null) {
			String uyari="UYARI : Kayıtlarda "+ktp.getOgrenci().getOgrenciNo()+" nolu aktif öğrenci bulunamamıştır. "
					+ "İşlem gerçekleştirilemedi.";
						
			model.addAttribute("mesaj",uyari);
			List<Kitap> kitapList=kutuphaneServisi.getKitaplar();
			model.addAttribute("kitaplar",kitapList);	
			
			return "kitapList";
		}
		
		
		ktp.setOgrenci(ogr);		
		kutuphaneServisi.saveKitap(ktp);
		return "redirect:/kutuphaneisleri";
	}
	
	@RequestMapping("/ogrencibilgileri")	
	public String ogrBilgileri(@RequestParam("ogrNo")int ogrno,Model model) {
		Ogrenci ogrnc=ogrAktfSorgu(ogrno);
		model.addAttribute("ogr", ogrnc);
		return "OgrenciBilgileri";
	}
	
	//Rest Metotlari
		public Ogrenci ogrAktfSorgu(int ogrNo) {
			return restTemplate.getForObject(serverUrl+"/"+ogrNo, Ogrenci.class);

		}
	
}
