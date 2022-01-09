<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ForgetPassword</title>
</head>
<body>
<%@ include file = "Header.jsp" %>
	<form action="ForgetPasswordCtrl" method="post">
	<br><br><br><br>
	<center><h1>You forget your password</h1>
	<input type ="text" value ="email" name="logIn">
	<input type="submit" value="getPwd" name="">
	<% String empty = (String)request.getAttribute("log");
	if(empty!=null){%>
<h1 style="color: green"><%=empty%>
<%} %></h1>
<% String psw = (String) request.getAttribute("pwd");
if(psw!=null){%> <h1 style="color: green"> <%= psw %>
<%} %>
</center>
<br>
<br>
<br>
<br>
<br>

<br>
<br>

	
	</form>
	<%@ include file = "footer.jsp" %>
</body>
</html>