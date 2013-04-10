package com.whatsinthemicrowave.multilang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login.html")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
}
