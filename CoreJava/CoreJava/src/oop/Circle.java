// inheritance and method overriding. this is child circle class which extends parent shape class.
package oop;

public class Circle extends Shape {
	public int radius = 0;

	public int getRadius() {
		return radius;
	}

	public Circle() {				// Circle() and Circle(int i) are constructor not 										required for this class, reason for making is 										we use this constructor in class name return 										type programe (ShapeModel and ReturnTest)
		
	}
	
	public Circle(int i) {
		radius = i;
	}

	@Override
	public void area() {
		float areaofcircle = (float) 3.14 * radius * radius;
		System.out.println("area of circle is: " + areaofcircle);
	}
	
	

	public static void main(String[] args) {

		Circle a = new Circle(); // child class object that become instance after memory allotment. Case 1: a
									// will access both in parent and child because it is object of child class.

		a.setColor("blue");
		a.setBorderWidth(10);
		

		System.out.println(a.getColor());
		System.out.println(a.getBorderWidth());
		
		a.area(); // there are 2 method of area one in shape and one in circle but a is object of
					// circle so it will use method of circle class, reason behind making same
					// method is we want different output.

		Shape b = new Circle(); // this object b can use only method of Parent shape class

		b.setColor("yellow");
		System.out.println(b.getColor());
		// Circle C = new Shape(); // in this statement compilation error occur.because
		// shape() is constructor of shape class when we define instantiation of object
	}

}
