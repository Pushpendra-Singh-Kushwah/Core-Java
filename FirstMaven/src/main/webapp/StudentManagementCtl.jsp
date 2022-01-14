<%@page import="com.raystech.student.StudentModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentManagementCtl</title>
</head>
<body>
	
	
	 <jsp:useBean id="bean" scope="page" class="com.raystech.student.StudentBean"/>
	 <jsp:setProperty name="bean" property="*"/>
	 
		<%--
		
		<%@page import="com.raystech.student.StudentBean" %>
		
		 <%
	StudentBean bean = new StudentBean();
	bean.setRollNo(request.getParameter("rollNo"));
	bean.setFirstName(request.getParameter("firstName"));
	bean.setLastName(request.getParameter("lastName"));
	bean.setSession(request.getParameter("session"));
	%> --%>
	
	
	<%
	String op = request.getParameter("operation");
	
	if(op.equals("Add")){StudentModel.add(bean);
	}
	else if(op.equals("Delete")){
		StudentModel.delete(bean);
	}
	else if(op.equals("Modify")){
		StudentModel.update(bean);
	}
	response.sendRedirect("StudentManagementView.jsp");
	%>
</body>
</html>





