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

import com.v.Domain.Kurs;
import com.v.Service.KursServisi;

@RestController
@RequestMapping("/kurs")
public class KursRestController {
	@Autowired
	private KursServisi kursServisi;
	
	@GetMapping("")
	public List<Kurs> kurslar(){
		return kursServisi.getKurslar();
	}
	
	@GetMapping("/{kursId}")
	public Kurs getKurs(@PathVariable int kursId) {
		return kursServisi.getKurs(kursId);
	}
	
	@PostMapping("")
	public Kurs addKurs(@RequestBody Kurs kurs) {
		kursServisi.addKurs(kurs);
		return kurs;		
	}
	
	@PutMapping("")
	public Kurs updateKurs(@RequestBody Kurs kurs) {
		kursServisi.updateKurs(kurs);
		return kurs;
		
	}
	
	@DeleteMapping("/{kursId}")
	public String deleteKurs(@PathVariable int kursId) {
		int i=kursServisi.deleteKurs(kursId);
		if(i>0) {
			return i+" adet kayit silindi.";
		}else {
			return kursId+" id'li kayit bulunamadi.";
		}
	}
	
	
}
