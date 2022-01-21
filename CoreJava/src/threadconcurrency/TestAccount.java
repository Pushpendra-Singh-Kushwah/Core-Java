package threadconcurrency;

public class TestAccount {
	public static void main(String[] args) {
		
		RacingCondThread rct1 = new RacingCondThread("Aaradhya");
		RacingCondThread rct2 = new RacingCondThread("Gauri");
		
		rct1.start();
		rct2.start();
	}
}
