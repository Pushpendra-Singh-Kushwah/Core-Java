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
	public void withdrawal(double withdrwl, Account child) {
		child.setBalance(child.getBalance()-withdrwl);

	}
}
