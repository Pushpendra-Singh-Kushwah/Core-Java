package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestDeserializable {
	public static void main(String[] args) throws Exception {
		FileInputStream file  = new FileInputStream("D:/hello.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		Employee emp = (Employee) in.readObject();
		
		System.out.println(emp.getId());
		System.out.println(emp.getfName());
		System.out.println(emp.getlName());
		System.out.println(emp.getPsw());
		
	}
}
