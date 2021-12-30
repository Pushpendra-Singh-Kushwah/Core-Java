package core_java;

public class Account {
	private String number = null;
	private String accountType = null;
	private double balance = 0;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void fundTransfer(double transerAmt, Account parents, Account child ) {
             parents.setBalance(parents.getBalance() -  transerAmt);
             child.setBalance(child.getBalance() +  transerAmt);
             
	}
	
	public void deposit(double deposit, Account child) {
		child.setBalance(child.getBalance()+deposit);

	}
	public void withdrawal(int amt, Account object) throws Exception {
		object.setBalance(object.getBalance()-amt);
		System.out.println(object.getBalance());
		
		if(object.getBalance()>2000000) {
			 System.out.println("Withdrawal is Possible");
		 }
		else {
			 Exception e = new Exception("Insufficient fund");
			 throw e;
		 }
	}
		public void withdrawal2(int amt, Account a) {
			//object.setBalance(object.getBalance()-amt);
			//System.out.println(a.getBalance());
			try {
				if ((a.getBalance()-amt) < 500) {
					System.err.println("withdrawal failed due to insufficient fund i.e>500");
					a.setBalance(a.getBalance());
				}else {
					a.setBalance(a.getBalance()-amt);
				}
			}catch(Exception E) {
				System.out.println(E.getMessage());
			}
	}
}
