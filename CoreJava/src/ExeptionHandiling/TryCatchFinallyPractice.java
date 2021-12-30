package ExeptionHandiling;

public class TryCatchFinallyPractice {

	public static void main(String[] args) {
		
		try {
				int a=10/0;
				try {
					int b = 10/0;
				}catch(Exception e){
					System.out.println("error inside try catch 2 check point");
				}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}finally {
			
		}
	}
}
