package com.whatsinthemicrowave.localised.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.whatsinthemicrowave.localised.dao.GreetingsDao;

@Controller
public class LoginController {
	
	private GreetingsDao greetingsDao;
	
	@Autowired
	public LoginController(final GreetingsDao greetingsDao) {
		this.greetingsDao = greetingsDao;
	}

	@RequestMapping("/login.html")
	public ModelAndView login(Locale locale) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("greetings", greetingsDao.getGreetings(locale));
		return mav;
	}
}
