package collection;

import java.util.Stack;

public class Exercise_8 {
	public static void main(String[] args) {

		Stack<Object> s= new Stack<>();
		
		for (char i = 'A'; i <='Z'; i++) {
			s.push(i);
		}
		System.out.println(s.size());
		System.out.println(s);
		
		
		Stack p = new Stack();
		
		for (int i =s.size(); i > args.length; i--) { // args.length =0 by default;
			p.push(s.pop());
		}
		System.out.println(p);
		System.out.println(s);
		
		for (int i = p.size(); i > args.length ; i--) {
			p.pop();
		}
		System.out.println(p);
		
	}
}
