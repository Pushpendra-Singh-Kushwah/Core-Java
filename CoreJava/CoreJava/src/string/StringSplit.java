package string;

public class StringSplit {
	public static void main(String[] args) {
		 String name = "Pushpendra Singh Kushwah";
		 String splitName[] = name.split(" ");
		
		for (String string : splitName) {
			
			System.out.println(string);
		}
	}
}
