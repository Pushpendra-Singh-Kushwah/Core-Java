package com.raystech.rb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;


public class Test_Insert_ResBundle {
private static void testInsert() throws Exception {
	
		ResourceBundle rb = ResourceBundle.getBundle("com.raystech.rb.app");
		String url = rb.getString("Url");
		String driver = rb.getString("Driver");
		String password = rb.getString("Password");
		String user = rb.getString("User");
	
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, password, user);
	
		int id =22;
		String name = "uri";
		
		PreparedStatement ps = conn.prepareStatement("INSERT INTO PINTO VALUES (?,?)");
		
		ps.setInt(1, id);
		ps.setString(2, name);
		
		ps.executeUpdate();
		System.out.println("Inserted");
		
		ps.close();

		conn.close();
	}
	public static void main(String[] args) throws Exception {
		testInsert();
	}
}
