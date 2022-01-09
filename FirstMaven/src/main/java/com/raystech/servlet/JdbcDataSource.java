package com.raystech.servlet;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcDataSource {

	private static JdbcDataSource jds = null;
	
	private ComboPooledDataSource ds = null;
	
	private JdbcDataSource() {
		try {
			ds = new ComboPooledDataSource();
			ds.setDriverClass("com.mysql.jdbc.Driver");
			ds.setJdbcUrl("jdbc:mysql://localhost:3306/psk");
			ds.setUser("root");
			ds.setPassword("root");
			ds.setInitialPoolSize(2);
			ds.setAcquireIncrement(1);
			ds.setMaxPoolSize(5);
		}catch(PropertyVetoException e) {
			e.printStackTrace();
		}
	
	}
	
	public static JdbcDataSource getInstance() {
		if(jds==null) {
			jds= new JdbcDataSource();
		}
		return jds;
	}
	public static Connection getConnection() {
		try {
			return getInstance().ds.getConnection();
		} catch (SQLException e) {
			return null;
		}
	}
	public static void closeConnection(
		Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(rs !=null) rs.close();
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
		public static void closeConnection(Connection conn, Statement stmt) {
			closeConnection(conn, stmt, null);
		}
		public static void closeConnection(Connection conn) {
			closeConnection(conn, null, null);
			
		}
	}

