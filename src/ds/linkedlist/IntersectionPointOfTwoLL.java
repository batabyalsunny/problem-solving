/**
 * 
 */
package ds.linkedlist;

/**
 * @author sunnyb
 *
 */
public class IntersectionPointOfTwoLL {

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

		IntersectionPointOfTwoLL l1 = new IntersectionPointOfTwoLL();
		int c1 = 0, c2 = 0;

		l1.push(10);
		l1.push(12);
		l1.push(30);
		l1.push(20);
		l1.push(30);
		l1.push(40);
		l1.push(10);
		l1.push(15);
		l1.push(35);
		l1.push(21);
		l1.push(65);
		l1.push(75);
		l1.push(45);
		l1.push(23);
		l1.push(42);

		Node temp = l1.start;
		while (null != temp) {
			temp = temp.next;
			c1++;
		}

		IntersectionPointOfTwoLL l2 = new IntersectionPointOfTwoLL();

		l2.push(11);
		l2.push(17);
		l2.push(19);
		l2.push(37);
		l2.push(64);
		l2.push(21);
		l2.push(65);
		l2.push(75);
		l2.push(45);
		l2.push(23);
		l2.push(42);

		temp = l2.start;
		while (null != temp) {
			temp = temp.next;
			c2++;
		}

		Node temp1;
		if (c1 > c2) {
			temp = l1.start;
			temp1 = l2.start;
		} else {
			temp = l2.start;
			temp1 = l1.start;
		}

		int diff = Math.abs(c1 - c2);

		while (0 != diff) {
			temp = temp.next;
			diff--;
		}

		while (null != temp) {
			if (temp.data == temp1.data) {
				break;
			}

			temp = temp.next;
			temp1 = temp1.next;
		}

		System.out.println(temp.data);
	}
}
