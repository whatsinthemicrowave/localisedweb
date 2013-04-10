package com.whatsinthemicrowave.localised.viewresolver;

import java.io.File;
import java.util.Locale;

import org.springframework.web.servlet.view.JstlView;

public class LocaleJstlView extends JstlView {
	@Override
	public boolean checkResource(Locale locale) throws Exception {
		String resource = getWebApplicationContext().getServletContext().getRealPath(this.getUrl());
		File f = new File(resource);
		if(f.exists())
		    return true;
		
		return false;
	}
}
