package oopex;

public class Ex_4_10_Armstrong {
	public static void main(String[] args) {
		int num = 153;
		int temp=num;
		int originalNum=num;
		int rem = 0;
		int rem2=0;
		int total = 0;
		int count=0;
		int div=0;
		
		while (num!=0) {
			rem = num/10;
			num=rem;
			count++;
		}
		for (int i = 0; i < count; i++) {
			rem2 = temp%10;
			total = total + (rem2*rem2*rem2);
			div = temp/10;
			temp=div;
		}
		System.out.println(total);
		System.out.println(originalNum);
		
		if (total==originalNum) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not a Armstrong Number");
		}
	}
}
