/**
 * 
 */
package ds.stack;

import java.util.Stack;

/**
 * @author sunnyb
 *
 */
public class NextGreaterElement {

	private static Stack<Integer> stack;

	public void push(int item) {

		if (stack.isEmpty()) {
			stack.push(item);
			return;
		}

		if (stack.peek() < item) {
			System.out.println(stack.pop() + " -----> " + item);
			push(item);
		} else {
			stack.push(item);
		}
		return;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NextGreaterElement nge = new NextGreaterElement();

		stack = new Stack<>();

		nge.push(11);
		nge.push(13);
		nge.push(21);
		nge.push(3);

		while (!stack.isEmpty()) {
			System.out.println(stack.pop() + " -----> " + -1);
		}
	}

}
