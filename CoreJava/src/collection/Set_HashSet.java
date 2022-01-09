package collection;

import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {
	public static void main(String[] args) {
		Set a = new HashSet();
		a.add("one");
		a.add(2);
		a.add('p');
		a.add(3.5);
		System.out.println(a);
		
		Set b = new HashSet();
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
	}
}
