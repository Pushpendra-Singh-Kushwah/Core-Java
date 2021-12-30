package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Crud_Insert {
	
	public static void main(String[] args) throws Exception {
		
		testInsert();
		//testDelete();
		
	}

	public static void testDelete() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("DELETE FROM PINTO WHERE ID = 2");
		
		System.out.println(i + "\t DELETION IS DONE....VISIT AGAIN");
		
		stmt.close();
		conn.close();
		
	}

	public static void testInsert() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("INSERT INTO PINTO VALUES (2,'jaiKisan')");
		
		System.out.println(i + "\t insert");
		
		stmt.close();
		conn.close();
		
	}

}
