package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LineByLineRead {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("D:/hello.txt");
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine(); // it will take single line at method call;
		
		while (line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		reader.close();
	}
}
