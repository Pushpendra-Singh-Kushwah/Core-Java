package oop;

public class TestAccount {
	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount();
		Account a = new Account();
		Account ac = new SavingAccount();
		
		System.out.println(sa.getAmount());
		System.out.println(a.getAmount());
		System.out.println(ac.getAmount());
	}

}
