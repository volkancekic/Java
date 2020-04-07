package com.v;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hr")
public class HrController {
		@RequestMapping("/showform")
		public String showForm() {
			return "humans/merhaba";
		}
}
