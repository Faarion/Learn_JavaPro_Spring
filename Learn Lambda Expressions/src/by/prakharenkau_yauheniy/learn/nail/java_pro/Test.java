package by.prakharenkau_yauheniy.learn.nail.java_pro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("Goodbye");
		list.add("a");
		list.add("ab");
		
		Comparator<String> comparator = (s1, s2) -> {
			if (s1.length() > s2.length()) return 1;
			else if (s1.length() < s2.length()) return -1;
			else return 0;
		};
		
		list.sort(comparator);
		
		
		System.out.println(list);
	}

}
