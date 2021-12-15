package abstract_Interface;

public class Businessman implements Richman, SocialWorker {

	public String name;
	public String address;
	
	@Override
	public void earnmoney() {
		
		System.out.println("earn money");
		
	}
	@Override
	public void donation() {
		
		System.out.println("donetion");
		
	}
	@Override
	public void party() {
		
		System.out.println("party");
		
	}
	@Override
	public void helpToOther() {
		
		System.out.println("this is for help to other");
		
	}

	public static void main(String[] args) {
		
		Businessman ambani = new Businessman();
		
		ambani.helpToOther();
	}
}


