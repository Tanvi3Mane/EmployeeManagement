# EmployeeManagement
Simple employee management web app built using MVC with Servlets and JSP.

### Web app has two functionalities:
 1. Accepts employee details from a 'Employee Entry form' and saves to my MySQL database.
 2. Displays employee details of all employees saved in MySQL database.

# Technology 
* Java: Implemented MVC- JSP (views), JDBC (DAO), Servlets (Controller)
* Apache Tomcat Server- v8.0.30
* MySQL Database

# MySQL_Setup
Create database and employee table (emps) in MySQl using following script:
1. -- Create a database by replacing 'yourdatabasename' with a databse name of your choice. My database name is- uoaassignment
   * CREATE DATABASE yourdatabasename;  
2. -- Select database
   * Use yourdatabasename;
3. -- Create the EMPS table
   * create table emps (   
  empID    char(5),  
  ename    varchar(10),  
  job      varchar(12),  
  mgr      char(5),  
  sal      number(7,2),  
  comm     number(7,2),  
  deptID   char(3),  
  constraint pk_emps primary key (empID),  
  );
4. -- Insert multiple values in emps table using query-
   * insert into emps values ('E2468', 'Miller', 'President', null, null, 'D01');

  

