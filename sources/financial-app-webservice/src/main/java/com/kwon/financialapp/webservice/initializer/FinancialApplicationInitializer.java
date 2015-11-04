package com.kwon.financialapp.webservice.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.kwon.financialapp.webservice.config.RestConfiguration;
import com.kwon.financialapp.webservice.config.ServiceConfiguration;

/**
 * The application initializer
 * which load the configuration file to
 * <br> - Root context
 * <br> - Servlet context
 * @author SEASHELL
 */
public class FinancialApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {ServiceConfiguration.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {RestConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
