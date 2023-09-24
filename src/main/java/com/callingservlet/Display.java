package com.callingservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Display", urlPatterns = { "/Display" })
public class Display extends HttpServlet {

	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			String name = request.getParameter("user_name");
			out.println("<h1>Hello!!" + name + "</h1>");

		} finally {
			out.close();
		}
	}
}
