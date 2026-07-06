package by.prakharenkau.java.learn.collections;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(3, "Три");
		
//		System.out.println(map);
//		
//		System.out.println(map.get(1));
//		System.out.println(map.get(10));
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
	
}
