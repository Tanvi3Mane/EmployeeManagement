<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<header>
<nav class="nav" style="background-color: #ffffff ;text-align: center;padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;">
<div>
    <h1>Employee Management<h1>
  </div>
</header>
<body style="background-color:powderblue" align="center">
<br>
<br>
  <form action="<%= request.getContextPath() %>/employee_entry">
  	<input type="submit" value="Add Employee details to database" />
  </form>
  <br>
  <br>
  <form action="<%= request.getContextPath() %>/DisplayEmployees">
  	<input type="submit" value="Display all employees" />
  </form>
</body>
</html>