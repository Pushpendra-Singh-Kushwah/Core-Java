package string;

public class StringCharStringCount {

	public static void main(String[] args) {

		String name = "Pushpendra Singh Kushwah";
		char a[] = name.toCharArray();
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			
			if (a[i]==' ') {
				
				count++;
				
			}
			
		}

		System.out.println(count);
	}
}
