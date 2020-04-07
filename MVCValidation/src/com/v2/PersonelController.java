package com.v2;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/personel")
public class PersonelController {
	@RequestMapping("/showform")
	public String showPersonel(Model model) {
		Personel personel =new Personel();
		//personel.setFirstname("ali");
		//personel.setLastname("can");
		model.addAttribute("sahis",personel);
		return "personel-form";
	}
	
	@RequestMapping("/saveform")
	public String savePersonel(@Valid @ModelAttribute("sahis") Personel personel,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "personel-form";
		}
		//m.addAttribute("firstname",firstname.toUpperCase());
		return "personel-confirm";
	}
	
	
}
