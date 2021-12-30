package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Crud_PreparedStatement {

	public static void main(String[] args) throws Exception {
				
		//testInsert();
		//testUpdate();
		//testDelete();
		testSelect();
		//testget(3);
				
	}

	private static void testget(int x) throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		PreparedStatement ps = conn.prepareStatement("select * from employee where id= ?");
		ps.setInt(1, x);
		ResultSet rs = ps.executeQuery();
		
		System.out.println("\t ID  \t Name");
		
		rs.next();
		System.out.print("\t" + rs.getString(1));
		System.out.print("\t" +rs.getString(2));
		
		rs.close();
		conn.close();
		
	}

	private static void testSelect() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		PreparedStatement ps = conn.prepareStatement("select * from employee");
		ResultSet rs = ps.executeQuery();
		
		System.out.println("\t ID \t FNAME \t LNAME \t SALARY");
		
		while(rs.next()) {
			
			System.out.print("\t" + rs.getString(1));
			System.out.print("\t" +rs.getString(2));
			System.out.print("\t" +rs.getString(3));
			System.out.println("\t" +rs.getString(4));
		}	
		
		ps.close();
		conn.close();
		
	}

	private static void testDelete() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		int id = 3;
		
		PreparedStatement ps = conn.prepareStatement("delete from pinto where id= ?");
		
		ps.setInt(1, id);
		
		ps.executeUpdate();
		System.out.println("Deleted");
		
		ps.close();
		conn.close();
		
		
	}

	private static void testUpdate() throws Exception{
					
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		int id = 3;
		String name = "Indore";
		
		PreparedStatement ps = conn.prepareStatement("UPDATE PINTO SET NAME =? WHERE ID =?");
		
		ps.setString(1, name);
		ps.setInt(2, id);
		
		ps.executeUpdate();
		System.out.println("updated");
		
		ps.close();
		conn.close();
		
	}

	private static void testInsert() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		int id = 4;
		String name = "bharat";
		
		PreparedStatement ps = conn.prepareStatement("INSERT INTO PINTO VALUES (?,?)");
		
		ps.setInt(1, id);
		ps.setString(2, name);
		
		ps.executeUpdate();
		System.out.println("Inserted");
		
		ps.close();
		conn.close();
	}

}
