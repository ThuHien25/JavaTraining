package JavaUtil;

import java.util.Vector;

/**
 * @author ThuHien. Demo method of java.Util.Vector
 */

public class VectorDemo {

	public static void main(String[] args) {

		/*
		 * Create an empty Vector with an initial capacity of 10 
		 * and capacity increment of 5
		 */
		Vector<Integer> vector = new Vector<Integer>(10, 5);

		// Use add() method to add elements in the vector
		vector.add(123);
		vector.add(456);
		vector.add(new Integer(789));
		vector.add(null);

		// Print size elements in the vector
		System.out.println("Size: " + vector.size());

		// Print all elements in the vector
		System.out.println("Vector: " + vector);

		// get elements at index 1 in the vector
		Integer index = vector.elementAt(2);
		System.out.println("vector.elementAt(2) = " + index);

		//Set 16 at 2nd index position
		vector.setElementAt(16, 2);
		System.out.println("New value (Modified index 2): " + vector.get(2));
		System.out.println("Vector: " + vector);
	}
}
