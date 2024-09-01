<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>
</head>
<body>
	<p align="right">
		<a href="register-user">Register</a>
	</p>
	<h1 align="center">Love Calculator</h1>
	<form:form action="process-homepage" method="get"
		modelAttribute="userInfo">
		<div align="center">
			<p>
				<label for="yn">Your Name</label>
				<form:input id="yn" path="userName"></form:input>
				<form:errors path="userName" cssClass="error"></form:errors>
			</p>
			<p>
				<label for="cn">Crush Name</label>
				<form:input id="cn" path="crushName"></form:input>
				<form:errors path="crushName" cssClass="error"></form:errors>
			</p>
			<p>
				<form:checkbox id="tac" path="termAndConditions"></form:checkbox>
				<label for="tnc">You are agreeing that this is for fun.</label>
				<form:errors path="termAndConditions" cssClass="error"></form:errors>
			</p>
			<input type="submit" value="calculate">
		</div>
	</form:form>
</body>
</html>