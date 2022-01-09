package com.raystech.rb;
import java.util.ResourceBundle;

public class Resource_Bundle {
		
	public static void main(String[] args) {
			ResourceBundle rb = ResourceBundle.getBundle("com.raystech.rb.app");
			
			System.out.println(rb.getString("Url"));
			System.out.println(rb.getString("Driver"));
			System.out.println(rb.getString("Password"));
			System.out.println(rb.getString("User"));
			
		}

}
