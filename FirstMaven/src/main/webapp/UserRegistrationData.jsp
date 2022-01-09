<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserRegistrationData</title>
</head>
<body>
<% String u = request.getParameter("fname");
	String p = request.getParameter("lname");
	String s = request.getParameter("user");
	String t = request.getParameter("pwd");
	String v = request.getParameter("cpwd");
	String w = request.getParameter("gen");
	String x = request.getParameter("dob");
	String y = request.getParameter("submit");%>
	
<%=u%>
<%=p %>
<%=s%>
<%=t %>
<%=v%>
<%=w %>
<%=x%>
<%=y %>
</body>
</html>