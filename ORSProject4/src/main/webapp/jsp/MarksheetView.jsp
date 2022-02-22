<%@page import="in.co.rays.proj4.bean.StudentBean"%>
<%@page import="in.co.rays.proj4.controller.MarksheetCtl"%>
<%@page import="in.co.rays.proj4.util.HTMLUtility"%>
<%@page import="in.co.rays.proj4.util.DataUtility"%>
<%@page import="in.co.rays.proj4.util.ServletUtility"%>
<%@page import="java.util.List"%>
<%@page import="in.co.rays.proj4.controller.ORSView"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Marksheet View</title>
</head>

<body>
	<form action="<%=ORSView.MARKSHEET_CTL%>" method="post">
		<%@include file="Header.jsp"%>
		<jsp:useBean id="bean" class="in.co.rays.proj4.bean.MarksheetBean"
			scope="request"></jsp:useBean>
		<%
			List<StudentBean> l = (List<StudentBean>) request.getAttribute("studentList");
		%>

		<center>
			<h1>Add Marksheet</h1>
			<H2>
				<font color="red"> <%=ServletUtility.getErrorMessage(request)%>
				</font>
			</H2>
			<H2>
				<font color="green"> <%=ServletUtility.getSuccessMessage(request)%>
				</font>
			</H2>


			<input type="hidden" name="id" value="<%=bean.getId()%>"> <input
				type="hidden" name="createdBy" value="<%=bean.getCreatedBy()%>">
			<input type="hidden" name="modifiedBy"
				value="<%=bean.getModifiedBy()%>"> <input type="hidden"
				name="createdDatetime"
				value="<%=DataUtility.getTimestamp(bean.getCreatedDatetime())%>">
			<input type="hidden" name="modifiedDatetime"
				value="<%=DataUtility.getTimestamp(bean.getModifiedDatetime())%>">


			<table>
				<tr>
					<th>Rollno*</th>
					<td><input type="text" name="rollNo"
						value="<%=DataUtility.getStringData(bean.getRollNo())%>"
						<%=(bean.getId() > 0) ? "readonly" : ""%>> <font
						color="red"> <%=ServletUtility.getErrorMessage("rollNo", request)%></font></td>
				</tr>
				<tr>
					<th>Name*</th>
					<td><%=HTMLUtility.getList("studentId", String.valueOf(bean.getStudentId()), l)%></td>
				</tr>
				<tr>
					<th>Physics</th>
					<td><input type="text" name="physics"
						value="<%=DataUtility.getStringData(bean.getPhysics())%>"><font
						color="red"> <%=ServletUtility.getErrorMessage("physics", request)%></font></td>
				</tr>
				<tr>
					<th>Chemistry</th>
					<td><input type="text" name="chemistry"
						value="<%=DataUtility.getStringData(bean.getChemistry())%>"><font
						color="red"> <%=ServletUtility.getErrorMessage("chemistry", request)%></font></td>
				</tr>
				<tr>
					<th>Maths</th>
					<td><input type="text" name="maths"
						value="<%=DataUtility.getStringData(bean.getMaths())%>"><font
						color="red"> <%=ServletUtility.getErrorMessage("maths", request)%></font></td>

				</tr>
				<tr>
					<th></th>
					<td colspan="2"><input type="submit" name="operation"
						value="<%=MarksheetCtl.OP_SAVE%>"> <%
 	if (bean.getId() > 0) {
 %><input type="submit" name="operation"
						value="<%=MarksheetCtl.OP_DELETE%>"> <%
 	}
 %> <input type="submit" name="operation"
						value="<%=MarksheetCtl.OP_CANCEL%>"></td>
				</tr>    
			</table>
	</form>
	</center>

	<%@include file="Footer.jsp"%>
</body>
</html>