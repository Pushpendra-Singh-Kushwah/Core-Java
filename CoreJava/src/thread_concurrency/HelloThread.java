package thread_concurrency;

public class HelloThread  extends HelloWithThread implements Runnable{

	public HelloThread(String abc) {
		super(abc);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
				try {
					Thread.sleep(1000);  // its sleep the thread for 1 sec every time
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			System.out.println(i + "   " + name);
		}
	}
	public static void main(String[] args) {
		HelloThread ht = new HelloThread("Ram");
		HelloThread st = new HelloThread("Shyam");
		
		Thread one = new Thread(ht);
		Thread two = new Thread(st);
		
		one.start();
		two.start();
	}

}
