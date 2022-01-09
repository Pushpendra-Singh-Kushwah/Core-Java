package collection;

import java.util.TreeSet;
import java.util.Set;

public class Set_TreeSet {
	
	public static void main(String[] args) {
		Set a = new TreeSet();
		a.add(5);
		a.add(2);
		a.add(8);
		a.add(3);
		System.out.println(a);
		
		Set b = new TreeSet();
		b.add(9);
		b.add(1);
		b.add(0);
		b.add(4);
		System.out.println(b);
		
		a.addAll(b);
		System.out.println("Collection b is added in a : " + a);
		
		System.out.println(a.contains(2));
		System.out.println(a.containsAll(b));
		System.out.println(a.isEmpty());
		System.out.println("special case : "+a.retainAll(b)); // if b's all element in a then "true" else "false";
		System.out.println(a.size());
		System.out.println(b.size());
	}

}
