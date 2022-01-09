package string;

public class String_hashCode_equals {

	public static void main(String[] args) {
		String st = "10";
		String bt = "10";
		
		System.out.println(st.equals(bt));
		System.out.println(st.hashCode());
		System.out.println(bt.hashCode());
		System.out.println(st==bt);
		
		String st1 = new String("15");
		String bt1 = new String("15");
		
		System.out.println(st1.equals(bt1)); // check the value 
		System.out.println(st1.hashCode());
		System.out.println(bt1.hashCode());
		System.out.println(st1==bt1);          // check the reference
	}
}
