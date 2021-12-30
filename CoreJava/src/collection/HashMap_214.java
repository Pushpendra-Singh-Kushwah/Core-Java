package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap_214 {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("rn101",900);
		m.put("rn102",901);
		m.put("rn103",902);
		m.put("rn104",903);
		m.put("rn105",904);
		
		Integer i = (Integer) m.get("rn104");
		System.out.println(i);
		
		Set keys = m.keySet();   // key set are unique so we take it in a Set class object keys
		System.out.println(keys);
		
		Collection vals = m.values(); //  we dont know what type of data, so take it in collection
		System.out.println(vals);
		
		
	}
}
