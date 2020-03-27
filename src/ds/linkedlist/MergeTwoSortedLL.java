/**
 * 
 */
package ds.linkedlist;

/**
 * @author sunnyb
 *
 */
public class MergeTwoSortedLL {

	Node start;

	class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void push(int data) {

		Node n = new Node(data);

		if (null == start) {
			start = n;
		} else {

			Node temp = start;

			while (null != temp.next) {
				temp = temp.next;
			}

			temp.next = n;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MergeTwoSortedLL ll1 = new MergeTwoSortedLL();
		MergeTwoSortedLL ll2 = new MergeTwoSortedLL();

		ll1.push(5);
		ll1.push(10);
		ll1.push(15);
		ll1.push(40);

		ll2.push(2);
		ll2.push(3);
		ll2.push(20);

		Node head1 = ll1.start;
		Node head2 = ll2.start;

		Node head = merge(head1, head2);

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	public static Node merge(Node head1, Node head2) {

		if (head1 == null || head2 == null) {
			return null;
		}

		if (head1.data < head2.data) {
			head1.next = merge(head1.next, head2);
			return head1;
		} else {
			head2.next = merge(head1, head2.next);
			return head2;
		}
	}

}
