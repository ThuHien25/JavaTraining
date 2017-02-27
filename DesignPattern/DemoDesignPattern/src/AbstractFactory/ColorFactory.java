package AbstractFactory;
/**
 * @author ThuHien
 */

public class ColorFactory extends AbstractFactory {
	
	@Override
	public IColor getColor(String color) {
		
		if (color == null) {
			return null;
		}
		
		if (color.equalsIgnoreCase("Red")) {
			return new Red();
		} else if (color.equalsIgnoreCase("Green")) {
			return new Green();
		} else if (color.equalsIgnoreCase("Blue")) {
			return new Blue();
		} 
			
		return null;
	}

	@Override
	IShape getShape(String shape) {
		return null;
	}
}
