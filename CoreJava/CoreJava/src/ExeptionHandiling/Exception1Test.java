package ExeptionHandiling;

public class Exception1Test {
	
	public static void main(String[] args) throws Exception1 {
		
		Exception1 abc = new Exception1();
		
		int b=0;
		
		if(b<1) {   // condition true hote hi, ye exception throw karega Exception1 ko or Exception1 send karega Exception class ko
			System.out.println(b + " is less than 1");
			throw abc;
		}
		
		else {
			System.out.println(b + " is greater than 1");
		}
		
	}

}
