package com.quipa.common.aspect;

import java.net.InetAddress;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.DispatcherServlet;

import com.quipa.common.constants.AppBaseConstantsWeb;

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
				AppBaseConstantsWeb.SERVER_URL = InetAddress.getLocalHost().getHostName();
			} else {
				System.out.println("Logger is Initialized....");
			}

		} catch (Exception e) {
			System.out.println(" exception = " + e);
			e.printStackTrace();
		}
	}
}