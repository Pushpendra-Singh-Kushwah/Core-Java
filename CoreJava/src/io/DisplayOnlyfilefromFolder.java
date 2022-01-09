package io;

import java.io.File;

public class DisplayOnlyfilefromFolder {
	public static void main(String[] args) {
		File directory = new File("D");
		String[] list = directory.list();    // list method

		for (int i = 0; i < list.length; i++) {
			File f = new File("D", list[i]);
			if (f.isFile()) {
				System.out.println((i + 1) + " : " + list[i]);
			}
			
		File [] list1 = directory.listFiles();     //listFiles method
		for (int j = 0; j < list1.length; j++) {
			if (list1[i].isFile()) {
				System.out.println(list1[i]);
			}
		}
		}
	}
}
