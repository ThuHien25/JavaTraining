package JavaUtil;

import java.util.NavigableSet;
import java.util.TreeMap;

/**
 * @author ThuHien. Demo method of java.util.TreeMap
 */

public class TreeMapDemo {

	public static void main(String[] args) {

		// Creating tree map
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		// Put tree map
		treeMap.put(3, "Tom");
		treeMap.put(1, "Tom");
		treeMap.put(4, "Donald");
		treeMap.put(2, "Jerry");

		// Print Tree map
		System.out.println("Tree map: " + treeMap);

		// Putting values in navigable set
		NavigableSet<Integer> nset = treeMap.descendingKeySet();
		System.out.println("Descending key of the TreeMap: " + nset);
	}
}
