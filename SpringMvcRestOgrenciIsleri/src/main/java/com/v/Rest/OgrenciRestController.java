package com.v.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v.Domain.Ogrenci;
import com.v.Servis.OgrenciServisi;

@RestController
@RequestMapping("/api")
public class OgrenciRestController {
	@Autowired
	private OgrenciServisi ogrenciServisi;
	
	
	@GetMapping("/{ogrNo}")
	public Ogrenci getAktifOgr(@PathVariable int ogrNo) {
		return ogrenciServisi.getOgrencifromOgrNo(ogrNo);
	}
}
