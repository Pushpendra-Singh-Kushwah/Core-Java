package string_6_4;

public class Ex_6_1_ConcatenateString {
	public static void main(String[] args) {
		String fname = "Vijay";
		String lname = "Chauhan";
		
		String name = fname+lname;  // type 1
		System.out.println(name);
		
		String name1 = fname.concat(lname); // type 2
		System.out.println(name1);
	}
}
