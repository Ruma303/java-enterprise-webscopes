package com.requestscope.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FormPageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//doPost(request, response);
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
		
		// Recupera nome dal form JSP
		printWriter.print("<h1>Parameter (es. nome): " + request.getParameter("userName") + "</h1>");
	}
}