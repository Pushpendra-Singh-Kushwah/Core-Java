package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Batch {
private static void testInsertBatch() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
		
		PreparedStatement ps = conn.prepareStatement("INSERT INTO PINTO VALUES (?,?)");
		
		ps.setInt(1, 14);
		ps.setString(2,"anshu");
		ps.addBatch();
		
		ps.setInt(1, 15);
		ps.setString(2,"Shiva");
		ps.addBatch();
		
		ps.setInt(1, 16);
		ps.setString(2,"Gauri");
		ps.addBatch();
		
		int count[] = ps.executeBatch();
		
		System.out.println("Inserted by using Batch");
		
		ps.close();
		conn.close();
	}

private static void testUpdateBatch() throws Exception {
	
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
	PreparedStatement ps = conn.prepareStatement("UPDATE PINTO SET NAME = ? WHERE ID=?");
	
	ps.setString(1, "Aaradhya");
	ps.setInt(2, 6);
	ps.addBatch();
	
	ps.setString(1, "Anjali");
	ps.setInt(2, 7);
	ps.addBatch();
	
	ps.setString(1, "sakshi");
	ps.setInt(2, 8);
	ps.addBatch();
	
	ps.setString(1, "surabhi");
	ps.setInt(2, 9);
	ps.addBatch();
	
	ps.executeBatch();
	
	System.out.println("update by using BATCH");
	
	ps.close(); conn.close();
	
}
	public static void main(String[] args) throws Exception {
		//testInsertBatch();
		testUpdateBatch();
	}
}
