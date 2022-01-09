package collection;

import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class Queue_PriorityQueue {
	public static void main(String[] args) {
		
		PriorityQueue a = new PriorityQueue<>();
		
		a.add(5);
		a.add(2);
		a.add(8);
		a.add(3);
		System.out.println(a);
		
		PriorityQueue b = new PriorityQueue();
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
		
		// queue's individuals extra operation
				System.out.println("--------extra operation of Queue------");
				System.out.println(a.offer(7));
				System.out.println(a);
				System.out.println(a.peek());
				System.out.println(a.poll());
				System.out.println(a);
	}
}
