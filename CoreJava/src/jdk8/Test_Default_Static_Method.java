package jdk8;

public class Test_Default_Static_Method {
	public static void main(String[] args) {
		Default_Static_Method dsm = (a,b)->{return a+b;
		};
		
		int show = dsm.add(111, 222);
		System.out.println(show);
		
		dsm.defMethod();
		Default_Static_Method.staticMethod(); // static method call with 											class name where it is created		
	}
}
 /*
  * in this Test class we can see that only abstract method of functional
  * interface is forcefully override(p v add(int a, int b)) and functional interface
  * also have another two method, which are optional and call only when needed */
  