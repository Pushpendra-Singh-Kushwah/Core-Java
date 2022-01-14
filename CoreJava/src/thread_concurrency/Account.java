package thread_concurrency;

public class Account {
	
	private int balance=0;
	
	public void setBalance(int balance) throws Exception {
		Thread.sleep(200);
		this.balance=balance;
	}
	
	public int getBalance() throws Exception {
		Thread.sleep(200);
		return balance;
	}
	
	// this is method synchronized, means one object completely run then second will run;
	/*public synchronized void deposit(String message, int amount) throws Exception {
		int bal=getBalance();
		setBalance(bal+amount);
		System.out.println(message + "\t Now Balance is : " + getBalance());
	}*/
	
	// this is asynchronized means both object will run simultaneously
	/*
	public void deposit(String message, int amount) throws Exception {
		int bal=getBalance();
		setBalance(bal+amount);
		System.out.println(message + "\t Now Balance is : " + getBalance());
	}
	*/
	
	public void deposit(String message, int amount) throws Exception {
		synchronized (this) {
			int bal=getBalance();
		setBalance(bal+amount);
		}
		System.out.println(message + "\t Now Balance is : " + getBalance());
	}
	
}

/* Notes:- synchronization is of two types;
 * 
 * Method synchronization:- in this the entire method is synchronized, sometimes is time consuming.
 * 
 * Block synchronization:- in this block of method is synchronized which is need to be executed. it is time efficient.
 * 
 * */




