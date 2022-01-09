package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyBinaryFile_Image {
	public static void main(String[] args) throws Exception {
		String source = "D:/little.png";
		String target = "D:/lit.png";
		
		FileInputStream reader = new FileInputStream(source);
		FileOutputStream writer =  new FileOutputStream(target);
		
		int ch = reader.read();
		
		while (ch!=-1) {
			writer.write(ch);
			ch = reader.read();
		}
		reader.close();
		writer.close();
		System.out.println("image is copied to target");
	}
}
