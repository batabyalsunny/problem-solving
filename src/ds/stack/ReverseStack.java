/**
 * 
 */
package ds.stack;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author sunnyb
 *
 */
public class ReverseStack {

	private static Stack<Integer> stack;

	public void insert(int item) {
		if (stack.isEmpty()) {
			stack.push(item);
		} else {
			int a = stack.pop();
			insert(item);

			stack.push(a);
		}
	}

	public void reverse() {
		if (stack.size() > 0) {
			int i = stack.pop();
			reverse();
			insert(i);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		stack = new Stack<>();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		ReverseStack rs = new ReverseStack();
		rs.reverse();

		for (Iterator<Integer> iterator = stack.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}

}
