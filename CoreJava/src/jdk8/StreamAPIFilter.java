package jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIFilter {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,5,8,2,5,4);
		
		System.out.println(" (1) Stream : ");
		Stream <Integer> ab =list.stream();  // check this line of code						
		Object [] bc = ab.toArray();
		for (Object object : bc) {
			System.out.print(object);
		}
		
		System.out.println("\n (2) Stream with For each : ");
		list.stream().forEach(ele-> System.out.print(" "+ele));
		
		System.out.println("\n (3) Stream with sorted with For each : ");
		list.stream().sorted().forEach(ele-> System.out.print(" "+ele));
		
		System.out.println("\n (4) Stream with sorted with distinct For each : ");
		list.stream().sorted().distinct().forEach(ele-> System.out.print(" "+ele));
		
		System.out.println("\n (5) Stream with sorted with distinct copy to array : ");
		Object[] a = list.stream().sorted().distinct().toArray(); // check this line of code
		
		for (Object object : a) {
			System.out.print(" " + object);
		}
	}
}
