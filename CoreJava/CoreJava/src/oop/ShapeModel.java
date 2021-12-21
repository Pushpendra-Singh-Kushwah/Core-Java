package oop;

public class ShapeModel {
	
	public Shape getShape(int i) {
		
		Shape a = new Shape();
		
		if (i==1) {
			a = new Circle(2);
			
		if (i==2) {
			a= new Triangle();
		}	
		if (i==3) {
			a= new Shape();
		}	
				
		}
		return a;
		
	}

}
