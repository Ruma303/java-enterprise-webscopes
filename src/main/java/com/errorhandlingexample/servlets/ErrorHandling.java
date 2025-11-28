package com.errorhandlingexample.servlets;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.errorhandlingexample.exceptions.MyException;

import java.io.IOException;
import java.io.PrintWriter;

public class ErrorHandling extends HttpServlet {
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		try {
//			
//			PrintWriter out = resp.getWriter();
//			resp.setStatus(420);
//			throw new MyException("Custom exception thrown with status " + resp.getStatus());
//			
//		} catch (MyException e) {
//			resp.getWriter().write("Caught MyException: " + e.getMessage());
//		}
//	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    int z = 1 / 0; // This will cause ArithmeticException
		throw new MyException("Custom exception thrown");
	}
}
