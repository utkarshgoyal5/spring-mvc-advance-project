<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<p align="right"><a href="register-user">Register</a></p>
	<h1 align="center">Love Calculator</h1>
	<form:form action="process-homepage" method="get" modelAttribute="userInfo">
		<div align="center">
			<p>
				<label for="yn">Your Name</label> <form:input id="yn"
					path="userName"></form:input>
			</p>
			<p>
				<label for="cn">Crush Name</label> <form:input id="cn"
					path="crushName"></form:input>
			</p>
			<input type="submit" value="calculate">
		</div>
	</form:form>
</body>
</html>