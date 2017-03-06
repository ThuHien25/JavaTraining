package JavaUtil;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author ThuHien. Demo method of java.Util.TreeSet
 */

public class TreeSetDemo {

	public static void main(String[] args) {
		// creating a TreeSet
		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		// adding in the tree set
		treeSet.add(12);
		treeSet.add(45);
		treeSet.add(9);
		treeSet.add(11);
		treeSet.add(14);

		// displaying the Tree set data sort ascending
		System.out.println("Tree set data: " + treeSet);

		// getting values less than 12
		TreeSet<Integer> treeHeadSet = new TreeSet<Integer>();
		treeHeadSet = (TreeSet<Integer>) treeSet.headSet(12);

		// create an iterator
		Iterator<Integer> iterator = treeHeadSet.iterator();

		// displaying the Tree set data less than 12
		System.out.print("Tree set data less than 12: ");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}
}
