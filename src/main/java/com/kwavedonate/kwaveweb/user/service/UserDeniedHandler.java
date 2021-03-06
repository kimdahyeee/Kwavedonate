package com.kwavedonate.kwaveweb.user.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

public class UserDeniedHandler implements AccessDeniedHandler {

	private static final Logger logger = LoggerFactory.getLogger(UserDeniedHandler.class);

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException ade)
			throws IOException, ServletException {
		// TODO Auto-generated method stub

		logger.info("Exceiption : {}", ade);
		logger.info("LocalizedMessage : {}", ade.getLocalizedMessage());
		logger.info("Message : {}", ade.getMessage());
		logger.info("StackTrace : {}", ade.getStackTrace());

		
		response.sendRedirect("/common/error/403");
	}

}
