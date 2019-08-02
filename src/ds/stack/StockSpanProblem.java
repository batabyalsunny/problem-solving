/**
 * 
 */
package ds.stack;

import java.util.Stack;

/**
 * @author sunnyb
 *
 */
public class StockSpanProblem {

	public static void calculateSpan(int[] cost) {

		Stack<Integer> stack = new Stack<>();
		int[] span = new int[cost.length];

		stack.push(0);
		span[0] = 1;

		for (int i = 1; i < cost.length; i++) {

			while (!stack.isEmpty() && cost[i] >= cost[stack.peek()]) {
				stack.pop();
			}

			span[i] = (stack.isEmpty()) ? i + 1 : i - stack.peek();

			stack.push(i);
		}

		for (int item : span) {
			System.out.println(item);
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int cost[] = { 10, 4, 5, 90, 120, 80 };
		calculateSpan(cost);
	}

}
