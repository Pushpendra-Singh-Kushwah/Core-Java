package oop_4_14;

public class Ex_4_3_FiveRandomNumber {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			int num = (int)(Math.random()*100);
			System.out.println(i + "  Random No is : " + num);
		}
	}
}
