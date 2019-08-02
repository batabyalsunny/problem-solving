/**
 * 
 */
package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sunnyb
 *
 */
public class LRUCache {

	private Queue<Integer> queue = new LinkedList<>();

	private final static int SIZE = 3;

	private static int hit = 0;
	private static int miss = 0;

	public void enque(int item) {

		if (queue.size() >= SIZE) {
			if (queue.contains(item)) {
				// Pick that item and add to rear.
				hit++;
				queue.remove(item);
			} else {
				// Remove from front.
				miss++;
				queue.remove();
			}
		}

		queue.add(item);
	}

	public void printQueue() {
		Iterator<Integer> itr = queue.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Hit: " + hit);
		System.out.println("Page fault: " + (miss + SIZE));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LRUCache lru = new LRUCache();

		int arr[] = { 1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5 };

		for (int i : arr) {
			lru.enque(i);
		}

		lru.printQueue();
	}

}
