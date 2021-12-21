package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Crud_Insert {
	
	public static void main(String[] args) throws Exception {
		
		testSelect();
	}

	public static void testSelect() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		Statement stmt = conn.createStatement();
		int i = stmt.executeUpdate("INSERT INTO PINTO VALUES (3,'jaiKisan')");
		
		System.out.println(i + "\t insert update");
		
		stmt.close();
		conn.close();
		
	}

}
