/**
 * 
 */
package ds.linkedlist;

/**
 * @author sunnyb
 *
 */
public class NthNodeFromEnd {

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

		NthNodeFromEnd ll = new NthNodeFromEnd();

		int n = 3, count = 0;

		ll.push(10);
		ll.push(12);
		ll.push(30);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(10);
		ll.push(15);
		ll.push(35);
		ll.push(25);
		ll.push(65);
		ll.push(75);
		ll.push(45);
		ll.push(23);
		ll.push(42);

		Node temp = ll.start;
		Node p = ll.start;
		Node q = ll.start;

		while (count < n) {
			q = q.next;
			count++;
		}

		while (null != q) {
			p = p.next;
			q = q.next;
		}

		System.out.println(p.data);
	}

}
