package by.prakharenkau.java.learn.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Iterator<Integer> iterator = list.iterator();
		
		//Before Java 5
		int idx = 0;
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			if (idx == 1) {
				iterator.remove();
			}
			idx++;
		}
		
	 System.out.println(list);
		
		//Java 5
		for (Integer x : list) {
			System.out.println(x);
		}
		
	}
}
