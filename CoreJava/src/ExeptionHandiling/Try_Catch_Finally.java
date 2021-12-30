package ExeptionHandiling;

public class Try_Catch_Finally {
	
	public static void main(String[] args) {
	
		try{
			int a = 10/0;
		}
		catch(ArithmeticException e) {
			try{
				int c = 10/0;
			}catch(Exception x) {
				System.out.println("try catch inside catch is running");
			}
			System.err.println(":   catch of 1   :   ");	
			//System.exit(0);
		}
		/*finally {
			System.out.println("you find error in 10/0");
		}*/
	
		}
		
}

