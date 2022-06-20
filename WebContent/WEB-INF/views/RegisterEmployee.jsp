<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Entry</title>
</head>
<header>
<nav class="nav" style="background-color: #ffffff ;text-align: center;padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;">
<div>
    <h1>Employee Management<h1>
  </div>
<div class="topnav">
  <a class="nav-link" href="<%= request.getContextPath() %>/DisplayEmployees">Display Employees</a>
</div>
</nav>
</header>
<body style="background-color:powderblue">
 <div align="center">
  <h1>Employee Entry Form</h1>
  <form action="<%= request.getContextPath() %>/employee_entry" method="post">
   <table style="with: 80%">
    <tr>
     <td>Employee ID</td>
     <td><input type="text" name="empID" /></td>
    </tr>
    <tr>
     <td>Employee Name</td>
     <td><input type="text" name="ename" /></td>
    </tr>
    <tr>
     <td>Job</td>
     <td><input type="text" name="job" /></td>
    </tr>
    <tr>
     <td>MGR</td>
     <td><input type="text" name="mgr" /></td>
    </tr>
    <tr>
     <td>Salary</td>
     <td><input type="number" name="sal" /></td>
    </tr>
    <tr>
     <td>Compensation</td>
     <td><input type="number" name="comm" /></td>
    </tr>
    <tr>
     <td>Department ID</td>
     <td><input type="text" name="deptID" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
  
 
  <p>${Notification}</p>
 
 </div>
</body>
</html>