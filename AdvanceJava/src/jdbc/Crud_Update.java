package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;

import com.mysql.jdbc.Statement;

public class Crud_Update {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		Statement stmt = (Statement) conn.createStatement();
		int i = stmt.executeUpdate("update pinto set name='jaiHo' where id=3");
		
		System.out.println(i + "\t insert update");
		
		stmt.close();
		conn.close();
	}

}
