<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<br><br><br>
<h2 style="color:red" align="center">ANNA PAVAN SOLUTIONS</h2>
<h3 style="color:blue" align="center">Student Edit Page</h3><br>
<form method="POST" action="update"> <!-- update: form submitted to update method in StudentController class -->
<center>
<table>
	<tr>
		<th>Student Id</th>
		<td>${sto.sid}<input type="hidden" name="sid" value='${sto.sid}'/></td>
	</tr>
	<tr>
		<th>Student Name</th>
		<td><input type="text" name="sname" value='${sto.sname}'/>  </td>
	</tr>
	<tr>
		<th>Student Address</th>
		<td><input type="text" name="saddr" value='${sto.saddr}'/> </td>
	</tr>
	<tr>
		<td>
			<input type="submit" value="UPDATE"/>
		</td>
	</tr>
</table>
</center>
</form>


</body>
</html>