package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class Crud_CallableStatement {
	
	public static void main(String[] args) throws Exception {
		
		//testCallStored();
		testCallFunction();
	}

	private static void testCallFunction() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
		
		CallableStatement callStmt = conn.prepareCall("{?=Call emp1_count()}");
		
		callStmt.registerOutParameter(1, Types.INTEGER);
	
		callStmt.execute();
		
		System.out.println("count by function call: " + callStmt.getInt(1));
		
		callStmt.close();
		conn.close();
	}

	private static void testCallStored() throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
		
		CallableStatement callStmt = conn.prepareCall("{Call emp_count(?)}");
		callStmt.registerOutParameter(1,Types.INTEGER);
		
		callStmt.execute();
		
		int count = callStmt.getInt(1);
		System.out.println("Count is " + count);
		
		conn.close();
		callStmt.close();
		
	}
}
