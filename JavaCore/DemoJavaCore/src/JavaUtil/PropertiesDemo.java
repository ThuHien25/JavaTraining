package JavaUtil;

import java.util.Properties;

/**
 * @author ThuHien. Demo java.util.Properties
 */

public class PropertiesDemo {

	public static void main(String[] args) {
		Properties prop = new Properties();

		// add some properties
		prop.put("Height", "200");
		prop.put("Width", "150");
		prop.put("Scannable", "true");

		// print all properties
		System.out.println("Properties key/value: " + prop);

		// change the properties and print
		prop.setProperty("Width", "15");
		prop.setProperty("Height", "500");
		System.out.println("Properties change: " + prop);

		// get properties and print them
		System.out.println("prop.getProperty(\"Scannable\"): " + prop.getProperty("Scannable"));
		System.out.println("prop.getProperty(\"Width\"): " + prop.getProperty("Width"));
		System.out.println("prop.getProperty(\"Length\"): " + prop.getProperty("Length", "not exists in the Property"));
	}
}
