package oop;

public class StudentModel {
	
	public Student whatsFees(int i) {
		
		Student x = new Student();
		
		if (i==1) {		
			x = new FirstClass(1000);
		}
		if (i==2) {		
			x = new SecondClass(2000);
		}
				
		return x;
		
	}
	
}
