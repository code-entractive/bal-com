<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="core" uri="http://www.springframework.org/tags/form" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login form</title>
</head>
 <body>

<center><h1 style="color: red">Welcome to Balco ecommerce web application</h1></center>
<center><h1 style="color: red">Please enter your login id and password</h1></center>


<core:form action="loginAction" commandName="user">



<core:button > login </core:button>

</core:form>


</body>
</html>