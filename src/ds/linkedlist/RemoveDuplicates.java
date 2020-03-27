/**
 * 
 */
package ds.linkedlist;

/**
 * @author sunnyb
 *
 */
public class RemoveDuplicates {

	Node head = null;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void push(int item) {

		Node n = new Node(item);

		if (head == null) {
			head = n;
			return;
		}

		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = n;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RemoveDuplicates ll = new RemoveDuplicates();

		ll.push(10);
		ll.push(20);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(40);
		ll.push(50);

		Node temp = ll.head;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

		System.out.println("=================");

		ll.printLL();

		while (temp.next != null) {

			Node p = temp;

			while (temp.data == temp.next.data) {
				temp = temp.next;
			}

			p.next = temp.next;
			temp = temp.next;
		}

		ll.printLL();
	}

	public void printLL() {

		Node temp = head;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
