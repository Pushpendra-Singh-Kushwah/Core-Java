package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileByScanner {
	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("D:/hello.txt");
		Scanner sc = new Scanner(reader);
		
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());	
		}
		reader.close(); // you have to close all the object it reader object is close then sc object will automatic close
		//sc.close();
	}
}
