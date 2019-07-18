/**
 * 
 */
package ds.stack;

import java.util.Stack;

/**
 * @author sunnyb
 *
 */
public class SpecialStack {

	private Stack<Integer> stack;
	private int min;

	/**
	 * @param stack
	 */
	public SpecialStack() {
		stack = new Stack<>();
	}

	private void push(int n) {
		if (stack.isEmpty()) {
			stack.push(n);
			min = n;
		} else {
			if (n < min) {
				min = n;
				stack.push(2 * n - min);
			} else {
				stack.push(n);
			}
		}
	}

	private int pop() {
		if (stack.isEmpty()) {
			System.out.println("Underflow");
			return 0;
		} else {
			int item = stack.pop();

			if (item < min) {
				int x = min;
				min = (2 * item) - min;
				return x;
			}
			return item;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SpecialStack s = new SpecialStack();

		s.push(10);
		s.push(40);
		s.push(2);
		s.push(30);
		s.push(5);

		System.out.println(s.pop());
		System.out.println(s.min);

	}

}
