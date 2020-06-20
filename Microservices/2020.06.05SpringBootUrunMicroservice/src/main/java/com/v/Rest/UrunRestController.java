package com.v.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.v.Domain.Urun;
import com.v.Service.UrunServisi;

@RestController
public class UrunRestController {
	
	@Autowired
	private UrunServisi urunServisi;
	
	@GetMapping("/list")
	public List<Urun> urunler(){
		return urunServisi.getProducts();
	}
	@GetMapping("/urun/{id}")
	public Urun urunGetir(@PathVariable("id")Integer id) {
		return urunServisi.getProductById(id);
	}
	@PostMapping("/urunekle")
	public void urunEkle(@RequestBody Urun urun) {
		urunServisi.addProduct(urun);
	}
	@PutMapping("/urunguncelle")
	public void urunGuncelle(@RequestBody Urun urun) {
		urunServisi.updateProduct(urun);
	}
	@DeleteMapping("/sil/{id}")
	public void urunSil(@PathVariable("id")Integer id) {
		urunServisi.delete(id);
	}
}
