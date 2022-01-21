package com.raystech.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentManagementGet
 */
@WebServlet(name = "StudentManagementGetCtl", urlPatterns = "/StudentManagementGetCtl")
public class StudentManagementGetCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentManagementGetCtl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentBean bean = new StudentBean();
		bean.setRollNo(request.getParameter("rollNo"));
		try {
		if (bean.getRollNo()=="") {
			RequestDispatcher rd = request.getRequestDispatcher("StudentManagementGet.jsp");
			request.setAttribute("empty", "plz enter roll no.");
			rd.forward(request, response);
		}
		else {
		
		StudentModel sm = new StudentModel();
		
			bean=sm.get(bean);
			if(bean.getFirstName()==null) {
			RequestDispatcher rd = request.getRequestDispatcher("StudentManagementGet.jsp");
			request.setAttribute("invalid", "Invalid Roll No.");
			rd.forward(request, response);
			}else if(bean.getFirstName()!=null){
				request.setAttribute("rn", bean.getRollNo());
				request.setAttribute("fn", bean.getFirstName());
				request.setAttribute("ln", bean.getLastName());
				request.setAttribute("ss", bean.getSession());
				RequestDispatcher rd = request.getRequestDispatcher("StudentManagementGet.jsp");
				rd.forward(request, response);
			}
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}

