package core_java;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile tata = new Automobile();
		
		tata.setColor("white");
		System.out.println("Color of car is :   " + tata.getColor());
		
		tata.setMake("Tata Motors");
		System.out.println("Company of the car:   " + tata.getMake());
		
		System.out.println("Gear of car is  :  " + tata.changeGear()); // Gear of car is not changing ask to sir ji
	
		System.out.println("speed of the car is :   " + tata.getSpeed(90));
	}

}
