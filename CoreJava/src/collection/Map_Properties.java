package collection;

import java.util.Map;
import java.util.Properties;

public class Map_Properties {
	public static void main(String[] args) {
		Map a = new Properties();
		a.put(1, "mp");
		a.put(2, "up");
		a.put(3, "delhi");
		a.put(3, "rj");
		a.put(4, "mp");
		
		System.out.println(a.size());
		System.out.println(a.entrySet());
		System.out.println(a.containsKey(3));
		System.out.println(a.containsValue("up"));
		System.out.println(a.get(2));
		System.out.println(a.keySet());
		System.out.println(a.remove(3));
		System.out.println(a.values());
	}
}
