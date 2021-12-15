// Example of method over loading
package oop;

public class OverLoading {
	
	public int HouseNo;
	public char alpha;
	public String add;

	public void address() {
		
		System.out.println("Enter the address of your Home:");

	}
	public int address(int a) {
		
		return HouseNo =  a;

	}
	
	public String address(char b, int s, String n) {
		
		add = b + s + n;
		
		return add;

	}
}
