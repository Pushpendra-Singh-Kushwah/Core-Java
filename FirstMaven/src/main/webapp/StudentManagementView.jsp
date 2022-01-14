<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management</title>
</head>
<body bgcolor="lightgreen">
<center>
<br><br><br><br><br>
<h2 style="color: Blue">Student Management</h2>
<form action="StudentManagementCtl.jsp" method="post">
<table>
<tr><td>Roll No:</td><td><input type="text" Name="rollNo"></td></tr>
<tr><td> First Name:</td><td><input type="text" Name="firstName"></td></tr>
<tr><td> Last Name:</td><td><input type="text" Name="lastName"></td></tr>
<tr><td> Session:</td><td><input type="text" Name="session"></td></tr>
<tr><td></td><td>
<input type="submit" value="Add" Name="operation">
<input type="submit" value="Delete" Name="operation">
<input type="submit" value="Modify" Name="operation"></td></tr>
</table></form>
</center>
</body>
</html>