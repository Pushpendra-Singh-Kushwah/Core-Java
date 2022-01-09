package io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CopyCon {
	public static void main(String[] args) throws Exception {
		String target = "D:/hello.txt";
		FileWriter writer = new FileWriter(target);  // we choose file
		PrintWriter printwriter = new PrintWriter(writer); // it write the file
		
		InputStreamReader isReader = new InputStreamReader(System.in);  // it takes input
		BufferedReader in = new BufferedReader(isReader);      // it read from i/p stream reader and make whole line
		
		String line = in.readLine();
		while (!line.equals("quit")) {
			printwriter.print(line);
			line = in.readLine();
		}
		printwriter.close();
		isReader.close();
		System.out.println("is complete");
	}
	
}
