package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Metadata {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT ID, FNAME, LNAME, SALARY FROM EMPLOYEE");
		
		ResultSetMetaData rsmt = rs.getMetaData();
		
		System.out.println("Catalog : " + rsmt.getCatalogName(1));
		System.out.println("Table Name" + rsmt.getTableName(1));
		
		int columnCount = rsmt.getColumnCount();
		System.out.println("column count is : " + columnCount);
		
		for (int i = 1; i < columnCount; i++) {
			
			System.out.println("Column : " + i);
			System.out.println("Label : " + rsmt.getTableName(i));
			System.out.println("Name : " + rsmt.getColumnName(i));
			System.out.println("Type : " + rsmt.getColumnType(i));
			System.out.println("Size : " + rsmt.getColumnDisplaySize(i));
			System.out.println("Precision : " + rsmt.getPrecision(i) );
		}
		
		stmt.close();
		conn.close();
	}
	}

