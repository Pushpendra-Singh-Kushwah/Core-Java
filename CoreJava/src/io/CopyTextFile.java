package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyTextFile {
	public static void main(String[] args) throws Exception {
		String source = "D:/hello.txt";
		String target = "D:/intro.txt";
		
		FileReader reader = new FileReader(source);
		FileWriter writer =  new FileWriter(target);
		
		int ch = reader.read();
		
		while (ch!=-1) {
			writer.write(ch);
			ch = reader.read();
		}
		reader.close();
		writer.close();
		System.out.println("source is copied to target");
	}
}
