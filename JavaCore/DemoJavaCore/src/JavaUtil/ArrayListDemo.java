package JavaUtil;

import java.util.ArrayList;

/**
 * @author ThuHien. Demo method of java.Util.ArrayList
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		System.out.println("--------ArrayList Demo--------");

		// Create a ArrayList
		ArrayList<String> names = new ArrayList<String>();

		// Use add() method to add elements in the ArrayList
		names.add("Hana");
		names.add("John");
		names.add("David");
		names.add("David");

		// Size of ArrayList after added more elements
		System.out.println("Size: " + names.size());

		// Print all the elements in ArrayList
		System.out.println("Contents of names: " + names);

		// Use addAll(Collection c) method
		ArrayList<String> secondNames = new ArrayList<String>();
		secondNames.add("Ms");
		secondNames.add("Mr");
		names.addAll(secondNames);
		System.out.println("Contents of names (Use addAll(Collection c) method): " + names);

		// Use addAll(int index, Collection c) method
		names.addAll(2, secondNames);
		System.out.println("Contents of names (Use addAll(int index, Collection c) method): " + names);

		// Use clone() method
		Object cloneObject = names.clone();
		System.out.println("Content of cloneObject: " + cloneObject);

		// Use remove(index) method
		names.remove(names.size() - 1);
		names.remove(names.size() - 1);
		names.remove(3);
		names.remove(2);
		System.out.println("Contents of names (After remove(index) method): " + names);

		// Method contains(Object o)
		System.out.println("Is names contains 'Hana': " + names.contains("Hana"));

		// Method get(int index)
		System.out.println("names.get(0) = " + names.get(0));
		System.out.println("Get first indexOf(\"David\") = " + names.indexOf("David"));
		System.out.println("Get last indexOf(\"David\") = " + names.lastIndexOf("David"));

		// Method set(int index, Object o)
		names.set(1, "Hana");
		System.out.println("Set(1, \"Hana\") = " + names);

		// toArray()
		Object[] nameArr = names.toArray();
		System.out.println("-----Use toArray() method-----");
		for (Object name : nameArr) {
			System.out.println("name = " + name.toString());
		}
	}
}
