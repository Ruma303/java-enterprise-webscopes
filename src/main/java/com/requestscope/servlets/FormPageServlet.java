package com.requestscope.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FormPageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/formRequestPage.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter printWriter = response.getWriter();

		printWriter.print("<h1>Request Locale: " + request.getLocale() + "</h1>");
		printWriter.print("<h1>Content Length: " + request.getContentLength() + "</h1>");
		printWriter.print("<h1>Server Name: " + request.getServerName() + "</h1>");
		printWriter.print("<h1>Content Type: " + request.getContentType() + "</h1>");
		printWriter.print("<h1>Context Path: " + request.getContextPath() + "</h1>");
		
		// Recupera parametri dal form JSP
		printWriter.print("<h1>Parameter (es. nome): " + request.getParameter("userName") + "</h1>");
		printWriter.print("<h1>Country: " + request.getParameter("country") + "</h1>");
		
		// Recupero Header di richiesta HTTP
		Enumeration<String> headerNames = request.getHeaderNames();

		while (headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			String headerValue = request.getHeader(headerName);

			printWriter.print("<h2>" + headerName + " : " + headerValue + "</h2>");
		}
	}
}