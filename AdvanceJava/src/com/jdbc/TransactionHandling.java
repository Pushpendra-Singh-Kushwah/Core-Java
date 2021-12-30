package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionHandling {
	
	public static void main(String[] args) throws Exception {
		//testCommit();
		testRollback();
	}

	private static void testCommit() throws Exception{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		conn.setAutoCommit(false);
		
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("INSERT INTO PINTO VALUES (15,'basic')");
			i = stmt.executeUpdate("INSERT INTO PINTO VALUES (11,'exception')");
			i = stmt.executeUpdate("INSERT INTO PINTO VALUES (12,'collaction')");
			i = stmt.executeUpdate("INSERT INTO PINTO VALUES (13,'oop')");
		
			
		conn.commit();
		System.out.println("values inserted successfully bcoz all values are unique, if any one 							value is duplicate by id then it is not possible");
		
		stmt.close();
		conn.close();
		
	}
	
	private static void testRollback() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		conn.setAutoCommit(false);
		
		Statement stmt = conn.createStatement();
		try { int i = stmt.executeUpdate("INSERT INTO PINTO VALUES (10,'basic is basic')");
		i = stmt.executeUpdate("INSERT INTO PINTO VALUES (16,'exception')");
		i = stmt.executeUpdate("INSERT INTO PINTO VALUES (12,'collaction is collection')");
		i = stmt.executeUpdate("INSERT INTO PINTO VALUES (18,'oop')");
	
		conn.commit();
		System.out.println("values : ");
		}catch(SQLException e) { 
			conn.rollback();
			System.out.println(e.getMessage());
		}
		
		stmt.close();
		conn.close();
		
		
	}
	
}
