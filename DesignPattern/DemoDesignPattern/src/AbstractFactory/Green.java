package AbstractFactory;
/**
 * @author ThuHien
 */

public class Green implements IColor {
	
	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}
}
