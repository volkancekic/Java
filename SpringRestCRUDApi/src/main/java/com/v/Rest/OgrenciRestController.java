package com.v.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v.Domain.Ogrenci;
import com.v.Service.OgrenciServisi;

@RestController
@RequestMapping("/api")
public class OgrenciRestController {
	@Autowired
	private OgrenciServisi ogrenciServisi;
	
	@GetMapping("/students")
	public List<Ogrenci> ogrenciler(){
		return ogrenciServisi.getOgrenciler();
	}
	
	@GetMapping("/students/{ogrId}")
	public Ogrenci getOgrenci(@PathVariable int ogrId){		
		return ogrenciServisi.getOgrenci(ogrId);
	}
	
	@PostMapping("/students") 
	public Ogrenci saveOgrenci(@RequestBody Ogrenci ogrenci) {// metot eklenen ogrenciyi dönecek
		ogrenciServisi.saveOgrenci(ogrenci);
		return ogrenci;
	}
	
	@PutMapping("/students") 
	public Ogrenci updateOgrenci(@RequestBody Ogrenci ogrenci) {
		ogrenciServisi.updateOgrenci(ogrenci);
		return ogrenci;
	}
	
	@DeleteMapping("/students/{ogrId}")
	public String deleteOgrenci(@PathVariable int ogrId) {
		int sonuc=ogrenciServisi.deleteOgrenci(ogrId);
		
		if(sonuc>0) {
			return sonuc+" adet kayit silindi.";
		}else {
			return ogrId+" id'li kayit bulunamadi.";
		}
	}
}
