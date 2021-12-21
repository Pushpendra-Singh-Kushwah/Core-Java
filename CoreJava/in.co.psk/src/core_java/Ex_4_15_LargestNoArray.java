package core_java;

public class Ex_4_15_LargestNoArray {
	public static void main(String[] args) {
		
		int [] abc = {10,20,80,40,50};
		
		int max = abc[0];
		
		for (int i = 0; i < abc.length; i++) {
			
			if (abc[i]>max) {
				
				max = abc[i];
				
			}
		}
		   System.out.println("largest no. in array is :  " + max);
	}
}
