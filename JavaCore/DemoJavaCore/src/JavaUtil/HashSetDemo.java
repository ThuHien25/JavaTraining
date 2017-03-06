package JavaUtil;

import java.util.HashSet;

/**
 * @author ThuHien. Demo method of java.Util.HashSet
 */

public class HashSetDemo {

	public static void main(String[] args) {
		// Create hash set
		HashSet<String> hashSet = new HashSet<String>();

		// Populate hash set
		hashSet.add("One");
		hashSet.add("Two");
		
		// Checking elements in hash set
		System.out.println("Hash set values: " + hashSet);

		/*
		 * Add elements existing in hash set, Add elements new and Remove
		 * elements old
		 */
		hashSet.add("One");
		hashSet.add("Three");
		System.out.println("Hash set values new: " + hashSet);
		
		//Remove elements in hash set
		hashSet.remove("One");
		System.out.println("Hash set remove \"One\": " + hashSet);
	}
}
