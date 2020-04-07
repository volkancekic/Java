package com.v2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	//proje run on server yapýlýnca 
	//linkin sonuna department/homepage yazýp yönlendirecek
	
	@RequestMapping("/")
	public String redictToDepartments() {
		return "redirect:department/homepage";
	}

}
