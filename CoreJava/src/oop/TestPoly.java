package oop;

public class TestPoly {

	static double calArea(ShapePoly[] abc) {

		double total = 0;
		for (int i = 0; i < abc.length; i++) {

			total = total + abc[i].Area();
			
		}
		return total;
	}

	public static void main(String[] args) {

		ShapePoly[] abc = new ShapePoly[3];
		abc[0] = new CirclePoly(5);
		abc[1] = new RectanglePoly(10,10);
		abc[2] = new TrianglePoly(12,10);

		double combinedArea = calArea(abc);
		System.out.println("The final area of all shapes is : " + combinedArea);

	}
}                                                                                             
