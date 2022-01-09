package com.raystech.rb;

import java.util.ResourceBundle;

public class TestLanguages {
	public static void main(String[] args) {
		ResourceBundle rb1 = ResourceBundle.getBundle("com.raystech.rb.gujrati");
		System.out.println(rb1.getString("greet"));

		ResourceBundle rb2 = ResourceBundle.getBundle("com.raystech.rb.hindi");
		System.out.println(rb2.getString("greeting"));
		System.out.println("hello");

	}

}
