package JavaUtil;

import java.util.HashMap;
import java.util.Set;
/**
 * @author ThuHien. Demo method of java.util.HashMap
 */

public class HashMapDemo {

	public static void main(String[] args) {

		// Create hash map
		HashMap<String, Double> scores = new HashMap<>();

		// Populate hash map
		scores.put("Math", 9.0);
		scores.put("Physics", 7.5);
		scores.put("Chemistry", 6.0);
		scores.put("Economics", 8.5);
		scores.put("Geography", 9.5);

		// Use method Size()
		System.out.println("Size of the map: " + scores.size());

		// Print hash map
		System.out.println("Map: " + scores);
		
		System.out.println("----------------------------");

		//Get keyset value from map
		Set<String> keyset = scores.keySet();
		System.out.println("Key set values are: " + keyset);

		//Checking collection view of the map
		System.out.println("Collection view is: " + scores.values());

		System.out.println("----------------------------");
		
		// Get value of key "Math"
		Double value = scores.get("Math");
		System.out.println("Value for key \"Math\" = " + value);

		// Put new values at key "Chemistry"
		Double prevValue = scores.put("Chemistry", 10.0);
		System.out.println("Returned previous value of key \"Chemistry\" = " + prevValue);
		System.out.println("Map value after change: " + scores);
	}
}
