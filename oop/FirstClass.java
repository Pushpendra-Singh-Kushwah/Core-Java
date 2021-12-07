package oop;

public class FirstClass extends Student {
	
	public FirstClass() {}
	
	public FirstClass(int fees) {
		this.fees = fees;
	}
	
	
	@Override
	public int getFees() {
		
		return super.getFees();
	}

}
