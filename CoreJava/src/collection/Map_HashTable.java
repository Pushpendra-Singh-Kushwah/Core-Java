package collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class Map_HashTable {
	public static void main(String[] args) {
		Map a = new Hashtable();
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
