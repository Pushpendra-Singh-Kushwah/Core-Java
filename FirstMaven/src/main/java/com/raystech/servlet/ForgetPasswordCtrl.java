package com.raystech.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ForgetPasswordCtrl", urlPatterns = "/ForgetPasswordCtrl")

public class ForgetPasswordCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RegistrationBean bean = new RegistrationBean();
		RegistrationModel rm= new RegistrationModel();
		
		bean.setLoginId(request.getParameter("logIn"));
		try {
			bean = rm.forgatePassword(bean);
		if (bean.getPwd()==null) {
			RequestDispatcher rd = request.getRequestDispatcher("ForgetPasswordView.jsp");
			request.setAttribute("log", "You have not enter your username");
			rd.forward(request, response);
			
			
		} else {RequestDispatcher rd = request.getRequestDispatcher("ForgetPasswordView.jsp");
		request.setAttribute("pwd", bean.getPwd());
		rd.forward(request, response);

		}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					}

	
}
		
		
		
		
		
		