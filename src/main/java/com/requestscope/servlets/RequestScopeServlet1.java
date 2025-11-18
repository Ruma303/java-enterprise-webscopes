package com.requestscope.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RequestScopeServlet1 extends HttpServlet {
    
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        // Imposta un attributo visibile solo per questa richiesta
        request.setAttribute("messaggio", "Dati passati tramite request scope");

        // Inoltra la richiesta a un’altra servlet o JSP
        request.getRequestDispatcher("/elaboraMessaggio").forward(request, response);
    }
}