package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
	public static void main(String[] args) {
	
		ArrayList<String> a = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			
			a.add("No. is :   " +  i);
		}
		
//		Object b = a.get(2);
//		String c = (String) b;
//		System.out.println(c);
		Iterator<String> it = a.iterator();
		
//		for (String s : it) {
			System.out.println(it);
//		}
	}
}
