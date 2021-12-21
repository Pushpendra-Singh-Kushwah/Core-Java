package collection;

import java.util.ArrayList;

public class CollectionDemo {
	public static void main(String[] args) {
	
		ArrayList a = new ArrayList();
		
		for (int i = 0; i < 5; i++) {
			
			a.add("No. is :   " +  i);
		}
		
		Object b = a.get(2);
		String c = (String) b;
		System.out.println(c);
	}
}
