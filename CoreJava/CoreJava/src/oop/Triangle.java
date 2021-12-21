package oop;

public class Triangle extends Shape {

	public int base = 0;
	public int hight = 0;
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	
	@Override
	public void area() {
		float triTotal = (float)0.5*hight*base;
		System.out.println("The area of triangle is : " + triTotal);
	}
	
}
