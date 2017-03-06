package JavaLang;

import java.lang.StringBuffer;

/**
 * @author ThuHien. Demo java.lang.StringBuffer
 */
public class StringBufferDemo {

	public static void main(String[] args) {

		// create String Buffer
		StringBuffer sb = new StringBuffer("Hello ");
		System.out.println("StringBuffer = " + sb);

		// returns the current capacity of the String buffer i.e. 16 + 6
		System.out.println("capacity = " + sb.capacity());

		// appends the char argument as string to the string buffer.
		sb.append("TH");

		// print the string buffer after appending
		System.out.println("After append first = " + sb);

		System.out.println("-------------------------");
		sb = new StringBuffer("Java");
		System.out.println("StringBuffer = " + sb);

		// returns the current capacity of the String buffer i.e. 16 + 4
		System.out.println("capacity = " + sb.capacity());

		// appends the char argument as string to the string buffer.
		sb.append('!');

		// print the string buffer after appending
		System.out.println("After append second = " + sb);

		System.out.println("-------------------------");
		System.out.println("StringBuffer = " + sb);

		// prints substring from index 3
		System.out.println("substring is = " + sb.substring(2));

		/*
		 * prints substring from index 1 to 4 excluding character at 4th index
		 */
		System.out.println("substring is = " + sb.substring(0, 4));
	}
}
