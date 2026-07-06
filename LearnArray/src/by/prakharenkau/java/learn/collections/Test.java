package by.prakharenkau.java.learn.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		
		
		System.out.println("Hash set:");
		testMap(hashSet);
		
		System.out.println("\nLinkedHashSet:");
		testMap(linkedHashSet);
		
		System.out.println("\nTreeSet:");
		testMap(treeSet);
	}
	
	public static void testMap(Set<String> set) {
		set.add("Mike");
		set.add("George");
		set.add("Donald");
		set.add("Katy");
		set.add("Anna");
		set.add("Tom");
		
		for (String str: set) {
			System.out.println(str);
		}
		
		System.out.println("Contains \"Tom\": " + set.contains("Tom"));
		System.out.println("Contains \"Tim\": " + set.contains("Tim"));
		
		System.out.println("Empty set: " + set.isEmpty());
	}
}
