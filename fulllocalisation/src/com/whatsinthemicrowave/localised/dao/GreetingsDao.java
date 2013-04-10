package com.whatsinthemicrowave.localised.dao;

import java.util.Locale;

import org.springframework.stereotype.Component;

@Component
public class GreetingsDao {
	public String getGreetings(Locale l) {
		if (l.toString().equals("zh_CN")) {
			return "欢迎，请登录。";
		} else if (l.toString().equals("fr")) {
			return "Bienvenue, connecter s'il vous plaît.";
		}
		return "Welcome, please sign in.";
	}
}
