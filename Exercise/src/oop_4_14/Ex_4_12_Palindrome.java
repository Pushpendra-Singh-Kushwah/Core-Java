package oop_4_14;

public class Ex_4_12_Palindrome {
	public static void main(String[] args) {
		int a = 33433;
		int temp = a;
		int rem=0;
		int count=0;
		int mod=0;
		int rev=0;
		
		while (a!=0) {
			mod = a/10;
			a = mod;
			count++;
		}
		System.out.println("Total number is : " + count);
		a = temp;
		for (int i = 0; i < count; i++) {
			rem = a%10;
			rev = (rev*10) + rem;
			mod = a/10;
			a = mod;
		}
		System.out.println(rev);
		if (temp==rev) {
			System.out.println("No. is palindrome");
		}
		else {
			System.out.println("Not a palindorme");
		}
	}
}
