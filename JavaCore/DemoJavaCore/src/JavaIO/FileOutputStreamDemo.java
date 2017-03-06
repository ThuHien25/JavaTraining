package JavaIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * @author ThuHien. Demo java.io.FileOutputStream
 * @source: "output.txt"
 */
public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {

		// Create a binary stream to a file record.
		OutputStream out = new FileOutputStream("output.txt");

		/*
		 * Create a character stream recording. UTF-8 Encoding
		 */
		Writer writer = new OutputStreamWriter(out, "UTF-8");

		String s = "Demo java.io.FileOutputStream";
		writer.write(s);
		writer.close();
		
		System.out.println("Success...");
	}
}
