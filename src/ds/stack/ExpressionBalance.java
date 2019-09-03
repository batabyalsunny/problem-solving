/**
 * 
 */
package ds.stack;

import java.util.Stack;

/**
 * @author sunnyb
 *
 */
public class ExpressionBalance {

	private Stack<String> expression;
	private int start, end;

	public ExpressionBalance() {
		expression = new Stack<>();
		start = end = 0;
	}

	private void push(String s) {
		if (expression.isEmpty()) {
			expression.push(s);
			if ("{" == s) {
				start++;
			} else {
				end++;
			}
			return;
		}

		String top = expression.peek();

		if (("{" == s && "}" == top) || ("{" == top && "}" == s)) {
			String item = expression.pop();
			if ("{" == item) {
				start--;
			} else {
				end--;
			}
		} else {
			expression.push(s);
			if ("{" == s) {
				start++;
			} else {
				end++;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExpressionBalance ex = new ExpressionBalance();

		ex.push("}");
		ex.push("{");
		ex.push("{");
		ex.push("}");
		ex.push("{");
		ex.push("{");
		ex.push("{");

		System.out.println(ex.start / 2 + ex.end / 2);
	}

}
