<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>

</head>
<body>
	<form:form action="update" modelAttribute="cargo">
	Cargo_Type : <form:input path="cType" />
		<br>
		<br>
	
	Maximum_Cargo_Weight: <form:input path="maxCWeight" />
		<br>
		<br>

			
	Cargo_Destination: <form:input path="cDest" />
		<br>
		<br>


		<input type="submit" value="Update Information">



	</form:form>


	<a href="viewAll">ViewAllEmployees</a>
	

</body>
</html>