package oop;

public class CirclePoly extends ShapePoly {

	public double radius = 0;
	public static final double PI = 3.14;
	public double area;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public CirclePoly(int radius) {
		
		this.radius = radius;
	}

	@Override
	public double Area() {

		area = PI * radius * radius;
		return area;

	}

	public static void main(String[] args) {
		CirclePoly a = new CirclePoly(10);
		System.out.println("The area of circle is : " + a.Area());
	}
}
