package oop;

public class Rectangle extends Shape {

	public int radius = 0;
	private int length = 0;
	private int width = 0;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	public void area() {
		int all = length*width;
		System.out.println("area of rectangle  = " + all);
	}
}
