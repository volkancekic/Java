package com.v.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v.Domain.Ogrenci;
import com.v.Servis.KutuphaneServisi;

@RestController
@RequestMapping("/api")
public class KutuphaneRestController {
	@Autowired
	private KutuphaneServisi kutuphaneServisi;
	
	
	@GetMapping("/{indeks}")
	public Ogrenci getOgr(@PathVariable int indeks) {
		Ogrenci ogr=kutuphaneServisi.getOgrenci(indeks);
		
		if(ogr!=null) {
			return ogr;
		}else {
			return null;
		}
	}
}
