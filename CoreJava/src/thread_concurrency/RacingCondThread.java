package thread_concurrency;

public class RacingCondThread extends Thread {
	
	public static Account data = new Account();// it can also run without public static modifiers;
							// doubt in this line plz check and confirm ?????
	String name = null;
	
	public RacingCondThread(String name) {
		this.name = name;
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				data.deposit(name, 2000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
