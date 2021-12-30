package oop;

public class TestShape {
	public static void main(String[] args) {
		
		ShapeModel a = new ShapeModel();
		Shape b = new Shape();
		
		b= a.getShape(1);
		b.area();
		
		b= a.getShape(2);
		b.area();
		
		b= a.getShape(3);
		b.area();
		
	}
}
