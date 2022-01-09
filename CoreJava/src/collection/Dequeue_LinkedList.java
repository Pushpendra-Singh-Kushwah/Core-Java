package collection;

import java.util.LinkedList;
import java.util.Deque;

public class Dequeue_LinkedList {
	public static void main(String[] args) {
		Deque a = new LinkedList();
		
		a.add("one");
		a.add(2);
		a.add('p');
		a.add(3.5);
		System.out.println(a);
		
		Deque b = new LinkedList();
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
		
		// Deque's individuals extra operation
		System.out.println("--------extra operation of Queue------");
		System.out.println(a.offerFirst(2));
		System.out.println(a.offerLast(21));
		System.out.println(a);
		System.out.println(a.peekFirst());
		System.out.println(a.peekLast());
		System.out.println(a.pollFirst());
		System.out.println(a.pollLast());
		System.out.println(a);
	}

}
