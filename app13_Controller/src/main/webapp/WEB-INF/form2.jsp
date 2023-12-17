<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<br><br><br><br>
<h2 style="color:red" align="center">ANNA PAVAN SOLUTIONS</h2>
<h3 style="color:blue" align="center">User Registration Page</h3>
<center>
<form:form method="POST" commandName="user"> <!-- action attribute is not required as we are using AbstractWizardFormController -->
<tr>
	<br><td>User Qualification</td>
	<td><form:input path="uqual"/></td>
</tr>
<tr>
	<br><td>User Designation</td>
	<td><form:input path="udes"/></td>
</tr>
<tr>
	<td colspan="2">
	<br><input type="submit" name="_target0" value="Back"/>
	<br><input type="submit" name="_target2" value="Next"/>
	<br><input type="submit" name="_cancel" value="Cancel"/>
	</td>
</tr>
</form:form>
</center>
</body>
</html>