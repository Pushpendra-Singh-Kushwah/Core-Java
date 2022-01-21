<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management Get</title>
</head>
<body bgcolor="skyblue">
	<br>
	<br>
	<br>
	<br>
	<br>
	<center>
		<h2 style="color: yellow">Search by Roll No.</h2>
		<form action="StudentManagementGetCtl" method="post">
			<table>
				<tr>
					<td>Roll No:</td>
					<td><input type="text" Name="rollNo"></td>
					<td><input type="submit" value="Get" name="getRecord">
					<td>
				</tr>
			</table>
			<a href="StudentManagementView.jsp">Back</a>
			<%
				String rn = (String) request.getAttribute("rn");
				String fn = (String) request.getAttribute("fn");
				String ln = (String) request.getAttribute("ln");
				String ss = (String) request.getAttribute("ss");
				String empty = (String) request.getAttribute("empty");
				String invalid = (String) request.getAttribute("invalid");

				if (rn != null) {%>
			<table border="1">
				<tr>
					<td>Roll No</td>
					<td>First Name</td>
					<td>Last Name</td>
					<td>Session</td>
				</tr>
				<tr>
					<td><%=rn%></td>
					<td><%=fn%></td>
					<td><%=ln%></td>
					<td><%=ss%></td>
				</tr>
			</table>
			<br>
			
			<%}%>
			<%if(empty!=null){%>
			<h2 style="color: red"><%=empty %></h2>
			<%} %>
			<%if(invalid!=null){%>
			<h2 style="color: red"><%=invalid %></h2>
			<%} %>
			
			<br>
			<h3 style="color: red"></h3>
		</form>
	</center>
</body>
</html>