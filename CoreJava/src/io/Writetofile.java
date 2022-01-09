package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writetofile {
	public static void main(String[] args) throws Exception {
		FileWriter writer = new FileWriter("D:/hello.txt",true);  // using true it add to the text, if we dont use true then it is replaced
		PrintWriter pw = new PrintWriter(writer);
		
		for (int i = 0; i < 5; i++) {
			pw.println("i am fine");
		}
		pw.close();
		writer.close();
		
		System.out.println("successfully upadated to given file");
	}
}
