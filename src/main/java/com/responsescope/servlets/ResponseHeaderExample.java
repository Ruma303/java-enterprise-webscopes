package com.responsescope.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ResponseHeaderExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public ResponseHeaderExample() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter printWriter = response.getWriter();
		
		response.setIntHeader("Refresh", 5);
		response.setHeader("Custom-Header", "CustomHeaderValue");
		response.setStatus(HttpServletResponse.SC_OK);
		response.setContentType("text/html");
		
		printWriter.print("<h1>This page will refresh every 5 seconds.</h1>");
		printWriter.print("<p>" + new Date() + "</p>");
		printWriter.print("<p>Custom-Header set to: " + response.getHeader("Custom-Header") + "</p>");
		printWriter.print("<p>Status Code: " + response.getStatus() + "</p>");
		printWriter.print("<p>Content Type: " + response.getContentType() + "</p>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
