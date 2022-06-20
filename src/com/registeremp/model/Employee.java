package com.registeremp.model;

public class Employee {
	String empID;
	String ename;
	String job;
	String mgr;
	double sal;
	double comm;
	String deptID;
	
	public Employee(String empID, String ename, String job, String mgr, double sal, double comm, String deptID) {
		super();
		this.empID = empID;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.sal = sal;
		this.comm = comm;
		this.deptID = deptID;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMgr() {
		return mgr;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public String getDeptID() {
		return deptID;
	}
	public void setDeptID(String deptID) {
		this.deptID = deptID;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", sal=" + sal
				+ ", comm=" + comm + ", deptID=" + deptID + "]";
	}
	

}
