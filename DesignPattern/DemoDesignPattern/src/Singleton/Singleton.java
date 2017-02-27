package Singleton;
/**
 * @author ThuHien
 */

public class Singleton {
	private String _strname;
	
	//create an object of Singleton
	private static Singleton instance;
	
	//make the constructor private so that this class cannot be create outside
	private Singleton(String name) {
		_strname = name;
	}
	
	//Get the only object available
	public static Singleton getInstance() {
		if(instance == null)
			instance = new Singleton("Hello World!");
		return instance;
	}
	
	public void showMessage() {
		System.out.println(this._strname);
	}
}
