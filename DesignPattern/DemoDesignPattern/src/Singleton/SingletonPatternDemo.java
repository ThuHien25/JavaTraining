package Singleton;
/**
 * @author ThuHien
 */

public class SingletonPatternDemo {

	public static void main(String[] args) {
		//Get the only object available
		Singleton object = Singleton.getInstance();
		
		//show the message
		object.showMessage();
	}
}
