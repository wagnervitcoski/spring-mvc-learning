<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">
	First name: <form:input path="firstName"/>
	<br><br>
	Last name: <form:input path="lastName"/>
	<br>
	Country: <form:select path="country">
				<form:options items="${countries}" />
			</form:select>
	<input type="submit" value="Submit">
</form:form>

</body>
</html>