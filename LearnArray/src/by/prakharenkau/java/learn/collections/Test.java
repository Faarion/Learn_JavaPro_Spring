package by.prakharenkau.java.learn.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> linkedList = new LinkedList<Integer>();
		List<Integer> arrayList = new ArrayList<Integer>();
		
		mesureTime(arrayList);
		
		mesureTime(linkedList);
		
	}
	
	
	private static void mesureTime(List<Integer> list) {
		
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			list.add(0, i);
		}
		
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}

}
