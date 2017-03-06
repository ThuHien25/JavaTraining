package JavaIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author ThuHien. Demo java.io.BufferedOutputStream
 * @source: "output.txt"
 */

public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		// Create a binary stream to a file record.
		OutputStream out = new FileOutputStream("output.txt");

		// output stream is converted to buffered output stream
		BufferedOutputStream bout = new BufferedOutputStream(out);

		String s = "Demo java.io.BufferedOutputStream";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		out.close();
		
		System.out.print("Success...");
	}
}
