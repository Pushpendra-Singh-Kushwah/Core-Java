package collection;

import java.util.ArrayList;

public class Slide_209 {
	public static void main(String[] args) {
		ArrayList aa = new ArrayList();
		aa.add("Gwalior");
		aa.add("indore");
		
		int size = aa.size();
		System.out.println(size);
		
		for (int i = 0; i <size; i++) {
			
			System.out.println("type 1 : " + aa.get(i)); // type 1 for print on console;
			
			Object o = aa.get(i);
			System.out.println("type 2 : " + o); // type 2, first give the value to  Object O then print
			
			Object x = aa.get(i);
			String str = (String) x;
			System.out.println("type 3 : " + str); // type 3, first put in x then convert in string and print
			
			Object z = aa.get(i);
			System.out.println("type 4 : " + z.toString()); // type 4, convert within string and print
			
			
			
			
		}
	}
}
