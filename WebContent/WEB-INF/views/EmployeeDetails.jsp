<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.registeremp.model.Employee"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employees</title>
</head>
<header>
<nav class="nav" style="background-color: #ffffff ;text-align: center;padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;">
<div>
    <h1>Employee Management<h1>
  </div>
<div class="topnav">
  <a class="nav-link" href="<%= request.getContextPath() %>/employee_entry">Add Employees</a>
</div>
</nav>
</header>
<body style="background-color:powderblue">
	<table border ="1" width="500" align="center">
         <tr bgcolor="">
          <th><b>Employee ID</b></th>
          <th><b>Employee Name</b></th>
          <th><b>Job</b></th>
          <th><b>MGR</b></th>
          <th><b>Salary</b></th>
          <th><b>Compensation</b></th>
          <th><b>Department ID</b></th>
         </tr>
        <%-- Fetching the attributes of the request object
             which was previously set by the servlet 
              "StudentServlet.java"
        --%> 
        <%ArrayList<Employee> emps=
        (ArrayList<Employee>)request.getAttribute("employees");
        for(Employee e:emps){%>
        <tr>
                <td><%=e.getEmpID()%></td>
                <td><%=e.getEname()%></td>
                <td><%=e.getJob()%></td>
                <td><%=e.getMgr()%></td>
                <td><%=e.getSal()%></td>
                <td><%=e.getComm()%></td>
                <td><%=e.getDeptID()%></td>
            </tr>
        <%}%>
        </table> 
    
</body>
</html>