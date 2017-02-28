package JavaUtil;

import java.util.Stack;

/**
 * @author ThuHien. Demo method of java.util.Stack
 */
public class StackDemo {

	/* This method pushes an item onto the top of stack and show item */
	static void showPush(Stack<String> stack, String str) {
		stack.push(str);
		System.out.println("push(" + str + ")");
		System.out.println("Stack: " + stack);
	}

	/* This method remove an item of stack and show item */
	static void showPop(Stack<String> stack) {
		System.out.println("pop -> " + stack.pop());
		System.out.println("Stack: " + stack);
	}

	public static void main(String[] args) {

		// Creating stack
		Stack<String> stack = new Stack<String>();

		// Checking stack
		System.out.println("Is stack empty: " + stack.empty());

		System.out.println("Stack: " + stack);

		// Push stack
		showPush(stack, "A");
		showPush(stack, "B");
		showPush(stack, "C");
		showPush(stack, "D");

		// Search stack
		System.out.println("-------------------------");
		System.out.println("Index of \"C\" in Stack : " + stack.search("C"));
		System.out.println("Index of \"H\" in Stack : " + stack.search("H"));

		// Checking the top object
		System.out.println("Top object is: " + stack.peek());
		System.out.println("-------------------------");
		
		// Pop stack
		while (!stack.isEmpty()) {
			showPop(stack);
		}
	}
}
