package NullObject;
/**
 * @author ThuHien
 */

public class CustomerFactory {
	public static final String[] names = {"Hana", "John", "David"};
	
	public static AbstractCustomer getCustomer(String name) {
		
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}
