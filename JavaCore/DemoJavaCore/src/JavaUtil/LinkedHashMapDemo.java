package JavaUtil;

import java.util.LinkedHashMap;

/**
 * @author ThuHien. Demo method of java.util.LinkedHashMap
 */

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		// Create a new linked hash map
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>(5);

		// Add some values in the map
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);

		// Print the map
		System.out.println("Map: " + map);

		// Check if map contains 3
		System.out.println("Map contains 3? " + map.containsValue(3));

		// Check if map contains 5
		System.out.println("Map contains 5? " + map.containsValue(5));

		// Get key "Three"
		System.out.println("Key \"Three\": " + map.get("Three"));

		// Get key "Five"
		System.out.println("Key \"Five\": " + map.get("Five"));
	}
}
