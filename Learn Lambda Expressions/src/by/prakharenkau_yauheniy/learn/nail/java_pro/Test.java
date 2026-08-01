package by.prakharenkau_yauheniy.learn.nail.java_pro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		int[] arr = new int[10];
		List<Integer> list = new ArrayList<Integer>();
		
		fillArr(arr);
		fillList(list);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		for(int i = 0; i < 10; i++) {
			arr[i] = arr[i] * 2;
			list.set(i, list.get(i) * 2);
		}
		
		System.out.println("\nПри помощи массива");
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		list.removeAll(list);
		fillArr(arr);
		fillList(list);
		
		System.out.println("\nПри помощи лямбда выражений");
		arr = Arrays.stream(arr).map(a -> a * 2).toArray();
		list = list.stream().map(a -> a * 2).toList();
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		int[] arr2 = new int[10];
		List<Integer> list2 = new ArrayList<Integer>();
		
		fillArr(arr2);
		fillList(list2);
		
		arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
		list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
		
		System.out.println("\nЛямбда выражение с фильтром");
		System.out.println(Arrays.toString(arr2));
		System.out.println(list2);
		
		System.out.println("\nИспользование лямбда выражений и forEach");
		Arrays.stream(arr2).forEach(a -> System.out.print(a + " "));
		System.out.println();
		list2.forEach(System.out::print);
		
		System.out.println("\n\nЛямбда выраженя с reduce");
		int[] arr3 = new int[10];
		List<Integer> list3 = new ArrayList<Integer>();
		
		fillArr(arr3);
		fillList(list3);
		
		int sum1 = Arrays.stream(arr3).reduce((acc, b) -> acc + b).getAsInt();
		System.out.println(sum1);
		Integer product = list3.stream().reduce((acc, b) -> acc * b).get();
		System.out.println(product);
		
		int[] arr4 = new int[10];
		fillArr(arr4);
		
		int[] newArray = Arrays.stream(arr4).filter(a -> a % 2 != 0).map(a -> a * 2).toArray();
		System.out.println(Arrays.toString(newArray));
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(5);
		set = set.stream().map(a -> a * 3).collect(Collectors.toSet());
		
		System.out.println(set);
		
		
		
		
	}

	private static void fillList(List<Integer> list) {
		for(int i = 0; i < 10; i++) {
			list.add(i + 1);
		}
		
	}

	private static void fillArr(int[] arr) {
		for (int i = 0; i < 10; i++) {
			arr[i] = i + 1;
		}
	}
	
	

}
