package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class Firstjdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
		  String url = "jdbc:mysql://localhost:3306/youtube";
		  String userName = "root";
		  String userPassword = "Ambik@24";
		  
		  Connection con = DriverManager.getConnection(url,userName,userPassword);
		  
		  if (con.isClosed()) 
		  {
			System.out.println("connection is closed......");
		  }
		  else
		  {
			  System.out.println("connection create....");
		  }
	     } 
    catch (Exception e) 
    {
		// TODO: handle exception
    	e.printStackTrace();
	}
	}

}
