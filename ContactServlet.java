package com.igap.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/contact")
public class ContactServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		System.out.println("Name:" + name);
		System.out.println("Email:" + email);
		
		req.setAttribute("name", name);
		req.setAttribute("email", email);
		req.getRequestDispatcher("thankyou.jsp").forward(req, res);
	}
}
