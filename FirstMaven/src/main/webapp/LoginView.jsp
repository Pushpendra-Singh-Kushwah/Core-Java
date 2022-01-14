<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login</title>

</head>
<body>
<%@ include file = "Header.jsp" %>
	<center>
		<h1>Login</h1>
		<!-- <h2 style="color: red;">Invalid Id and Password</h2> -->
<form action="LoginCtrl" method="post">

	<% String error = (String) request.getAttribute("wrong");
	if(error!=null){%>
	<h2 align="center" style="color:red"> You have entered wrong loginID and Password</h2>
	<%  }%>
	
			<table>
				<tr>
					<td>Login ID*</td>
					<td><input type="text" name="user" placeholder="Login ID"
						size="25px"></td>
					<td style="color: red;">
					
					
	<h2 align="center" style="color:blue"></h2>
	
					</td> 
				</tr>
				<tr>
					<td>Password*</td>
					<td><input type="text" name="pwd" placeholder="password"
						size="25px"></td>
					<td style="color: red;"></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="SignIn" name=""></td>
				</tr>
			</table>
		</form>
		<h4 style="color: violet;">
			<a href="UserRegistrationView.jsp">Create an Account</a> | <a href="ForgetPasswordView.jsp">Forget My Password</a>
		</h4>
	</center>
	<%@ include file = "footer.jsp" %>
</body>
</html>