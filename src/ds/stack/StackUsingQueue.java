/**
 * 
 */
package ds.stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sunnyb
 *
 */
public class StackUsingQueue<E> {

	private Queue<E> queue = new LinkedList<>();

	public void push(E item) {

		queue.add(item);

		int queueSize = queue.size();

		while (queueSize > 1) {
			// Bring all the other elements from front to rear.
			queue.add(queue.remove());
			queueSize--;
		}
	}

	public E pop() {

		if (queue.isEmpty()) {
			System.out.println("Empty");
			return null;
		}

		return queue.remove();
	}

	public void printStack() {

		Iterator<E> itr = queue.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StackUsingQueue<Integer> stack = new StackUsingQueue<>();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);

		stack.printStack();

		System.out.println("===================");

		stack.pop();
		stack.pop();
		stack.pop();

		stack.printStack();
	}

}
