/**
 * 
 */
package ds.queue;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author sunnyb
 *
 */
public class QueueUsing2Stacks<E> {

	Stack<E> stack = new Stack<>();
	Stack<E> tempStack = new Stack<>();

	public void enqueue(E item) {

		while (!stack.isEmpty()) {
			// Move everything to secondary stack.
			tempStack.push(stack.pop());
		}

		// Insert item in stack.
		stack.push(item);

		// Bring everything back from temp stack to main stack.
		while (!tempStack.isEmpty()) {
			stack.push(tempStack.pop());
		}

	}

	public E dequeue() {

		if (stack.isEmpty()) {
			System.out.println("Empty");
			return null;
		}

		return stack.pop();
	}

	public void printQueue() {

		Iterator<E> itr = stack.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public E dequeue2() {

		if (stack.size() == 1) {
			return stack.pop();
		}

		E data = stack.pop();
		E ret = dequeue2();
		stack.push(data);
		return ret;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		QueueUsing2Stacks<Integer> queue = new QueueUsing2Stacks<>();

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);

		queue.printQueue();

		System.out.println("====================");

		queue.dequeue();
		queue.dequeue();
		queue.dequeue();

		queue.printQueue();
	}

}
