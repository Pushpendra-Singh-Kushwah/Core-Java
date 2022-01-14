<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>User Registration</title>

</head>
<body><br>
<%@ include file = "Header.jsp" %>
  
  <h2>Hi, Guest</h2>
<br><br>


<center>
  <h1>User Registration</h1>
  
<form action="UserRegistrationCtrl" method="get">        
<table>
    <tr>
    <td>First Name*</td>
    <td><input type="text" name="fname"></td>
    <td style="color: red ;"> <% String fn = (String) request.getAttribute("fname");
    if(fn!=null){%>
    <%=fn%> 
    <%} %></td>
  </tr> 
  <tr>
    <td>Last Name*</td>
    <td><input type="text" name="lname"></td>
    <td style="color: red ;"> <% String ln = (String) request.getAttribute("lname");
    if(ln!=null){%>
    <%=ln%>
    <%} %></td>
  </tr>
  <tr>
    <td>Login ID*</td>
    <td><input type="text" name="user" placeholder="Must be Login ID"></td> 
    <td style="color: red ;"><% String us = (String) request.getAttribute("user");
    if(us!=null){%>
    <%=us%>
    <%} %></td>
  </tr>
  <tr>
    <td>Password*</td>
    <td><input type="text" name="pwd"></td> 
    <td style="color: red ;"><% String pass = (String) request.getAttribute("pwd");
    if(pass!=null){%>
    <%=pass%>
    <%} %></td>
  </tr>
  <tr>
    <td>Confirm Password*</td>
    <td><input type="text" name="cpwd"></td> 
    <td style="color: red ;"><% String cpass = (String) request.getAttribute("cpwd");
    if(cpass!=null){%>
    <%=cpass%>
    <%} %></td>
  </tr>
  <tr>
    <td>Gender</td>
      <td><select style="background-color: whitesmoke;" name="gen"><option value="M">Male</option> <option value="F">Female</option></select> </td>
  <td style="color: red;"><% String gen = (String) request.getAttribute("gen");
    if(gen!=null){%>
    <%=gen%>
    <%} %></td>
  </tr>
  <tr>
    <td>Date Of Birth</td>
    <td><input type="date" name="dob"></td>
    <td style="color: red;"><% String dob = (String) request.getAttribute("dob");
    if(dob!=null){%>
    <%=dob%>
    <%} %></td>
  </tr>
  <tr>
    <td></td>
    <td style="text-align: center;"><input type="submit" value="SignUp" name="submit">
  
  </tr>
</table>
</form>
</center>
<br><br><br><br><br>
<%@ include file = "footer.jsp" %>
</body>
</html>