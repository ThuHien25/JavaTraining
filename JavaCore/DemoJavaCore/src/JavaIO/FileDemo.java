package JavaIO;

import java.io.File;

/**
 * @author ThuHien. Demo java.io.File
 */

public class FileDemo {

	public static void main(String[] args) {

		// create new file
		File file = new File("input.txt");
		
		System.out.println("Absolute File: " + file.getAbsoluteFile());

		System.out.println("Name: " + file.getName());

		System.out.println("Path: " + file.getPath());

		System.out.println("Parent File: " + file.getParentFile());

		System.out.println("File Is Exists: " + file.exists());

		System.out.println("Is File: " + file.isFile());

		System.out.println("Length: " + file.length());
		
		

	}
}
