//Oracle code is commented, mysql code is used


/*package com.registeremp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.registeremp.model.Employee;

public class EmployeeDao {
	public int registerEmployee(Employee emp) throws SQLException, ClassNotFoundException {
		String query="Insert into emps (empid, ename, job, mgr, sal, comm, deptid) values (?,?,?,?,?,?,?)";
		int result=0;
		String url="jdbc:oracle:thin:@localhost:1522:XE"; 
		String username="system";
		String password="root123";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(url, username,password);
		
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1, emp.getEmpID());
		st.setString(2, emp.getEname());
		st.setString(3, emp.getJob());
		st.setString(4, emp.getMgr());
		st.setDouble(5,emp.getSal());
		st.setDouble(6, emp.getComm());
		st.setString(7, emp.getDeptID());
		
		System.out.println(st);
		result=st.executeUpdate();
		
		return result;
		
		
		
		
	}

}
*/



// MYSQL Code-
package com.registeremp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.registeremp.model.Employee;

public class EmployeeDao {
	public int registerEmployee(Employee emp) throws SQLException, ClassNotFoundException {
		String query="Insert into emps (empid, ename, job, mgr, sal, comm, deptid) values (?,?,?,?,?,?,?);";
		int result=0;
		String url="jdbc:mysql://localhost:3306/uoaassignment"; 
		String username="root";
		String password="root123";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, username,password);
		
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1, emp.getEmpID());
		st.setString(2, emp.getEname());
		st.setString(3, emp.getJob());
		st.setString(4, emp.getMgr());
		st.setDouble(5,emp.getSal());
		st.setDouble(6, emp.getComm());
		st.setString(7, emp.getDeptID());
		
		System.out.println(st);
		result=st.executeUpdate();
		
		return result;
		
		
		
		
	}

}

