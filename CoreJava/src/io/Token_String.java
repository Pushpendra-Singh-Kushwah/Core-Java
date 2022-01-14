package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Token_String {
	public static void main(String[] args) throws Exception {

		// String str = "hello, i am Pushpendra Singh Kushwah, I am from Gwalior";

		FileReader read = new FileReader("D:/emailcheck.txt");
		BufferedReader br = new BufferedReader(read);
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, ",");

		while (st.hasMoreElements()) {
			String token = (String) st.nextToken();
			if (token.contains("@") && token.contains(".com")) {
				System.out.println("Token is : " + token);
			}
		}
	}
}
