package core_java;

public class TestAccount {
	public static void main(String[] args) throws Exception {
		Account parents = new Account();
		Account child = new Account();

		parents.setBalance(550000);
		child.setBalance(60000);

		// double transerAmt = 5000; // not required in code, if you use it, it does'nt
		// effect, without this programme work

		System.out.println("Parents account balance : " + parents.getBalance());
		System.out.println("child account balance : " + child.getBalance());

		parents.fundTransfer(15000, parents, child);

		System.out.println(" Parents account after debit : " + parents.getBalance());
		System.out.println("Child account after credit : " + child.getBalance());

		child.deposit(2100, child);
		System.out.println("child balance after deposit 2100 rupees : " + child.getBalance());

//	// this section is for throw 
//	parents.withdrawal(500, parents);
//	
//	// this section for try catch block
//	parents.withdrawal2(5000, parents);
//	}

		Account a = new Account();
		a.setBalance(5100);
		System.out.println("before withdrawal - " + a.getBalance());
		a.withdrawal2(5000, a);
		System.out.println("Remaining bal - " + a.getBalance());
	}
}
