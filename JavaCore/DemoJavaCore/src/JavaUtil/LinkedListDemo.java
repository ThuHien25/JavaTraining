package JavaUtil;

import java.util.LinkedList;

/**
 * @author ThuHien. Demo method of java.Util.LinkedList
 */
public class LinkedListDemo {

	public static void main(String[] args) {

		System.out.println("--------LinkedList Demo--------");

		// Create a LinkedList
		LinkedList<String> list = new LinkedList<String>();

		// Add some elements
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		// Print all elements in LinkedList.
		System.out.println("Original contents of list: " + list);

		// Print a element in LinkedList.
		System.out.println("LinkedList Elements postion 1: " + list.get(0));

		// Add a new element at the beggining of the list
		list.addFirst("A1");
		System.out.println("Contents after addFirst(\"A1\"): " + list);

		// Add a new element at the end of the list
		list.addLast("Z");
		System.out.println("Contents after addLast(\"Z\"): " + list);

		// Use add(int index, E element) method
		list.add(0, "A2");
		System.out.println("Contents after add(0,\"A2\"): " + list);

		// Remove the element "C"
		list.remove("C"); // list.remove(2);
		System.out.println("Contents after remove(\"C\"): " + list);

		// Remove the first element and the last element
		list.removeFirst();
		list.removeLast();
		System.out.println("Contents of list after remove first and last: " + list);

		// Set "Love" at index 3
		list.set(2, "Love");
		System.out.println("Contents after set(2,\"Love\"): " + list);
	}
}
