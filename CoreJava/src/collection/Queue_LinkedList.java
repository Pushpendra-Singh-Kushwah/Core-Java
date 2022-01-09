package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedList {
	public static void main(String[] args) {
		Queue a = new LinkedList();
		
		a.add("one");
		a.add(2);
		a.add('p');
		a.add(3.5);
		System.out.println(a);
		
		Queue b = new LinkedList();
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
		
		// queue's individuals extra operation
		System.out.println("--------extra operation of Queue------");
		System.out.println(a.offer(2));
		System.out.println(a);
		System.out.println(a.peek());
		System.out.println(a.poll());
		System.out.println(a);
	}
}
