package com.v;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MerhabaController {

	
	@RequestMapping("/merhaba")
	public String showForm() {		
		return "merhaba-form";
	}
	
	@RequestMapping("/processform")
	public String showprocessForm(@RequestParam("username") String username,Model model) {
		//gelen parametre alýnýp modele eklenebilir
		model.addAttribute("user",username);
		System.out.println(username);
		return "process-form";
	}
	
	/*@RequestMapping("/processform")
	public String showprocessForm(HttpServletRequest request,Model model) {	
		
		model.addAttribute("user",request.getParameter("username"));
		return "process-form";
	}*/
	

}
