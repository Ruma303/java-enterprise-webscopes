package com.requestscope.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Enumeration;

public class HttpServletRequestExample extends HttpServlet {
    
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        PrintWriter printWriter = response.getWriter();

		printWriter.print("<h1>Request Locale: " + request.getLocale() + "</h1>");
		printWriter.print("<h1>Content Length: " + request.getContentLength() + "</h1>");
		printWriter.print("<h1>Server Name: " + request.getServerName() + "</h1>");
		printWriter.print("<h1>Content Type: " + request.getContentType() + "</h1>");
		printWriter.print("<h1>Context Path: " + request.getContextPath() + "</h1>");
		printWriter.print("<h1>Parameter (es. nome): " + request.getParameter("nome") + "</h1>");
		printWriter.print("<h1>Character Encoding: " + request.getCharacterEncoding() + "</h1>");
		printWriter.print("<h1>Request URI: " + request.getRequestURI() + "</h1>");
		printWriter.print("<h1>Protocol: " + request.getProtocol() + "</h1>");
		printWriter.print("<h1>Remote Address: " + request.getRemoteAddr() + "</h1>");
		printWriter.print("<h1>Query String: " + request.getQueryString() + "</h1>");
		printWriter.print("<h1>Method: " + request.getMethod() + "</h1>");

		
		Enumeration<String> headerNames = request.getHeaderNames();

		while (headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			String headerValue = request.getHeader(headerName);

			printWriter.print("<h2>" + headerName + " : " + headerValue + "</h2>");
		}
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doGet(request, response);
    }
}