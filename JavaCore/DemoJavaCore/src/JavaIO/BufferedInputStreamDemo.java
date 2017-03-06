package JavaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author ThuHien. Demo java.io.BufferedInputStream
 * @source: "input.txt"
 */

public class BufferedInputStreamDemo {

	public static void main(String[] args) {
		try {
			// Create a binary stream, read files.
			FileInputStream file = new FileInputStream("input.txt");

			// input stream is converted to buffered input stream
			BufferedInputStream bin = new BufferedInputStream(file);

			int i = 0;

			// Read in turn each character
			while ((i = bin.read()) != -1) {

				// Cast of characters and print
				System.out.print((char) i);
			}
			bin.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (IOException e) {
			System.out.println("Can not read file!");
		}
	}
}
