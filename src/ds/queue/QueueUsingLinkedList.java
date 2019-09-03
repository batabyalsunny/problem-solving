/**
 * 
 */
package ds.queue;

/**
 * @author sunnyb
 *
 */
public class QueueUsingLinkedList<E> {

	Node<E> front, rear;

	public void enqueue(E item) {

		if (null == rear) {
			rear = new Node<>(item);
			rear.next = null;
			front = rear;
			return;
		}

		rear.next = new Node<>(item);
		rear = rear.next;
		rear.next = null;
	}

	public E dequeue() {

		E item;

		if (front == null) {
			System.out.println("Empty");
			return null;
		}

		item = front.data;

		if (front == rear) {
			front = rear = null;
		} else {
			front = front.next;
		}

		return item;
	}

	public void printQueue() {

		if (front == null) {
			System.out.println("Empty");
			return;
		}

		Node<E> temp = front;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public boolean isEmpty() {
		return (null == front);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);

		queue.printQueue();

		queue.dequeue();
		queue.dequeue();
		queue.dequeue();

		queue.printQueue();
	}

}
