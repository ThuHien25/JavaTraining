package AbstractFactory;
/**
 * @author ThuHien
 * Create an Abstract class to get factories for Color and Shape Objects.
 * Class ShapeFactory, ColorFactory extending AbstractFactory.
 */

public abstract class AbstractFactory {
	abstract IColor getColor(String color);
	abstract IShape getShape(String shape);
}
