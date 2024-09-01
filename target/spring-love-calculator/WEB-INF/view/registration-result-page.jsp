<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Result</title>
</head>
<body>
	User: ${userRegister.name} 
	<br/> 
	UserName: ${userRegister.username} 
	<br/>
	Password: ${userRegister.password} 
	<br/>
	Country: ${userRegister.country} 
	<br/>
	Hobbies:
	<c:forEach var="hobby" items="${userRegister.hobby}">
		${hobby}
	</c:forEach>
	<br/>
	Gender: ${userRegister.gender}

</body>
</html>