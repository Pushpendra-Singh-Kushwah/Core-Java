package oop;

public class RectanglePoly extends ShapePoly {

	public int length = 0;
	public int width = 0;
	
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
	
	public RectanglePoly(int length, int width){
		this.length = length;
		this.width = width;
		
	}
	
	@Override
	public double Area() {
		
		return length*width;
	}
	
	public static void main(String[] args) {
		RectanglePoly b = new RectanglePoly(10,5);
		
		//b.setLength(8);
		//b.setWidth(6);
		
		System.out.println("The area of rectagle is : "+ b.Area());
	}
}
