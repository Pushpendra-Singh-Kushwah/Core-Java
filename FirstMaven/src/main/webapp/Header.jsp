<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
</head>
<body>
<%if(session.getAttribute("fn")==null){%>
<h2>Welcome Guest
<%}else{ %>
Welcome
<%=session.getAttribute("fn") %>
<%} %>
</h2>
<br>

	<img src="customLogoOuterglow.png" align="right">
	<br>
	<br>
	<br>
	<br>
	<br>
	
	
<hr size="2" color="Black">
<% String block = (String) request.getAttribute("fName"); 
if(block!=null){%>
	<p>
		<a href="">Get Marksheet</a> | <a href="">Marksheet Merit List</a> | <a
			href="">My Profile</a> | <a href="">Change Password</a> | <a href=""></a>
		| <a href="">Java Doc</a> | <a href="">Add Marksheet</a> | <a href="">Marksheet
			List</a> | <a href="">Add User</a> | <a href="">User List</a> | <a
			href="">Add College</a> | <a href="">College List</a> | <a href="">Add
			Student</a> | <a href="">Student List</a> | <a href="">Add role</a> | <a
			href="">Role List</a> | <a href="">Add role</a> | <a
			href="LogoutView.jsp">Log out</a>
	</p>
	<hr size="2" color="Black">
	<%} %>
</body>
</html>