package string_6_4;

public class Ex_6_3_CountChar {
	public static void main(String[] args) {
		
		String fname = "Vijay Chauhan";
		char ch[] = fname.toCharArray();
		int count=0;
		
		for (char c : ch) {
			if (c=='a') {
				count++;
			}
		}
		System.out.println("total occurance is : " + count);
	}
}
