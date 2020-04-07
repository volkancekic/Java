package com.v;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	@RequestMapping("/")
	public String showFaktoriyel() {
		return "faktoriyel";
	}
	
	@RequestMapping("/faktoriyel_sonuc")
	public String showFaktoriyelSonuc(HttpServletRequest request,Model model) {
		int sayi=Integer.valueOf(request.getParameter("sayi"));
		int sonuc=1;
		if(sayi!=0) {
		
			for(int i=sayi;i>0;i--) {
				sonuc*=i;
			}
		}
		String mesaj=String.valueOf(sonuc);
		model.addAttribute("gelen_sonuc",mesaj);
		return "faktoriyel_sonuc";
	}
	
}
