package com.registeremp.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.registeremp.model.Employee;



public class DisplayEmpDao {
	public ArrayList<Employee> displayAllEmployees() throws ClassNotFoundException, SQLException {
		String query="select * from emps";
		int result=0;
		String url="jdbc:mysql://localhost:3306/uoaassignment"; 
		String username="root";
		String password="root123";
		Employee e = null;
		int count=0;
		int i=1;
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, username,password);
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		ArrayList<Employee> employees= new ArrayList<Employee>();
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
			e=new Employee(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),
									rs.getDouble(5),rs.getDouble(6),rs.getString(7));
			System.out.println(rs.getString(1));
			employees.add(e);
		}
		
		return employees;
	}
}
