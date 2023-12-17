<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<br><br>
<h2 style="color:red" align="center">ANNA PAVAN SOLUTIONS</h2>
<h3 style="color:blue" align="center">User Registration Details</h3>
<center>
<table border="1">
	<tr>
		<td>User Name</td>
		<td>${user.uname}</td>
	</tr>
	<tr>
		<td>User Password</td>
		<td>${user.upwd}</td>
	</tr>
	<tr>
		<td>Marital Status?</td>
		<td>${user.maritalStatus1}</td>
	</tr>
	<tr>
		<td>Sigle or Married?</td>
		<td>${user.maritalStatus2}</td>
	</tr>
	<tr>
		<td>User Qualifications</td> 
		<!--  before Using foreach -->
		<!-- C:\Users\pavan\Downloads\apache-tomcat-9.0.83-windows-x64\apache-tomcat-9.0.83\webapps\examples\WEB-INF\lib -->
		<!-- paste those two jars (taglibs-standard-impl-1.2.5 , taglibs-standard-spec-1.2.5) in lib -->
		
		 <td>
	        <c:forEach var="qual1" items="${user.uqual1}">
	            <c:out value="${qual1}"/><br>
	        </c:forEach>
    	</td>
	</tr>
<!--<tr>
		<td>User Qualifications</td> 
		 <td>
	        <c:forEach var="qual2" items="${user.uqual2}">
	            <c:out value="${qual2}"/><br>
	        </c:forEach>
    	</td>
	</tr>
  -->	
    <tr>
    	<td>Gender</td>
    	<td>${user.ugender}</td> 
    </tr>
	<tr>
	    <td>User Work Location</td>
	    <td>${user.uworklocation}</td> 
	</tr>
   	<tr>
		<td>User Skill Set</td> 

		 <td>
	        <c:forEach var="skill" items="${user.uskillset}">
	            <c:out value="${skill}"/><br>
	        </c:forEach>
    	</td>
	</tr>
    
     <tr>
		<td>User Hobbies</td> 

		 <td>
	        <c:forEach var="hobby" items="${user.uhobbies}">
	            <c:out value="${hobby}"/><br>
	        </c:forEach>
    	</td>
	</tr>
    
    <tr>
    	<td>user Profession</td>
    	<td>${user.uprofession}</td>
    </tr>
	 
	<tr>
		<td>User Address</td>
		<td>${user.uaddr}</td>
	</tr>
</table>
<h3>
<a href="reg">Registration Form</a>
</h3>
</center>
</body>
</html>