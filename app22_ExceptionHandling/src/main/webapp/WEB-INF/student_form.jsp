<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Registration</title>
</head>
<body>
    <h2 style="color:red; text-align:center;">ANNA PAVAN SOLUTIONS</h2>
    <h3 style="color:blue; text-align:center;">Student Registration Form</h3>
    <form:form method="POST" action="reg" modelAttribute="student">
        <center>
            <table>
                <tr>
                    <td>Student Id</td>
                    <td><form:input path="sid"/></td>
                </tr>
                <tr>
                    <td>Student Name</td>
                    <td><form:input path="sname"/></td>
                </tr>
                <tr>
                    <td>Student Marks</td>
                    <td><form:input path="smarks"/></td>
                </tr>
                <tr>
                    <td>Student Email</td>
                    <td><form:input path="semail"/></td>
                </tr>
                <tr>
                    <td>Student Mobile</td>
                    <td><form:input path="smobile"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Register"/></td>
                </tr>
            </table>
        </center>   
    </form:form>
</body>
</html>
