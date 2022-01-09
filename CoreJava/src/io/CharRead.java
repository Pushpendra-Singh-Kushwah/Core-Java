package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CharRead {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("D:/hello.txt");
		int ch = reader.read();   // its read single char's- ascii value of char so we put it in int;
		
		char chr;
		
		while (ch!=-1) {
			chr = (char)ch;    // here ascii value type cast in char so we get char;
			System.out.print(chr);
			ch=reader.read();
			
		}
	}
}
