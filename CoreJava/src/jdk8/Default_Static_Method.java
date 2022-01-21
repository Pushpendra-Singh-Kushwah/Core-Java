package jdk8;

@FunctionalInterface
public interface Default_Static_Method {
	
	public int add(int a, int b);
	
	public default void defMethod() {
		System.out.println("This is default method, it is not abstract method");
	}
	
	public static void staticMethod() {
		System.out.println("This is static method, it is not abstract method");
	}
}
