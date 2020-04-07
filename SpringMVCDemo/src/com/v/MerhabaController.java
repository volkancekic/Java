package com.v;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MerhabaController {

	
	@RequestMapping("/merhaba")
	public String showForm() {		
		return "merhaba-form";
	}
	
	@RequestMapping("/processForm")
	public String showprocessForm() {		
		return "process-form";
	}
	
	
	
	@RequestMapping("/processformv2")
	public String showprocessFormv2() {		
		return "processformv2";
	}
	
	@RequestMapping("/merhabav2")
	public String processFormv2(HttpServletRequest request, Model model) {		
		String name=request.getParameter("username");
		name=name.toUpperCase();
		String mesaj="Merhaba"+name;
		model.addAttribute("selamla",mesaj);
		return "merhabav2";
	}
}
