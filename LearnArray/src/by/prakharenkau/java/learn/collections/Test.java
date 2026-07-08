package by.prakharenkau.java.learn.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Map<Person, String> map = new HashMap<Person, String>();
		Set<Person> set = new HashSet<Person>();
		Person person1 = new Person(1, "Mark");
		Person person2 = new Person(1, "Mark");
		
		map.put(person1, "strpers1");
		map.put(person2, "strpers2");
		
		set.add(person1);
		set.add(person2);
		
		System.out.println(map);
		System.out.println(set);
		
		
	}
}

class Person{
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
