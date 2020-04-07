package com.v2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/anket")
public class AnketController {

	
		@RequestMapping("/showform")
		public String showform1(Model model) {
			
			Anket anket=new Anket();
			model.addAttribute("anket",anket);
			return "anketform1";
		}
		@RequestMapping("/showform2")
		public String showform1(@ModelAttribute("anket1") Anket anket,Model model) {
			
		
			return "anketform2";
		}
		@RequestMapping("/anketconfirm")
		public String savePersonel(@ModelAttribute("anket2") Anket anket) {
			
			
			return "anketconfirm";
		}
		
		
	}


