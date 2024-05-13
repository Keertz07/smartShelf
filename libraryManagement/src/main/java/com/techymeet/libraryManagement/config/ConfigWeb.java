package com.techymeet.libraryManagement.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class ConfigWeb extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebServlet.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
