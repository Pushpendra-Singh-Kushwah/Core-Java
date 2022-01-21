package jdk8;

public class TestHelloInt_Functional_Interface_Param {
	public static void main(String[] args) {
		HelloInt_Functional_Interface_Param hfi = (int a, int b) -> {
			System.out.println("sum of a + b is : " +  a+b);
		};
		hfi.say(10,20);
	}
}
