package jdk8;

public class TestHelloInt_Functional_Interface {
	public static void main(String[] args) {
		
		HelloInt_Functional_Interface hf = ()-> {
				System.out.println("Hello everyOne : ");
			};
			hf.say();
		}
	}
		
	

