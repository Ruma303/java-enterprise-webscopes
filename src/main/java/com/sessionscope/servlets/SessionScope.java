package com.sessionscope.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SessionScope extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        PrintWriter printWriter = response.getWriter();

        // Recupero della sessione utente (crea nuova se non esistente)
        HttpSession httpSession = request.getSession();

        // Verifica se esiste già l'attributo di sessione "isVisited"
        Object sessionObj = httpSession.getAttribute("isVisited");

        if (sessionObj == null) {
            // Prima visita: imposta attributo, stampa messaggio di benvenuto
            httpSession.setAttribute("isVisited", true);
            printWriter.print("Thanks for visiting our application");
        
        } else {
        	// Visita successiva: stampa messaggio di bentornato
            printWriter.print("Welcome back");
        }
    }
}