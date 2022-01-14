package oop_4_14;

public class Ex_4_14_Avg_Odd_Even {
	public static void main(String[] args) {
		int a = 100;
		int oddTotal=0;
		int evenTotal=0;
		double evenAvg=0;
		double oddAvg=0;
		int count1=0;
		int count2=0;
		
		
		for (int i = 1; i <= a; i++) {
			if (i%2==0) {
				evenTotal = evenTotal+ i; 
				count1++;
			} else {
				oddTotal = oddTotal+i;
				count2++;
			}
		}
		evenAvg = (double) evenTotal/count2;
		System.out.println(evenAvg);
		
		oddAvg = (double) oddTotal/count1;
		System.out.println(oddAvg);
	}
}
