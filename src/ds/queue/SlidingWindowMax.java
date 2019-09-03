/**
 * 
 */
package ds.queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author sunnyb
 *
 */
public class SlidingWindowMax {

	private Deque<Integer> deque = new LinkedList<>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SlidingWindowMax sw = new SlidingWindowMax();

		int[] arr = { 3, 5, 2, 4, 1, 6 };
		int k = 3, i, j;

		// For the window size first insert or update the queue accordingly.
		for (i = 0; i < k; i++) {

			// While the last indexed element in the queue is greater than the
			// current element to be inserted, remove that from the queue.
			while (!sw.deque.isEmpty() && arr[sw.deque.peekLast()] < arr[i]) {
				sw.deque.removeLast();
			}

			// Insert the new element index at the end of the queue.
			sw.deque.addLast(i);
		}

		// As all the elements has been inserted for the window size,
		// Now just slide the window one by one.
		for (; i < arr.length; i++) {

			// Print the max element of the previous window which is indexed
			// at the first of the queue.
			System.out.println(arr[sw.deque.peekFirst()]);

			// First check for the validity of the elements in the queue.
			// If the element is too old or bigger than queue size remove that
			// from front of the queue.
			while (!sw.deque.isEmpty() && sw.deque.peekFirst() < i - k + 1) {
				sw.deque.removeFirst();
			}

			// While the last indexed element in the queue is greater than the
			// current element to be inserted, remove that from the queue.
			while (!sw.deque.isEmpty() && arr[sw.deque.peekLast()] < arr[i]) {
				sw.deque.removeLast();
			}

			// Insert the new element index at the end of the queue.
			sw.deque.addLast(i);
		}

		// Print the max of the last window.
		System.out.println(arr[sw.deque.peekFirst()]);
	}

}
