package Iterator;
/**
 * @author ThuHien
 * Use the NameRepository to get iterator and print names.
 */

public class IteratorPatternDemo {

	public static void main(String[] args) {
		NameRepository nameRepository = new NameRepository();
		
		for (Iterator iter = nameRepository.getIterator(); iter.hasNext();) {
				String name = (String)iter.next();
				System.out.println("Name: " + name);
		}
	}
}
