package oop;

public class SecondClass extends Student {

public SecondClass() {}
	
	public SecondClass(int fees) {
		this.fees = fees;
	}
	
	@Override
	public int getFees() {
		
		return super.getFees();
	}
}
