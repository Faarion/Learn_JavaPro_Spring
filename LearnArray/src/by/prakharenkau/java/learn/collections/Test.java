package by.prakharenkau.java.learn.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		List <Person> peopleList = new ArrayList<Person>();
		Set<Person> peopleSet = new TreeSet<Person>();
		
		addElement(peopleList);
		addElement(peopleSet);
		
		System.out.println(peopleList);
		System.out.println(peopleSet);
	}
	
	private static void addElement(Collection<Person> collection) {
		collection.add(new Person(4, "George "));
		collection.add(new Person(2, "Kate"));
		collection.add(new Person(1, "Bob"));
		collection.add(new Person(3, "Tom"));
	}
}

class Person implements Comparable<Person> {
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
	@Override
	public int compareTo(Person o ) {
		if (this.getId() > o.getId()) {
			return 1;
		} else if (o.getId() > this.getId()) {
			return -1;
		}
		return 0;
	}	
	public int getId() {
		return id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(id), name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
}