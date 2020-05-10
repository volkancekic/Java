package com.v.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping("/loginform")
	public String showLoginForm() {
		return "customlogin";
	}
	@GetMapping("/access-denied")
	public String showAccessDenied() {
		return "access-denied";
	}
}
