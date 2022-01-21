package oopex;

public class Ex_4_17_MissingNoInSecondArray {
      public static void main(String[] args) {
	
	int[] firstArray =  new int [] {4,5,6,7,8,9,10,1,2,3};
	int[] secondArray = new int [] {4,5,6,1,2,3,7,8,10};
	int tmp = 0; 
	int tempo = 0;
	
	System.out.print("sorted arrayFirst : ");
	for (int i = 0; i < firstArray.length; i++)   
		{  
		for (int j = i + 1; j < firstArray.length; j++)   
			{  
	 
				if (firstArray[i] > firstArray[j])   
					{  
					tmp = firstArray[i];  
					firstArray[i] = firstArray[j];  
					firstArray[j] = tmp;  
					}  
			}  
	 
	System.out.print(firstArray[i] + " "); 

		}
	
	System.out.print("sorted secondArray : ");
	for (int i = 0; i < secondArray.length; i++)   
		{  
			for (int j = i + 1; j < secondArray.length; j++)   
				{  
	 
					if (secondArray[i] > secondArray[j])   
						{  
							tempo = secondArray[i];  
							secondArray[i] = secondArray[j];  
							secondArray[j] = tempo;  
						}  
				}  
	 
	System.out.print(secondArray[i] + " "); 

	
		}
		
	
	for (int k = 0; k < firstArray.length; k++) {
		for (int m = k; m < secondArray.length; m++) {
			
			if (firstArray[k]==secondArray[m]) {
				break;
			}
		 else {
				System.out.println( "\n" + "Missing element form secondArray is : " + firstArray[k]);
			}

			}
      }
    }
}
		
	
	
	
   

      

  
  

