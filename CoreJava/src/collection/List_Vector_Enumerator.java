package collection;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class List_Vector_Enumerator {
	public static void main(String[] args) {
		
		List a = new Vector();
		a.add("one");
		a.add(2);
		a.add('p');
		a.add(3.5);
		System.out.println(a);
		
		List b = new Vector();
		b.add("seven");
		b.add(20);
		b.add('s');
		b.add(3.5);
		System.out.println(b);
		
		a.addAll(b);
	
		System.out.println("Collection b is added in a : " + a);
		
		System.out.println(a.contains("seven"));
		System.out.println(a.containsAll(b));
		System.out.println(a.isEmpty());
		System.out.println("special case : "+a.retainAll(b)); // if b's all element in a then "true" else "false";
		System.out.println(a.size());
		System.out.println(b.size());
		
		Enumeration en = ((Vector) a).elements();
		while (en.hasMoreElements()) {
			Object object = (Object) en.nextElement();
			System.out.println(object);
		}
	}
}

