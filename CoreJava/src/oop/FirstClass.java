package oop;

public class FirstClass extends Student {
	
	/*FirstClass me = new FirstClass();
	
	Student you = new Student();
	
	FirstClass they = new Student(); 
	
	Student we = new FirstClass();*/ 

	public FirstClass() {}
	
	public FirstClass(int fees) {
		this.fees = fees;
	}
	
	
	@Override
	public int getFees() {
		
		return super.getFees();
	}

}
