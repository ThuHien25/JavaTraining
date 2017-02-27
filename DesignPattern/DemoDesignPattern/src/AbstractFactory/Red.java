package AbstractFactory;
/**
 * @author ThuHien
 */

public class Red implements IColor {

	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}
}
