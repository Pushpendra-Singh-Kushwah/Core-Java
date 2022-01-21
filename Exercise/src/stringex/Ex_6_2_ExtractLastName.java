package stringex;

public class Ex_6_2_ExtractLastName {
	public static void main(String[] args) {
		String fname = "Vijay Chauhan";

		System.out.println(fname.substring(0, 5));
		System.out.println(fname.subSequence(0, 5));
	}
}
