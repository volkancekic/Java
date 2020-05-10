package com.v.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v.Domain.Ogrenci;
import com.v.Service.OgrenciServisi;

@RestController
@RequestMapping("/api")
public class OgrenciRestController {
	@Autowired
	private OgrenciServisi ogrenciServisi;
	
	@GetMapping("/ogrenciler")
	public List<Ogrenci> ogrenciler(){
		return ogrenciServisi.getOgrenciler();
	}
	
	@GetMapping("/ogrenciler/{ogrId}")
	public Ogrenci getOgrenci(@PathVariable int ogrId){		
		return ogrenciServisi.getOgrenci(ogrId);
	}
}
