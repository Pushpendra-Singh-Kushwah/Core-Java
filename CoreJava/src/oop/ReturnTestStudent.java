package oop;

public class ReturnTestStudent {
	
	public static void main(String[] args) {
		
		StudentModel y = new StudentModel();
		
		Student z = new Student();
		
		z= y.whatsFees(1);
		System.out.println(z.getFees());
		
		z= y.whatsFees(2);
		System.out.println(z.getFees());
		
	

	}

}
