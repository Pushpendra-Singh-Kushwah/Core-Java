package thread_concurrency;

public class HelloWithThread extends Thread{
	String name = null;
	
	public HelloWithThread(String abc) {
		name = abc;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + "   " + name);
		}
	}
	
	public static void main(String[] args) {
		
		HelloWithThread t1 = new HelloWithThread("Hiiii");
		HelloWithThread t2 = new HelloWithThread("Bye");
		
		t1.setPriority(1);
		t2.setPriority(5);	// highest priority will executed first; by default priority is 5; 
		t1.start();
		t2.start();
	}
}
