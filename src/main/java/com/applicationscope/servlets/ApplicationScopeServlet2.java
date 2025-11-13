package com.applicationscope.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ApplicationScopeServlet2 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Best practice: mantenere un riferimento al ServletContext a livello di classe
    private ServletContext servletContext;

    @Override
    public void init(jakarta.servlet.ServletConfig config) throws ServletException {
        super.init(config);
        servletContext = config.getServletContext();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();

        // Recupero della connessione dall’application scope
        Connection connection = (Connection) servletContext.getAttribute("employee-connection-db");

        printWriter.print("<h1>Employee DB Object is Obtained from Context " + connection + "</h1>");
    }
}