package string;

public class StringCharCount {
	public static void main(String[] args) {
	
		String name = "Pushpendra";
		char a[] = name.toCharArray();
		int count=0;
		
		for (int i = 0; i < a.length; i++) {
				
			count++;
		}
		
		System.out.println(count);
	}
}
