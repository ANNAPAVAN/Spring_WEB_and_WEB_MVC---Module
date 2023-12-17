<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<br><br><br><br>
<h2 style="color:red" align="center">ANNA PAVAN SOLUTIONS</h2>
<h3 style="color:blue" align="center">User Registration Details</h3>
<center>
<table border="1">
	<tr>
		<td>First Name</td>
		<td>${user.fname}</td>
	</tr>
	<tr>
		<td>Last Name</td>
		<td>${user.lname}</td>
	</tr>
	<tr>
		<td>Qualifiction</td>
		<td>${user.uqual}</td>
	</tr>
	<tr>
		<td>Designation</td>
		<td>${user.udes}</td>
	</tr>
	<tr>
		<td>Email Id</td>
		<td>${user.uemail}</td>
	</tr>
	<tr>
		<td>Mobile</td>
		<td>${user.umobile}</td>
	</tr>
</table>
</center>
</body>
</html>