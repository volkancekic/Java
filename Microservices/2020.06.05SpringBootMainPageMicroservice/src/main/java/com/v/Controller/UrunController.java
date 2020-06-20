package com.v.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.v.Domain.Urun;
import com.v.Domain.Yorum;
import com.v.Service.UrunServisi;
import com.v.Service.YorumServisi;

@Controller
public class UrunController {
	
	@Autowired
	private UrunServisi urunServisi;
	
	@Autowired
	private YorumServisi yorumServisi;
	
	static final String urunUrl="http://localhost:8081";
	static final String yorumUrl="http://localhost:8082";
	
	@GetMapping("/mainpage")
	public String getUrunler(Model model) {
		List<Urun> urunList=urunServisi.getList(urunUrl);
		model.addAttribute("urunler",urunList);
		return "urun-list";
	}
	@GetMapping("/urundetay/{urunId}")
	public String getUrunDetay(@PathVariable("urunId")Integer urunId,Model model) {
		Urun urun=urunServisi.getUrun(urunUrl, urunId);
		List<Yorum> yorumList=yorumServisi.getList(yorumUrl, urunId);
		Yorum BosYorum=new Yorum();
		model.addAttribute("urun",urun);
		model.addAttribute("yorumlar",yorumList);
		model.addAttribute("yorum",BosYorum);
		return "urun-detay";
	}
	@PostMapping("/yorumkaydet")
	public String yorumEkle(@ModelAttribute("yorum")Yorum gelenYorum) {
		yorumServisi.saveYorum(yorumUrl, gelenYorum);
		Integer urunId=gelenYorum.getUrun_id();
		return "redirect:/urundetay/"+urunId;
	}
}
