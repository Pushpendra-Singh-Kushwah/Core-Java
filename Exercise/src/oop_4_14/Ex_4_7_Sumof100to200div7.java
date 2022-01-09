package oop_4_14;

public class Ex_4_7_Sumof100to200div7 {
	public static void main(String[] args) {
		int num = 101;
		int total=0;
		for (int i = num; i <200; i++) {
			
			if (i%7==0) {
				total = total + i;
				System.out.println("           "+ i);
			}
		} 
		System.out.println("Total is : " + total);
	}
}
