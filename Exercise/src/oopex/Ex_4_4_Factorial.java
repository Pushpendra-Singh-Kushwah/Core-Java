package oopex;

public class Ex_4_4_Factorial {
	public static void main(String[] args) {
		int number = 4;
		int fact = number;
		
		for (int i = 1; i < number ; i++) {
			fact = fact*i;		
		}
		System.out.println("factorial of above no. is : " + fact);
		
	}

}
