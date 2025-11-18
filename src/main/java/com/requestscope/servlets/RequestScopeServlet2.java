package com.requestscope.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RequestScopeServlet2 extends HttpServlet {
    
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
	    String message = (String) request.getAttribute("messaggio");
		response.getWriter().print("Messaggio ricevuto: " + message);
    }
}