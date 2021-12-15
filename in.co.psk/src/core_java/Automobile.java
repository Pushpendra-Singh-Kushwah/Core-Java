package core_java;

public class Automobile {
private String color = null;
private int speed = 0;
private String make = null;
public static int NO_OF_GEARS=0;

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

private void breakOn() {
	

}

public int changeGear() {
	return NO_OF_GEARS;
}

private void accelator() {
System.out.println("speed of car is accelarate by 20");

}

public int getSpeed(int speed) {
	return speed;
}

public static void main(String[] args) {
	Automobile alto = new Automobile();
	
	alto.getSpeed(50); // in this getSpeed method it return  the value to the speed and after that we can sysout it.
					
	alto.accelator(); // accelator is a void method which has nothing to return but it can done all things that it has in their method, thats by sysout is also done
	
	System.out.println(alto.getSpeed(40));// we use this method with sop because it return value, not print
}
}
