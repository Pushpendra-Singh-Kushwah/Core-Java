package polymorphism;

public class SavingAccount1 extends Account1 {

	public int getAmount() {

		return 10;
	}
	
	public static void main(String[] args) {
		
		SavingAccount1 a = new SavingAccount1();
		Account1 b = new Account1();
		Account1 c = new SavingAccount1();
		
		System.out.println(a.getAmount());
		System.out.println(b.getAmount());
		System.out.println(c.getAmount());
	}
}
