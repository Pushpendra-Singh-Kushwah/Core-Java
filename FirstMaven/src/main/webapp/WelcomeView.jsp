<%@page import="com.raystech.servlet.RegistrationBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<form action="LoginCtrl" method="post">
<body bgcolor="lightpink">
<%@ include file = "Header.jsp" %>
<h2>hi,<%  String ss = (String) request.getAttribute("fName");%>
<%=ss  %>
</h2>

<h1 style="color: blue" align="center">Welcome</h1>
<br><br><br><br>
<a href="GetCokiesCtrl">cokies</a>
<br><br><br><br><br><br>


</form>
	<%@ include file = "footer.jsp" %>
</body>
</html>