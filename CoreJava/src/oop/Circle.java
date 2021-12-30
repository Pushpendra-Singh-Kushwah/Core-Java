// inheritance and method overriding. this is child circle class which extends parent shape class.
package oop;

public class Circle extends Shape {
	public int radius = 0;

	public int getRadius() {
		return radius;
	}

	public Circle() {				// Circle() and Circle(int i) are constructor not 										required for this class, reason for making is 										we use this constructor in class name return 										type programe (ShapeModel and ReturnTest)
	System.out.println("this is circle default constructor");	
	}
	
	public Circle(int i) {
		radius = i;
	}

	@Override
	public void area() {
		float areaofcircle = (float) 3.14 * radius * radius;
		System.out.println("area of circle is  : " + areaofcircle);
	}
	
	

	public static void main(String[] args) {

		Circle a = new Circle(5); // type 1:  child class object that become instance after 										memory 	allotment. Case 1: a
									// will access both in parent and child because it is object 										of child class.
		a.setColor("blue");
		a.setBorderWidth(10);
		
		System.out.println(a.getColor());
		System.out.println(a.getBorderWidth());
		
		a.area(); // there are 2 method of area one in shape and one in circle but a is object 						of
					// circle so it will use method of circle class, reason behind making same
					// method is, we want different output.

		Shape d = new Shape(); // type 2 : parent object, constructor and method call
		d.area();
		
		Shape b = new Circle(); //  type 3 : object of parent and constructor of child, if the 								method called is available in parent than it will search for the 								same method in child if found it execute the method of child, 								otherwise it will execute the method of parent. y
		
		b.area();
		System.out.println(b.getColor());
		// Circle C = new Shape(); // in this statement compilation error occur.because
		// shape() is constructor of shape class when we define instantiation of object
	}

}
