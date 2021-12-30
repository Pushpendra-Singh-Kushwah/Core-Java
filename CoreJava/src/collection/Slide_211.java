package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Slide_211 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("six + one");
		a.add("five");
		a.add("for");
		a.add("three");
		a.add("two");
		
		Iterator it = a.iterator();
		
		while(it.hasNext()) {
			Object o =it.next(); // print type 1: take in Object and then print use
			System.out.println(o);
			
			//System.out.println(it.next()); // type 2 :print direct in sysout
		}
		// use either type 1 or type 2; both are correct but one at a time.
	}
}
