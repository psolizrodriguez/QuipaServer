package com.quipa.common.aspect;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.DispatcherServlet;

public class BaseDispatcherServlet extends DispatcherServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		// ServletContext context = config.getServletContext();

		try {
			if (Logger.getLogger(BaseDispatcherServlet.class) == null) {
				System.out.println("Logger is Null...");
			} else {
				System.out.println("Logger is Initialized....");
			}

		} catch (Exception e) {
			System.out.println(" exception = " + e);
			e.printStackTrace();
		}
	}
}