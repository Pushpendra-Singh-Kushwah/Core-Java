package collection;

import java.util.Stack;

public class List_Stack {
	public static void main(String[] args) {
		Stack a = new Stack();
		a.push("ram");
		a.push(5);
		a.push('p');
		System.out.println(a);
		
		System.out.println(a.peek());
		System.out.println(a.pop());
		System.out.println("after top element remove pop :" + a);
		System.out.println(a.peek());
	}
}
