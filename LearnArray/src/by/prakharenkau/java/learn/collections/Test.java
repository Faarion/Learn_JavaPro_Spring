package by.prakharenkau.java.learn.collections;

public class Test {

	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(1);
		myLinkedList.add(2);
		myLinkedList.add(3);
		myLinkedList.add(4);
		myLinkedList.add(10);
		
		System.out.println(myLinkedList);
		
		myLinkedList.remove(2);
		System.out.println(myLinkedList);
		
		myLinkedList.remove(0);
		System.out.println(myLinkedList);
	}
}
