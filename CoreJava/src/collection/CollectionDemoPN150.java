package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemoPN150 {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("ek");
		c.add("do");
		c.add("teen");
		c.add("char");
		c.add("panch");
	
		for (Object object : c) {

			System.out.print(object);
		}
		
		Object arr[] = c.toArray();
		
		for (Object object : arr) {
			String s = (String) object;
			System.out.print(s);
			
		}
	}
	
	
}
