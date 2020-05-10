package com.v.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/personel")
public class PersonelController {
	@RequestMapping("/home")
	public String personelPage() {
		
		return "personel-home";
	}
	
}
