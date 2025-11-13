package com.applicationscope.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ApplicationScopeServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Connessione memorizzata come attributo di application scope
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		try {
			// Step 1: Caricamento driver JDBC
			Class.forName("com.mysql.jdbc.Driver"); 

			// Step 2: Apertura connessione 
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root",
					"root");

			printWriter.print("<h2>Employee DB Connection Object : " + connection + "</h2>");

			// Step 3: Condivisione oggetto creando un oggetto in application scope
			getServletContext().setAttribute("employee-connection-db", connection);

		} catch (Exception e) {
			e.printStackTrace();
			printWriter.print("<h2>Exception in opening connection to Employee DB : " + e.getMessage() + "</h2>");
		}
	}
}
