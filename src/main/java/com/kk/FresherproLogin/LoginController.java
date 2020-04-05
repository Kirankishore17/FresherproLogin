package com.kk.FresherproLogin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Welcome, you have entered the right username and password";
	}
}
