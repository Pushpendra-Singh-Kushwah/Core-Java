package oop_4_14;

public class Ex_4_8_TwoDArrayTable2to10 {
	public static void main(String[] args) {
		
		int a[][] = new int [9][10];
		
		for (int i = 1; i < a.length+2; i++) {
			
			for (int j = 2; j < a.length+2; j++) {
				
				System.out.print("    " + i*j);
			}
			System.out.println();
		}
	}
}
