package by.prakharenkau.java.learn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		
		animals.add("eliphant");
		animals.add("dog");
		animals.add("cat");
		animals.add("frog");
		animals.add("bird");
		animals.add("a");
		animals.add("ad");
		
		Collections.sort(animals, new StringLengthComparator());
		
		System.out.println(animals);
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(5);
		numbers.add(0);
		numbers.add(500);
		numbers.add(100);
		
		//Collections.sort(numbers, new BackwardsIntegerComparator());
		
//		Collections.sort(numbers, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer arg0, Integer arg1) {
//				if (arg1 > arg0) {
//					return 1;
//				} else if (arg0 > arg1) {
//					return -1;
//				}
//				return 0;
//			}
//			
//		});
		
		Collections.sort(numbers, (o1, o2) -> {
			if (o2 > o1) {
				return 1;
			} else if (o1 > o2) {
				return -1;
			}
			return 0;
		});
		
		System.out.println(numbers);
		
		List<Person> people = new ArrayList<Person>();
		people.add(new Person(3, "Mike"));
		people.add(new Person(1, "Bob"));
		people.add(new Person(2, "Katy"));
		
		Collections.sort(people, (p1, p2) -> {
			if (p1.getId() > p2.getId()) {
				return -1;
			} else if (p2.getId() > p1.getId()) {
				return 1;
			}
			return 0;
		});
		
		System.out.println(people);
	}
}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		if (arg0.length() > arg1.length()) {
			return 1;
		} else if (arg1.length() > arg0.length()) {
			return -1;
		}
		return 0;
	}
}

class 	BackwardsIntegerComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		if (arg1 > arg0) {
			return 1;
		} else if (arg0 > arg1) {
			return -1;
		}
		return 0;
	}
	
}

class Person {
	private int id;
	private String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}	
}