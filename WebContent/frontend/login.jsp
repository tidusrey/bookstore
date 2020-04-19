<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>bookstore welcome<h1>
<h3>Have a great day</h3>
<div allign="center">
<jsp:directive.include file="header.jsp"/>
<div allign="center">
<h2>Please Login:</h2>
<form>



Email :<input type="text" size="10"><br>
Password:<input type="password" size="10">
Login<input type="submit"value="Login">

</form>
</div>


<jsp:directive.include file="footer.jsp"/>

</body>
</html>