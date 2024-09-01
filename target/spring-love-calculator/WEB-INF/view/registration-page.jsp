<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr />
	<div align="center">
		<h2 align="center">Please Register here</h2>
		<form:form action="process-user-registration" method="get"
			modelAttribute="userRegister">
			<p>
				<label for="name">Name</label>
				<form:input id="name" path="name"></form:input>
			</p>
			<p>
				<label for="username">User Name</label>
				<form:input id="username" path="username"></form:input>
			</p>
			<p>
				<label for="password">Password</label>
				<form:password id="password" path="password"></form:password>
			</p>
			<p>
				<label for="country">Country</label>
				<form:select id="country" path="country">
					<form:option value="India" label="India"></form:option>
					<form:option value="US" label="United States"></form:option>
					<form:option value="UK" label="United Kingdom"></form:option>
					<form:option value="Germany" label="Germany"></form:option>
				</form:select>
			</p>
			<p>
				<label for="hobby">Hobby:</label>
				<form:checkbox id="hobby" path="hobby" value="cricket"></form:checkbox>
				<form:label path="hobby">Cricket</form:label>
				<form:checkbox id="hobby" path="hobby" value="reading"></form:checkbox>
				<form:label path="hobby">Reading</form:label>
				<form:checkbox id="hobby" path="hobby" value="traveling"></form:checkbox>
				<form:label path="hobby">Traveling</form:label>
				<form:checkbox id="hobby" path="hobby" value="programming"></form:checkbox>
				<form:label path="hobby">Programming</form:label>
			</p>
			<p>
				<label for="gender">Gender:</label>
				<form:radiobutton id="gender" path="gender" value="male"></form:radiobutton>
				<form:label path="gender">Male</form:label>
				<form:radiobutton id="gender" path="gender" value="female"></form:radiobutton>
				<form:label path="gender">Female</form:label>
			</p>
			<input type="submit" value="register">

		</form:form>

	</div>
</body>
</html>