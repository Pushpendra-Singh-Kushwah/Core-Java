package jdk8;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class ConcurrentCollectionsExample {
	public static void main(String[] args) {
		
		ArrayBlockingQueue<Integer> l = new ArrayBlockingQueue<Integer>(10);
		
		l.add(10);
		l.add(5);
		l.add(17);
		l.add(5);
		l.add(20);
		l.add(50);
		l.add(22);
		l.add(23);
		
		Iterator<Integer> it = l.iterator();
		l.add(12);
		
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
		}
		
		
		
		
	}
}
