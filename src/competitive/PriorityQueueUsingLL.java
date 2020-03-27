/**
 * 
 */
package competitive;

/**
 * @author sunnyb
 *
 */
public class PriorityQueueUsingLL {

	PQNode head;

	public void enqueue(int data, int priority) {

		PQNode n = new PQNode(data, priority);

		if (head.priority < n.priority) {
			n.next = head;
			head = n;
			return;
		}

		PQNode temp = head;

		while (temp.next != null || temp.next.priority > n.priority) {
			temp = temp.next;
		}

		n.next = temp.next;
		temp.next = n;
	}

	public int dequeue() {

		PQNode node = head;
		head = head.next;
		return node.data;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	}

}

class PQNode {

	int data;
	int priority;
	PQNode next;

	public PQNode(int data, int priority) {
		this.data = data;
		this.priority = priority;
		next = null;
	}
}
