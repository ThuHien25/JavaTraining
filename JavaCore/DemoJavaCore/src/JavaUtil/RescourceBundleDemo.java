package JavaUtil;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author ThuHien. Demo method of java.util.ResourceBundle
 */

public class RescourceBundleDemo {

	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", Locale.US);
		System.out.println("Message in " + Locale.US + ": " + bundle.getString("greeting"));

		// changing the default locale to indonasian
		Locale.setDefault(new Locale("in", "ID"));
		bundle = ResourceBundle.getBundle("MessageBundle");
		System.out.println("Message in " + Locale.getDefault() + ": " + bundle.getString("greeting"));
	}
}
