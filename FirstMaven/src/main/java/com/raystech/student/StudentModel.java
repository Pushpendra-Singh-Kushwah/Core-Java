package com.raystech.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.raystech.servlet.JdbcDataSource;

public class StudentModel {
	public static void main(String[] args) {
		//add(bean);
	}
	
	public static void add(StudentBean bean) throws Exception {
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("INSERT INTO student VALUES (?,?,?,?)");
		ps.setString(1,bean.getRollNo());
		ps.setString(2, bean.getFirstName());
		ps.setString(3, bean.getLastName());
		ps.setString(4, bean.getSession());
		
		ps.executeUpdate();
		conn.commit();
		
		System.out.println("inserted in student table");
		JdbcDataSource.closeConnection(conn, ps);
	}
	
	public static void update(StudentBean bean) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareStatement("UPDATE student SET Fname = ?, Lname=?, session=?  WHERE RollNo=?");
		
		ps.setString(1,bean.getRollNo());
		ps.setString(2, bean.getFirstName());
		ps.setString(3, bean.getLastName());
		ps.setString(4, bean.getSession());
		
		ps.executeUpdate();
		conn.commit();
		
		System.out.println("Updated in student table");
		ps.close();
		conn.close();
		
	}
	
	public static void delete(StudentBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareStatement("DELETE FROM STUDENT WHERE RollNo=?");
		ps.setString(1, bean.getRollNo());
		
		ps.executeUpdate();
		conn.commit();
		
		System.out.println("Deleted in Student table");
		ps.close();
		conn.close();

	}

	public void search(StudentBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareStatement("select * from student");
		ResultSet rs = ps.executeQuery();
		
		conn.commit();
		System.out.println("\t RollNo \t FName \t Lname \t Session");
		
		while(rs.next()) {
			System.out.print("\t" + rs.getString(1));
			System.out.print("\t" +rs.getString(2));
			System.out.print("\t" +rs.getString(3));
			System.out.println("\t" +rs.getString(4));
		}
		rs.close();
		conn.close();
	}

	public void get(StudentBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareStatement("select * from student where RollNo = ?");
		ps.setString(1, bean.getRollNo());
		ResultSet rs = ps.executeQuery();
		
		conn.commit();
		System.out.println("\t RollNo \t FName \t Lname \t Session");
		
		rs.next();
		System.out.print("\t" + rs.getString(1));
		System.out.print("\t" +rs.getString(2));
		System.out.print("\t" +rs.getString(3));
		System.out.print("\t" +rs.getString(4));
		
		rs.close();
		conn.close();
	}
}
