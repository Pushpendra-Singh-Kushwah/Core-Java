package jdk8;

public class TestHelloInt_Functional_Interface_Param_returnInt {
	public static void main(String[] args) {
		HelloInt_Fucntional_Interface_Param_returnInt hf1 = (int a, int b)-> {
			return a+b;
		};
				int c = hf1.say(18, 28);
				System.out.println(c);
	}
}
