package com.raystech.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "GetCokiesCtrl", urlPatterns = "/GetCokiesCtrl")
public class GetCokiesCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetCokiesCtrl() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		Cookie[] c = request.getCookies();
		for (int i = 0; i < c.length; i++) {
			Cookie ck = c[i];
			String name = ck.getName();
			String value = ck.getValue();
			out.println( name + " " +  value);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
