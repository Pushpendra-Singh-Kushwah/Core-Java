package oop_4_14;

public class Ex_4_18_replacetoArray {
	
	public static void main(String[] args) {
		int number =12;
		int[] array1  =  new int[] {7,8,10,12,5,6};
		int tmp =0;
		
		System.out.print("sorted array1 : ");
		for (int i = 0; i < array1.length; i++)   
			{  
			for (int j = i + 1; j < array1.length; j++)   
				{  
		 
					if (array1[i] > array1[j])   
						{  
						tmp = array1[i];  
						array1[i] = array1[j];  
						array1[j] = tmp;  
						}  
				}  
		 
		System.out.print(array1[i] + " "); 

			}
		
		for (int i = 0; i < array1.length; i++) {
			if (array1[i]==number) {
				System.out.println("\n" + "index of array: " + array1[i] );
				
			}
			else {
				System.out.print("-1");
					
			}
			
		}
	}
}


