package oop_4_14;

public class Ex_4_15_TablePrint {
	public static void main(String[] args) {
		
		int[][] tableof2 = new int [11][10];
		int table = 1;
		
		for (int i = 1; i < tableof2.length; i++) {
			for (int j = 2; j < tableof2.length; j++) {
				table = i*j;
				System.out.print(table+ " ");
			}
			System.out.println();
		}
		
	}
	
}
