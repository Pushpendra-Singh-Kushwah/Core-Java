package collection;

import java.util.Vector;

public class VectorListImplement {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("hello");
		v.add("java");
		
		Integer a = new Integer(10);
		v.add(a);
		
		Integer val = (Integer) v.get(2);
		System.out.println(val);
	}
}
