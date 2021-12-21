package core_java;

public class Ex_4_16_SecondLargestNoArray {
	public static void main(String[] args) {
		
		int[] group = {5,10,2,6,11};
		
		int max = 0;
		int secondmax= 0;
		
		for (int i = 0; i < group.length; i++) {
			if (group[i]>max) {
				secondmax=max;
				max = group[i];
			}
			else if (group[i]>secondmax) {
				secondmax = group[i];
			}
		}
		System.out.println("1st highest value : " + max);
		System.out.println("2nd highest value : " + secondmax);
		
		
	}

}
