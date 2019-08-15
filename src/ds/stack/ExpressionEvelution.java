/**
 * 
 */
package ds.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * @author sunnyb
 *
 */
public class ExpressionEvelution {

	/**
	 * @param args
	 * @throws ScriptException
	 */
	public static void main(String[] args) throws ScriptException {

		Stack<Integer> operand = new Stack<>();
		Stack<String> operator = new Stack<>();

		String expr = "6 + 3 - 4 / 2 * 6 / 2 - 10";

		Map<String, Integer> priority = new HashMap<>();
		priority.put("-", 0);
		priority.put("+", 1);
		priority.put("*", 2);
		priority.put("/", 3);

		String[] arr = expr.split("\\s");

		for (String string : arr) {

			// If operator.
			if (priority.containsKey(string)) {

				// If the current operator has lower priority than the
				// previous operator.
				while (!operator.isEmpty() && priority.get(string) <= priority.get(operator.peek())
						&& !operand.isEmpty()) {

					// Pop last two elements from operand stack.
					int b = operand.pop();
					int a = operand.pop();

					// Pop the last operator.
					String op = operator.pop();

					ScriptEngineManager mgr = new ScriptEngineManager();
					ScriptEngine engine = mgr.getEngineByName("JavaScript");
					String e = a + op + b;

					int result = (int) engine.eval(e);

					// Push result to the operand stack.
					operand.push(result);
				}

				operator.push(string);
			} else {
				operand.push(Integer.parseInt(string));
			}
		}

		// Iterate through operator and operand stack and calculate the value.
		while (!operator.isEmpty()) {

			// Pop last two elements from operand stack.
			int b = operand.pop();
			int a = operand.pop();

			// Pop the last operator.
			String op = operator.pop();

			ScriptEngineManager mgr = new ScriptEngineManager();
			ScriptEngine engine = mgr.getEngineByName("JavaScript");
			String e = a + op + b;

			int result = (int) engine.eval(e);

			operand.push(result);
		}

		System.out.println(operand.pop());
	}

}
