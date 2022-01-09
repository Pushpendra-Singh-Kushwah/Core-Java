package com.raystech.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "WelcomeCtrl", urlPatterns = "/WelcomeCtrl")
public class WelcomeCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		RegistrationModel bean = new RegistrationModel();
		
		RequestDispatcher rd = request.getRequestDispatcher("WelcomeView.jsp");
		request.setAttribute("fname", bean.getFirstName());
		rd.forward(request, response);
		
		}

	}

