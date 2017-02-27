package NullObject;
/**
 * @author ThuHien
 * Use the CustomerFactory to get either RealCustomer or NullCustomer objects 
 * based on the name of customer passed to it.
 */

public class NullPatternDemo {

	public static void main(String[] args) {
		
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Hana");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("David");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("John");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Hien");
		
		System.out.println("-------Customers-------");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}
}
