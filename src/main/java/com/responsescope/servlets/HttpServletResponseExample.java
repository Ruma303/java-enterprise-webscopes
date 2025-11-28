package com.responsescope.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HttpServletResponseExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        // Imposta tipo di contenuto della risposta (header Content-Type)
        response.setContentType("text/html;charset=UTF-8");

        // Imposta uno status code personalizzato
        response.setStatus(HttpServletResponse.SC_OK); // 200

        // Imposta un header personalizzato
        response.setHeader("Refresh", "5"); // Aggiorna la pagina ogni 5 secondi

        // Scrittura della risposta HTML
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Risposta generata dalla servlet</h1>");
        writer.println("<p>Questa pagina verrà aggiornata ogni 5 secondi.</p>");
    }
}