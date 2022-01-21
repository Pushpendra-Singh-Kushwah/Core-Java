package jdk8;

import java.util.ArrayList;

import java.util.List;

public class TestForEachMethod {
	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(5);
		a.add(10);
		a.add(1);
		a.add(5);
		a.add(3);
		a.add(9);
		
		a.forEach(li-> System.out.println(li));
		// foreach() will run with lambda expression;	
	}
}
