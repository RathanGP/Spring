<%@page import="java.util.List"%>
<%@page import="com.jsp.springmvc.studentdb.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		List<Student> students=(List) request.getAttribute("studentList");
	%>

	<h1>All student details</h1>
	<table border="">
		<tr>
			<th>StudentId</th>
			<th>StudentName</th>
			<th>StudentEmail</th>
			<th>StudentMarks</th>
			<th>update</th>
			<th>delete</th>
		</tr>
		<%
		for(Student student:students){
		%>
		<tr>
			<td><%=student.getStudentId()%></td>
			<td><%=student.getStudentName()%></td>
			<td><%=student.getStudentEmail()%></td>
			<td><%=student.getStudentMarks()%></td>
			<td><a href="updateStudent">update</a></td>
			<td><a href="deleteStudent">delete</a></td>
		</tr>
		<%} %>
	</table>
	<h1><a href="index.jsp">Back to dashboard</a></h1>
</body>
</html>