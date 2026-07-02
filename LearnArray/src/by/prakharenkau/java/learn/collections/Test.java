package by.prakharenkau.java.learn.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
//		System.out.println(arrayList.get(0));
//		System.out.println(arrayList.get(99));
//		
//		System.out.println(arrayList.size());
		
//		for (int i = 0; i < arrayList.size(); i++) {
//			System.out.print(arrayList.get(i) + " ");
//		}
//		
//		System.out.println();
//		
//		for (Integer i: arrayList) {
//			System.out.print(arrayList.get(i) + " ");
//		}
		
//		list.remove(5);
//		System.out.println(list.toString());
		
		// Много удалений из листа
		// ArrayList переделываем в LinkedList
		list = new LinkedList<>();
		
		
	}

}
