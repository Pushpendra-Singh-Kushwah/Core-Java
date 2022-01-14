package oop_4_14;

public class Ex_4_13_HarmonicSeries {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		double series=0;
		
		for (int i = 1; i < 10; i++) {
			series = (double) a/(b+i);
			System.out.print("  " + series);
		}
		
	}
}
