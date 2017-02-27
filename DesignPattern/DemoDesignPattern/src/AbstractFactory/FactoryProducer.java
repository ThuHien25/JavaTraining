package AbstractFactory;
/**
 * @author ThuHien
 * Create a FactoryProducer class to get factories 
 * by passing an information such as Shape or Color.
 */

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		
		if (choice.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}
		return null;
	}
}
