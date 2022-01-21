package jdk8;

import java.util.Arrays;

public class TestParallelShort {
	public static void main(String[] args) {
	
		int a[] = {8,10,2,3,81,65};
		Arrays.parallelSort(a);
		
		for (int i : a) {
			System.out.println(i);
		}
	}
}
