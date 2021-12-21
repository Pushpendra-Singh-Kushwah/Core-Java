// in this class we call previous classes by making their object, because without object it is not possible to use their method
package oop;

public class ReturnTest {
	public static void main(String[] args) {
		
		ShapeModel b = new ShapeModel();
		Shape s = new Shape();
		
		s = b.getShape(1);
		s.area();
		
		s= b.getShape(3);
		s.area();
		
		
	}
}
