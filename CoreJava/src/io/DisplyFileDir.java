package io;

import java.io.File;

public class DisplyFileDir {
	public static void main(String[] args) {
		File directory = new File("D");
		String[] list  = directory.list();
		
		for (int i = 0; i < list.length; i++) {
			System.out.println((i+1) + " : " +list[i]);
		}
		System.out.println("no dir available");
	}
}