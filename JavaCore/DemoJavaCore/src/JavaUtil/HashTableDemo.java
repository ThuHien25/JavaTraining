package JavaUtil;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;
import java.util.Map.Entry;

/**
 * @author ThuHien. Demo method of java.util.Hashtable
 */

public class HashTableDemo {

	public static void main(String[] args) {

		// Create hash table
		Hashtable<Integer, String> htable = new Hashtable<Integer, String>();

		// Put values in table
		htable.put(1, "A");
		htable.put(2, "B");
		htable.put(3, "C");
		htable.put(4, "D");

		// Print hash table
		System.out.println("Hash Table:" + htable);

		// Get values at key 3
		System.out.println("Values at key 3 is: " + htable.get(3));

		// Create enumeration for keys
		Enumeration<Integer> en = htable.keys();
		System.out.println("Keys of the Hashtable: ");

		// Display search result
		while (en.hasMoreElements()) {
			System.out.print("\t" + en.nextElement());
		}
		System.out.println();
		
		//Get entry set
		Set<Entry<Integer, String>> set = htable.entrySet();
		for (Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
