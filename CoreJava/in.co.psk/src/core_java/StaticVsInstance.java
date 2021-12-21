// Static vs Instance : Instance method can call to both static attribute or instance attribute
// in example method add is non static(instance) so it can call to both declare attribute 
// which are static int sum, and int a; 
// static can call only static, if static call instance then its not possible, it gives error.
package core_java;

public class StaticVsInstance {
	
	static int sum = 5;          // static attribute
	int a = 1;                   // not static (instance) attribute  
	
	private void add() {                // instance method (call to both static & instance attribute)
		System.out.println(sum);   
		System.out.println(a);
	}
	
	private static void sub() {        // static method (call to static attribute only)
		System.out.println(sum);
		// System.out.println(a);  
		}
	public static void main(String[] args) {
		System.out.println("hello world");
	}

}
