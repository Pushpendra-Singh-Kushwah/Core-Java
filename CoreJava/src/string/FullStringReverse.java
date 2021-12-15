package string;

public class FullStringReverse {
	public static void main(String[] args) {
		
		String str = "Pushpendra Singh Kushwah";
		char ch[] = str.toCharArray();
		String rev="";
		for (int i = ch.length-1; i>=0 ; i--) {
				
			rev = rev +ch[i];
		}
		
		System.out.println(rev);
	}
}
