package com.raystech.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginCtrl", urlPatterns = "/LoginCtrl")
public class LoginCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RegistrationBean bean = new RegistrationBean();
		bean.setLoginId(request.getParameter("user"));
		bean.setPwd(request.getParameter("pwd"));
		
		String us = request.getParameter("user");
		String pw = request.getParameter("pwd");
		
		if (bean.getLoginId()=="") {
			RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");
			request.setAttribute("log", "Login is null");
			request.setAttribute("Password", "Password is null");
			rd.forward(request, response);
			
		} else {
			RegistrationModel rm= new RegistrationModel();
			try {
				//rm.authenticate(bean); 
				bean = rm.authenticate(bean);
				
				if (bean.getFirstName()==null) {
					RequestDispatcher rd = request.getRequestDispatcher("LoginView.jsp");
					request.setAttribute("wrong", "login/ password invalid");
					rd.forward(request, response);
				} else {
					RequestDispatcher rd = request.getRequestDispatcher("WelcomeView.jsp");
					request.setAttribute("Welcome", "swaagat hai");
					request.setAttribute("fName", bean.getFirstName());
					// this is for cookie(first we define here, then in getcookiectrl)
					Cookie ck1 = new Cookie("us", us );
					ck1.setMaxAge(24*60*60*7);
					response.addCookie(ck1);
					
					Cookie ck2 = new Cookie("pw", pw );
					ck2.setMaxAge(24*60*60*7);
					response.addCookie(ck2);
					// this is for session (code begun)
					HttpSession session = request.getSession();
					session.setAttribute("use", us);
					session.setAttribute("fn", bean.getFirstName());
					
					//  this is for session (code end)
					rd.forward(request, response);
					
					
					
				}
					
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}