package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializable {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream("D:/hello.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Employee emp = new Employee(1, "Anshu", "Bhadouria");
		
		out.writeObject(emp);
		out.close();
		
		System.out.println("Object is successfully persisted(serialized)");
	}
}
