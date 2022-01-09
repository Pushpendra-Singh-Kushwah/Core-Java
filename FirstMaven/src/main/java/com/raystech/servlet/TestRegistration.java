package com.raystech.servlet;

import java.sql.SQLException;

public class TestRegistration {

	protected static void testAdd() throws Exception {
		RegistrationBean bean = new RegistrationBean();
		bean.setFirstName("Pushpendra");
		bean.setLastName("Singh");
		bean.setLoginId("psk");
		bean.setPwd("1234");
		bean.setConfirmpwd("1234");
		bean.setGender("male");
		bean.setDob("17/10/2019");
		
		RegistrationModel b = new RegistrationModel();
		b.add(bean);
	}
	private static void testAuthentication() throws Exception {
		
		RegistrationModel b = new RegistrationModel();
		b.authentication("psk","123");
		
	}
	public static void main(String[] args) throws Exception {
		//testAdd();
		testAuthentication();
	}
}
