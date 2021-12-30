package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Crud_Select {
	
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT ID, FNAME, LNAME, SALARY FROM EMPLOYEE");
		
		System.out.println("\t ID \t FNAME \t LNAME \t SALARY");
		
		while(rs.next()) {
			
			System.out.print("\t" + rs.getString(1));
			System.out.print("\t" +rs.getString(2));
			System.out.print("\t" +rs.getString(3));
			System.out.println("\t" +rs.getString(4));
			
		}
		stmt.close();
		conn.close();
	}
	
}
