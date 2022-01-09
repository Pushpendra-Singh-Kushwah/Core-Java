package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ConvertBinaryToText {
	public static void main(String[] args) throws Exception {
		
		String target = "D:/hello.txt";
		FileWriter writer = new FileWriter(target);
		PrintWriter pw = new PrintWriter(writer);
		
		InputStreamReader isReader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isReader);
		
		String line = in.readLine();
		
		while (line.equals("quit")) {
			pw.println(line);
			line=in.readLine();
		}
		pw.close();
		isReader.close();
		System.out.println("your printing is completed");
		
		
	}
}
