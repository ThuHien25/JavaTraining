package JavaUtil;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author ThuHien. Demo Collection And Iterator
 */

public class CollectionAndIteratorDemo {

	public static void main(String[] args) {
		// create a object Collection
		Collection<String> collection = new Vector<String>();
		collection.add("Collection");
		collection.add("List");
		collection.add("Queue");
		collection.add("Set");
		collection.add("Map");

		// size Collection
		System.out.println("Size: " + collection.size());

		// use Iterator
		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			// check Iterator has element?
			String s = iterator.next();
			System.out.println("Element: " + s);
		}
	}
}
