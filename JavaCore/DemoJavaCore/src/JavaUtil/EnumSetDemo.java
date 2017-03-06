package JavaUtil;

import java.util.EnumSet;

/**
 * @author ThuHien. Demo Enum Set
 */
public class EnumSetDemo {

	// create an enum
	public enum Numbers {

		ONE, TWO, THREE, FOUR, FIVE
	};

	public static void main(String[] args) {
		// create an empty EnumSet
		EnumSet<Numbers> set = null;

		// print the set
		System.out.println("EnumSet: " + set);

		// create the set by getting all elements from Numbers
		set = EnumSet.allOf(Numbers.class);

		// print the updated set
		System.out.println("Updated Enum set:" + set);

		// create a setCopy which is a copy of set
		EnumSet<Numbers> setCopy = set.clone();

		// print the updated set
		System.out.println("Set Copy:" + setCopy);
	}
}
