package by.prakharenkau.java.learn.collections;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {

	public static void main(String[] args) {
		Person person1 = new Person(1);
		Person person2 = new Person(2);
		Person person3 = new Person(3);
		Person person4 = new Person(4);
		
//		Queue<Person> people = new LinkedList<Person>();
		Queue<Person> people = new ArrayBlockingQueue<Person>(3);
		
		people.add(person3);
		people.add(person2);
		
		System.out.println(people.offer(person4));
		System.out.println(people.offer(person1));
		
		System.out.println("Remove:");
		System.out.println(people.remove());
		System.out.println("Peek");
		System.out.println(people.peek());
		
		for (Person person : people) {
			System.out.println(person);
		}
		
	}
}

class Person {
	private int id;

	public Person(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + "]";
	}
	
	
}