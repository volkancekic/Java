package com.v2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/personel")
public class PersonelController {
	@RequestMapping("/showform")
	public String showPersonel(Model model) {
		Personel personel =new Personel();
		personel.setFirstname("ali");
		personel.setLastname("can");
		model.addAttribute("sahis",personel);
		return "personel-form";
	}
	
	@RequestMapping("/saveform")
	public String savePersonel(@ModelAttribute("kisi") Personel personel) {
		
		//m.addAttribute("firstname",firstname.toUpperCase());
		return "personel-confirm";
	}
	
	
}
