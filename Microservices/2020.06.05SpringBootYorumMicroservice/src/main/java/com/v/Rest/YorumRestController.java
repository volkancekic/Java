package com.v.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.v.Domain.Yorum;
import com.v.Service.YorumServisi;

@RestController
public class YorumRestController {
	@Autowired
	private YorumServisi yorumServisi;
	
	@GetMapping("/list/{urunId}")
	public List<Yorum> yorumlar(@PathVariable("urunId")Integer urun_id){
		return yorumServisi.getComments(urun_id);
	}	
	@PostMapping("/yorumekle")
	public void yorumEkle(@RequestBody Yorum yorum) {			
		yorumServisi.addComment(yorum);
	}	
	
}
