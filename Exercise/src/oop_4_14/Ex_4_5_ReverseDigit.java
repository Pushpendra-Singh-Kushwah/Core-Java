package oop_4_14;

public class Ex_4_5_ReverseDigit {
	public static void main(String[] args) {
		// method to reverse a string;
		String a = "12345";
		char b[] = a.toCharArray();
		String c="";
		
		for (int i = 4; i >=0 ; i--) {
			
			 c = c + b[i];
		}
		System.out.println(c);
		
		//method to reverse a digit
		
		int num = 12345;
		int rev = 0;
		int rem = 0;
		
		while(num!=0){
				rem = num%10;
			    rev = (rev*10) + rem;
			    num = num/10;
		}
		System.out.println(rev);	
	}
}
