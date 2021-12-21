package ExeptionHandiling;

public class RaiseExeptionClass {

	public static void main(String[] args) throws ExceptionClass {
		
		ExceptionClass ec =  new ExceptionClass();
			
			int val = 0;
			if(val<1)
				throw ec;
			else {
				System.out.println("its running");
			}
		
		
		
	}
	
}
