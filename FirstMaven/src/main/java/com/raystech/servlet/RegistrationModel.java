package com.raystech.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.raystech.servlet.JdbcDataSource;

public class RegistrationModel extends RegistrationBean {
	
public static Integer nextPK() throws SQLException {
		
		Connection conn =null;
		int pk =0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/psk","root","root");
			PreparedStatement ps = conn.prepareStatement("select max(id) from Registration");
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
	public void add(RegistrationBean bean) throws SQLException  {
		Connection conn = JdbcDataSource.getConnection();
		conn.setAutoCommit(false);
		int pk=0;
		pk=nextPK();
		PreparedStatement ps = conn.prepareStatement("INSERT INTO REGISTRATION VALUES (?,?,?,?,?,?,?,?)");
		ps.setInt(1,pk);
		ps.setString(2, bean.getFirstName());
		ps.setString(3, bean.getLastName());
		ps.setString(4, bean.getLoginId());
		ps.setString(5, bean.getPwd());
		ps.setString(6, bean.getConfirmpwd());
		ps.setString(7, bean.getGender() );
		ps.setString(8, bean.getDob() );
		
		ps.executeUpdate();
		conn.commit();
		
		System.out.println("inserted");
		JdbcDataSource.closeConnection(conn, ps);
	}
	public void authentication(String loginId, String password) throws SQLException  {
		String log = loginId;
		String pwd = password;
		Connection conn = null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		int r  = 0;
		try { conn = JdbcDataSource.getConnection();

		 ps = conn.prepareStatement("select loginId, password from registration where loginId =? and password=?");
		
		ps.setString(1, log);
		ps.setString(2, pwd);
		
		rs=ps.executeQuery();
		while(rs.next()) {
				r = 1;
		}
		
		}catch (Exception e) {
			System.out.println("Login is not possible : "+ e.getMessage());
		}
	
		if(r==0) {
		System.out.println("invalid");
		}else {
			System.out.println("valid");
		}
		JdbcDataSource.closeConnection(conn, ps, rs);
	}
	
	public RegistrationBean authenticate (RegistrationBean bean) throws SQLException  {
	
		String id = bean.getLoginId();
		String pwd = bean.getPwd();
		
		Connection conn = null;
		PreparedStatement ps=null;
		ResultSet rs = null;
		try {
		conn = JdbcDataSource.getConnection();

		 ps = conn.prepareStatement("select * from registration where loginId =? and password=?");
		
		ps.setString(1, id);
		ps.setString(2, pwd);
		
		rs=ps.executeQuery();
		System.out.println("check 1");
		
		while (rs.next()) {
			bean.setId(rs.getInt(1));
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setLoginId(rs.getString(4));
			bean.setPwd(rs.getString(5));
			bean.setConfirmpwd(rs.getString(6));
			bean.setGender(rs.getString(7));
			bean.setDob(rs.getString(8));
			System.out.println("check 2");
		}
		
       }catch (Exception e) {
		System.out.println("Login denied" + e.getMessage());
	}
	
		JdbcDataSource.closeConnection(conn, ps, rs);
		System.out.println("authenticate method runs successfully");
		return bean;
		
	}
	public RegistrationBean forgatePassword(RegistrationBean bean) throws SQLException  {
		
		String id = bean.getLoginId();
		
		Connection conn = null;
		PreparedStatement ps=null;
		ResultSet rs = null;
		try {
		conn = JdbcDataSource.getConnection();

		 ps = conn.prepareStatement("select password from registration where loginId =?");
		
		ps.setString(1, id);

		rs=ps.executeQuery();
		System.out.println("check 1");
		
		while (rs.next()) {
			
			bean.setPwd(rs.getString(1));
		
			System.out.println("check 2");
		}
		
       }catch (Exception e) {
		System.out.println("something went wrong" + e.getMessage());
	}
	
		JdbcDataSource.closeConnection(conn, ps, rs);
		System.out.println("you get your password");
		return bean;
		
	}
	
}
