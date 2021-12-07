package oop;

public class TrianglePoly extends ShapePoly {

	public int base = 0;
	public int height = 0;
	public static final double FORMULA = 0.5;
	public double area = 0;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	public TrianglePoly(int base, int height){
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double Area() {
		area = base * height * FORMULA;
		return area;
	}

	public static void main(String[] args) {

		TrianglePoly c = new TrianglePoly(5,8);

		//c.setBase(8);
		//c.setHeight(10);

		System.out.println("The area of Triangle is : " + c.Area());

	}
}
