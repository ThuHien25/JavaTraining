package JavaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author ThuHien. Demo java.io.PrintWriter;
 * @source "output.txt"
 */

public class PrintWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Data to write on Console using PrintWriter  
		PrintWriter writer = new PrintWriter(System.out);
		writer.write("Java PrintWriter class is the implementation of Writer class.");
		writer.flush();
		writer.close();
		
		//Data to write in File using PrintWriter
		PrintWriter writer1 = null;
		writer1 = new PrintWriter(new File("output.txt"));
		writer1.write("It is used to print the formatted representation of objects to the text-output stream.");
		writer1.flush();		
		writer1.close();
	}
}
