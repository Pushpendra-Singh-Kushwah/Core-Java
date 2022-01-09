package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
						// list - arraylist with iterator best example easy
public class List_ArrayList {
	public static void main(String[] args) {
		
		List a = new ArrayList();
		a.add("one");
		a.add(2);
		a.add('p');
		a.add(3.5);
		System.out.println(a);
		
		List b = new ArrayList();
		b.add("seven");
		b.add(20);
		b.add('s');
		b.add(3.5);
		System.out.println(b);
		
		a.addAll(b);
		System.out.println("Collection b is added in a : " + a);
		System.out.println("total size of a : " + a.size());
		
		// iterator in collection
		
		System.out.println("-------use of iterator in collection--------");
		Iterator it = a.iterator();
		
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
		
		
	
		
		
		/*Integer i = new Integer(10);
		a.add(i);
		
		Integer val = (Integer) a.get(3);
		System.out.println(val);*/
		
	}

}
