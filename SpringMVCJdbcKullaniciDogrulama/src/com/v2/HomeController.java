package com.v2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	//proje run on server yap�l�nca 
	//linkin sonuna user/login yaz�p y�nlendirecek
	
	@RequestMapping("/")
	public String redictToDepartments() {
		return "redirect:user/login";
	}

}
