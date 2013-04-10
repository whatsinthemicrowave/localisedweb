package com.whatsinthemicrowave.localised.viewresolver;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.AbstractUrlBasedView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

public class LocaleViewResolver extends UrlBasedViewResolver {
	@Override
	protected View loadView(String viewName, Locale locale) throws Exception {
		AbstractUrlBasedView view = buildView(viewName + "_" + locale.toString());
		View result = (View) getApplicationContext().getAutowireCapableBeanFactory().initializeBean(view, viewName);
		return (view.checkResource(locale) ? result : null);
	}

	@Override
	protected Object getCacheKey(String viewName, Locale locale) {
		return viewName + "_" + locale.toString();
	}
}
