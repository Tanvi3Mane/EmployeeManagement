package com.registeremp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registeremp.dao.EmployeeDao;
import com.registeremp.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/employee_entry")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmployeeDao empDao=new EmployeeDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/RegisterEmployee.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empID=request.getParameter("empID");
		String ename=request.getParameter("ename");
		String job=request.getParameter("job");
		String mgr=request.getParameter("mgr");
		String Notification, message=null;
		int result=0;
		double sal=Double.parseDouble(request.getParameter("sal"));
		double comm=Double.parseDouble(request.getParameter("comm"));
		String deptID=request.getParameter("deptID");
		
		Employee emp=new Employee(empID,ename,job,mgr,sal,comm,deptID);
		
		try {
			result=empDao.registerEmployee(emp);
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message=e.getMessage();
		}
		if(result==1) {
			Notification="Employee saved successfully!";
		}
		else {
			Notification=message;
		}
		request.setAttribute("Notification", Notification);
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/RegisterEmployee.jsp");
		rd.forward(request, response);
		
	}

}

