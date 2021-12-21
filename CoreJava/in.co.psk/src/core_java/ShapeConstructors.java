package core_java;

public class ShapeConstructors {
	
	private String color = null;
	private int borderWidth = 0;
	
	public ShapeConstructors() {
		System.out.println("this is default construct : ");
	}
	
	public ShapeConstructors(String c, int w) {
		color = c;
		borderWidth = w;
		System.out.println("contructor has no return type : " + color +"    "+ borderWidth);
	}
	
	public static void main(String[] args) {
		ShapeConstructors s1 = new ShapeConstructors();
		
		ShapeConstructors s2 = new ShapeConstructors("red", 10);
		
		System.out.println(s2.color); // s2 has both attributes color and borderWidth, when we assign value to them they update s2.
		System.out.println(s2.borderWidth);
		System.out.println(s1.color); // s1 also has attributes color and borderWidth but in this constructor we have not use parameter, so it will catch the initial value.   
		System.out.println(s1.borderWidth);
			
		}
	}
