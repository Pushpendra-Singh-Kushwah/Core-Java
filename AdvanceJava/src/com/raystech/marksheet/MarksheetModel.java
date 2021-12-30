package com.raystech.marksheet;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MarksheetModel extends MarksheetBean {
	
public static Integer nextPK() throws SQLException {
		
		Connection conn =null;
		int pk =0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
			PreparedStatement ps = conn.prepareStatement("select max(id) from marksheet");
					ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				pk = rs.getInt(1);
			}
		rs.close();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			conn.close();
		}
		return pk+1;
	}
		
	public static void add(MarksheetBean bean) throws Exception{
		
		Connection conn = JdbcDataSource.getConnection();
				
		conn.setAutoCommit(false);
		int pk=0;
		pk=nextPK();
		PreparedStatement ps = conn.prepareStatement("INSERT INTO MARKSHEET VALUES (?,?,?,?,?,?,?)");
		ps.setInt(1, pk);
		ps.setString(2, bean.getRollNo());
		ps.setString(3, bean.getfName());
		ps.setString(4, bean.getLname());
		ps.setInt(5, bean.getPhysics());
		ps.setInt(6, bean.getChemistry());
		ps.setInt(7, bean.getMaths());
		
		ps.executeUpdate();
		conn.commit();
		
		System.out.println("inserted");
		JdbcDataSource.closeConnection(conn, ps);
	}
	
	public static void update(MarksheetBean bean) throws Exception{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareStatement("UPDATE MARKSHEET SET LNAME=? WHERE ID=?");
		ps.setString(1,bean.getLname());
		ps.setInt(2, bean.getId());
		
		ps.executeUpdate();
		conn.commit();
		
		System.out.println("Updated");
		ps.close();
		conn.close();
	}
	
	public static void delete(MarksheetBean bean) throws Exception{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareStatement("DELETE FROM MARKSHEET WHERE ID=?");
		ps.setInt(1, bean.getId());
		
		ps.executeUpdate();
		conn.commit();
		
		System.out.println("Deleted");
		ps.close();
		conn.close();
	}
	public static void get(MarksheetBean bean) throws Exception{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareStatement("select * from Marksheet where rollNo = ?");
		ps.setString(1, bean.getRollNo());
		ResultSet rs = ps.executeQuery();
		
		conn.commit();
		System.out.println("\t ID  \t rollNo \t fName \t lname \t physics \t chemistry \t maths");
		
		rs.next();
		System.out.print("\t" + rs.getInt(1));
		System.out.print("\t" +rs.getString(2));
		System.out.print("\t" +rs.getString(3));
		System.out.print("\t" +rs.getString(4));
		System.out.print("\t" +rs.getInt(5));
		System.out.print("\t" +rs.getInt(6));
		System.out.print("\t" +rs.getInt(7));
		
		rs.close();
		conn.close();
	}
	public static void search(MarksheetBean bean) throws Exception{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareStatement("select * from Marksheet");
		ResultSet rs = ps.executeQuery();
		
		conn.commit();
		System.out.println("\t ID  \t rollNo \t fName \t lname \t physics \t chemistry \t maths");
		
		while(rs.next()) {
		System.out.print("\t" + rs.getInt(1));
		System.out.print("\t" +rs.getString(2));
		System.out.print("\t" +rs.getString(3));
		System.out.print("\t" +rs.getString(4));
		System.out.print("\t" +rs.getInt(5));
		System.out.print("\t" +rs.getInt(6));
		System.out.print("\t" +rs.getInt(7));
		}
		rs.close();
		conn.close();
	}
	
	public static void getMeritList(MarksheetBean bean) throws Exception{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
	
		conn.setAutoCommit(false);
		
		PreparedStatement ps = conn.prepareStatement("select *, (physics+chemistry+maths)/3 as percentage from Marksheet where physics>40 and chemistry>40 and maths order by percentage desc limit 0,3");
		ResultSet rs = ps.executeQuery();
		
		conn.commit();
		System.out.println("ID  \t rollNo fName lname  physics chemistry maths percentage");
		
		while(rs.next()) {
		System.out.print(rs.getInt(1));
		System.out.print("\t" +rs.getString(2));
		System.out.print("\t" +rs.getString(3));
		System.out.print("\t" +rs.getString(4));
		System.out.print("\t" +rs.getInt(5));
		System.out.print("\t" +rs.getInt(6));
		System.out.print("\t" +rs.getInt(7));
		System.out.println("\t" + rs.getInt(8));
		}
		rs.close();
		conn.close();
	}
}
