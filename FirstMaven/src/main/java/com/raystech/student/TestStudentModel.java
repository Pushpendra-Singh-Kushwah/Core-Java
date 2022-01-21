package com.raystech.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.jdbc.ResultSet;

public class TestStudentModel {
		public static void testAdd() throws Exception {
			
			StudentBean bean = new StudentBean();
			bean.setRollNo("4");
			bean.setFirstName("dummy");
			bean.setLastName("Singh");
			bean.setSession("2020-21");
			
			StudentModel sm = new StudentModel();
			sm.add(bean);
		}
		public static void testUpdate() throws Exception {
			
			StudentBean bean = new StudentBean();
			bean.setRollNo("1");
			bean.setFirstName("Anshu");
			bean.setLastName("Singh");
			bean.setSession("2020-2021");
	
			StudentModel sm = new StudentModel();
			sm.update(bean);
			
		}
		
		public static void testDelete() throws Exception {
			StudentBean bean = new StudentBean();
			bean.setRollNo("4");
			
			StudentModel sm = new StudentModel();
			sm.delete(bean);
			
		}
		
		public static void main(String[] args) throws Exception {
			//testAdd();
			//testUpdate();
			//testDelete();
			//testGet();
			//testSearch();
			
		}
		public static void testSearch() throws Exception {
			StudentBean bean = new StudentBean();
			
			StudentModel sm = new StudentModel();
			sm.search(bean);
	
		}
		public static void testGet() throws Exception {
			StudentBean bean = new StudentBean();
			bean.setRollNo("2");
			
			StudentModel sm = new StudentModel();
			sm.get(bean);
		}	
}
