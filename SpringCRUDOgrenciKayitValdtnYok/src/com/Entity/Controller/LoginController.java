package com.Entity.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Entity.E.Login;
import com.Entity.Service.LoginServisi;

@Controller
public class LoginController {
	
	@Autowired
	LoginServisi loginServisi;
	
	@Autowired
	private ApplicationContext context;
	
	@RequestMapping("/login")
	public String login(Model model) {
		Login lg=new Login();
		model.addAttribute("login",lg);
		return "login";
	}
	@PostMapping("/loginol")
	public String loginol(@ModelAttribute("login")Login lgn,Model model) {		
		Login login=loginServisi.girisKontrol(lgn);
		if(login.getId()!=null) {
		Login lgnsession=context.getBean("login",Login.class);
		lgnsession.setId(login.getId());
		lgnsession.setEmail(login.getEmail());
		lgnsession.setSifre(login.getSifre());		
		return "redirect:/menu";
		}else {			
			model.addAttribute("message","Kullanýcý Adý veya Þifre Hatalý.");
			Login lg=new Login();
			model.addAttribute("login",lg);
			return "login";			
		}
	}
}
