<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 style="color:red" align="center">ANNA PAVAN SOLUTIONS</h2>
<h3 style="color:blue" align="center">Student Update Page</h3>
<form method="POST" action="editform"> <!-- editform: method name in StudentController class -->
<center>
<table>
	<tr>
		<td>Student Id </td>
		<td><input type="text" name="sid"/></td>
	</tr>
	<tr><td><input type="submit" value="Get Edit Form"/></td></tr>
</table>
</center>
</form>
</body>
</html>