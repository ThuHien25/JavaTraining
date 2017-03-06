package JavaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author ThuHien. Demo java.io.FileInputStream
 * @source: "input.txt"
 */

public class FileInputStreamDemo {

	public static void main(String[] args) {
		try {			
			// Create a binary stream, read files.
			FileInputStream file = new FileInputStream("input.txt");
			
			int i = 0;
			
			// Read in turn each character
			while ((i = file.read()) != -1) {
				
				// Cast of characters and print
				System.out.print((char) i);
			}
			file.close();
		} catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Can not read file!");
        } 
	}
}
