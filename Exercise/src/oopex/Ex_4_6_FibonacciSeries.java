package oopex;

public class Ex_4_6_FibonacciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int limitOFNum=10;
		System.out.print(a +" "+ b);
		
		int c;
		for (int i = 3; i <= limitOFNum; i++) {
			 c= b+a;
			 System.out.print(" " + c);
			 a=b;
			 b=c;
		}
	}
}
