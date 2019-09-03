package ds.stack;

import ds.queue.QueueUsingLinkedList;

public class StackUsing2Queues<E> {

	private QueueUsingLinkedList<E> primaryQueue = new QueueUsingLinkedList<>();
	private QueueUsingLinkedList<E> secondaryQueue = new QueueUsingLinkedList<>();
	private QueueUsingLinkedList<E> tempQueue = new QueueUsingLinkedList<>();

	public void swapQueue() {
		tempQueue = primaryQueue;
		primaryQueue = secondaryQueue;
		secondaryQueue = tempQueue;
	}

	public void push(E item) {

		secondaryQueue.enqueue(item);

		while (!primaryQueue.isEmpty()) {
			secondaryQueue.enqueue(primaryQueue.dequeue());
		}

		swapQueue();
	}

	public E pop() {
		return primaryQueue.dequeue();
	}

	public static void main(String[] args) {

		StackUsing2Queues<Integer> stack = new StackUsing2Queues<>();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		stack.primaryQueue.printQueue();

		stack.pop();
		stack.pop();
		stack.pop();

		stack.primaryQueue.printQueue();
	}

}
