/**
 * 
 */
package ds.linkedlist;

/**
 * @author sunnyb
 *
 */
public class Reverse {

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

		Reverse ll = new Reverse();

		ll.push(10);
		ll.push(12);
		ll.push(30);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.push(10);
		ll.push(15);
		ll.push(35);
		ll.push(21);
		ll.push(65);
		ll.push(75);
		ll.push(45);
		ll.push(23);
		ll.push(42);

		Node prev, next, temp;

		prev = null;
		temp = null;
		next = ll.start;

		while (null != next) {
			prev = temp;
			temp = next;
			next = temp.next;
			temp.next = prev;
		}

		ll.start = temp;

		while (null != temp) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}
