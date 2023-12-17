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
<h2 style="color:red" align="center">ANNA PAVAN SOLUTIONS</h2>
<h3 style="color:blue" align="center">User Registration page</h3>
<form:form method="POST" action="reg" commandName="user">
<center>
<table>
	<tr>
		<td>User Name</td>
		<td><form:input path="uname" size="20"/></td>
	</tr>
	<tr>
		<td>User Password</td>
		<td><form:password path="upwd" size="20" showpassword="true"/></td>
	</tr>
	<tr>
		<td>R U Married?</td>
		<td><form:checkbox path="maritalStatus1"/></td> <!-- if value not provided then boolean type -->
	</tr>
	<tr>
		<td>R U Single?</td>
		<td><form:checkbox path="maritalStatus2" value="Single"/></td> <!-- if u select it then value taken as Single or else null-->
	</tr>
	<tr>
		<td>User Qualifications</td>
		<td>
		<form:checkbox path="uqual1" value="BSC" />BSC
		<form:checkbox path="uqual1" value="MCA" />MCA
		<form:checkbox path="uqual1" value="MTECH" />MTECH
		<form:checkbox path="uqual1" value="PHD" />PHD
		</td>
	</tr>
<!-- <tr>
		<td>User Qualifications</td>
		<td>
			<form:checkboxes items="${uqual}" path="uqual2" />
		</td>
	</tr>
 -->	
    <tr>
    	<td>User Gender</td>
    	<td>
    		<form:radiobutton path = "ugender" value="Male"/>Male
    		<form:radiobutton path = "ugender" value="Female"/>Female
    	</td>
    </tr>
    <tr>
    	<td>User Work Location</td>
    	<td>
    		<form:radiobuttons path="uworklocation" items="${uworklocations}"/> <!-- items : should be equals to key vale in referenceMap present in Controller class -->
    	</td>
    </tr>
	 <tr>
	    <td>User Skill Set</td>
	    <td>
	        <form:select path="uskillset" multiple="true">
	            <form:option value="C">C</form:option>
	            <form:option value="C++">C++</form:option>
	            <form:option value="JAVA">JAVA</form:option>
	            <form:option value="PYTHON">PYTHON</form:option>
	        </form:select>
	    </td>
	</tr>
	
	<tr>
		<td>User Hobbies</td>
		<td>
			<form:select path="uhobbies" items="${uhobbies}" multiple="true"/>
		</td>
	</tr>

    <tr>
    	<td>User Profession</td>
    	<td>
    		<form:select path="uprofession"  multiple="false">
    			<form:options items="${uprofessions}"/>
    		</form:select>
    	</td>
    </tr>
    
    <tr>
    	<td>User Address</td>
    	<td>
    		<form:textarea path="uaddr"/>
    	</td>
    </tr>
    
	<tr>
		<td><input type="submit" value="Registration"/></td>
	</tr>
</table>
</center>
</form:form>

</body>
</html>