<%@page import="com.raystech.student.StudentBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management Search</title>
</head>
<body bgcolor="Lightpink">
<center>
<h2 style="color:green">List of Students</h2>
<form action="StudentManagementSearchCtl">

	<input type="submit" value="Show List">
	<a href="StudentManagementView.jsp">Back</a>

<%List<StudentBean> listSb = (List<StudentBean>) request.getAttribute("list");
if(listSb!=null){%>
<table border="5px">
<tr><td>RollNo</td><td>First Name</td><td>Last Name</td><td>Session</td>
</tr>
<%for(StudentBean a : listSb) {%>
<tr><td><%=a.getRollNo() %></td><td><%=a.getFirstName() %></td><td><%=a.getLastName() %></td><td><%=a.getSession() %></td></tr>
<%} %>
</table>
<%} %>
</form>
</center>
</body>
</html>