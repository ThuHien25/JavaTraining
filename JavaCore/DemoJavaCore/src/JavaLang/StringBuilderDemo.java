package JavaLang;

import java.lang.StringBuilder;

/**
 * @author ThuHien. Demo java.lang.StringBuilder
 */
public class StringBuilderDemo {

	public static void main(String[] args) {
		// create String Builder
		StringBuilder sb = new StringBuilder("Hello ");
		System.out.println("StringBuilder = " + sb);

		// returns the current capacity of the String Builder i.e. 16 + 6
		System.out.println("capacity = " + sb.capacity());

		// appends the char argument as string to the string Builder.
		sb.append("TH");

		// print the string Builder after appending
		System.out.println("After append first = " + sb);

		System.out.println("-------------------------");
		sb = new StringBuilder("Java");
		System.out.println("StringBuilder = " + sb);

		// returns the current capacity of the String Builder i.e. 16 + 4
		System.out.println("capacity = " + sb.capacity());

		// appends the char argument as string to the string Builder.
		sb.append('!');

		// print the string Builder after appending
		System.out.println("After append second = " + sb);

		System.out.println("-------------------------");
		System.out.println("StringBuilder = " + sb);

		// prints substring from index 3
		System.out.println("substring is = " + sb.substring(2));

		/*
		 * prints substring from index 1 to 4 excluding character at 4th index
		 */
		System.out.println("substring is = " + sb.substring(0, 4));

	}

}
