package com.raystech.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UserRegistrationCtrl", urlPatterns = "/UserRegistrationCtrl")
public class UserRegistrationCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		if (request.getParameter("fname")=="") {
			RequestDispatcher rd = request.getRequestDispatcher("UserRegistrationView.jsp");
			request.setAttribute("fname", "plz enter FIRST NAME");
			rd.forward(request, response);
			} 
		else if (request.getParameter("lname")=="") {
			RequestDispatcher rd = request.getRequestDispatcher("UserRegistrationView.jsp");
			request.setAttribute("lname", "plz enter LAST NAME");
			rd.forward(request, response);
		}
		else if (request.getParameter("user")=="") {
			RequestDispatcher rd = request.getRequestDispatcher("UserRegistrationView.jsp");
			request.setAttribute("user", "plz enter Login ID");
			rd.forward(request, response);
		}
		else if (request.getParameter("pwd")=="") {
			RequestDispatcher rd = request.getRequestDispatcher("UserRegistrationView.jsp");
			request.setAttribute("pwd", "plz enter Password");
			rd.forward(request, response);
		}
		else if (request.getParameter("cpwd")=="") {
			RequestDispatcher rd = request.getRequestDispatcher("UserRegistrationView.jsp");
			request.setAttribute("cpwd", "plz enter Confirm Password");
			rd.forward(request, response);
		}
		else if (request.getParameter("gen")=="") {
			RequestDispatcher rd = request.getRequestDispatcher("UserRegistrationView.jsp");
			request.setAttribute("gen", "plz enter GENDER");
			rd.forward(request, response);
		}
		else if (request.getParameter("dob")=="") {
			RequestDispatcher rd = request.getRequestDispatcher("UserRegistrationView.jsp");
			request.setAttribute("dob", "plz enter DOB");
			rd.forward(request, response);
		}
		
		else {

		RegistrationBean bean = new RegistrationBean();
		bean.setFirstName(request.getParameter("fname"));
		bean.setLastName(request.getParameter("lname"));
		bean.setLoginId(request.getParameter("user"));
		bean.setPwd(request.getParameter("pwd"));
		bean.setConfirmpwd(request.getParameter("cpwd"));
		bean.setGender(request.getParameter("gen"));
		bean.setDob(request.getParameter("dob"));
		
//PrintWriter out = response.getWriter();
//out.print("its me");
		
		RegistrationModel model = new RegistrationModel();
		try {
			model.add(bean);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
}
