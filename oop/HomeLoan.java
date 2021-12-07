package oop;

public class HomeLoan {

	public static void main(String[] args) {
		Bank [] a = new Bank[3];
		a[0] = new AxisBank();
		a[1] = new HDFCBank();
		a[2] = new ICICIBank();
		
		loanEnquiry(a);
	}
	
	static void loanEnquiry(Bank[]  a) {
		
		for (Bank b : a) {
			String Name = b.getName();
			double interestR = b.interestRate();
			
			System.out.println("Bank name is :  " + Name + ",   interest rate is :  " + interestR);;
			
			
		}

	}
	
}
