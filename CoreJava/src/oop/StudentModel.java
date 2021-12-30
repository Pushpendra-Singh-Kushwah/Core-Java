package oop;

public class StudentModel {
	
	public Student whatsFees(int i) {
		
		Student x = new Student();
		
		if (i==1) {		
			x = new FirstClass(5000);
		}
		if (i==2) {		
			x = new SecondClass(7000);
		}
				
		return x;
		
	}
	
	
}
