package ds.linkedlist;

public class FindMiddle {

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

	public static void main(String[] args) {

		FindMiddle ll = new FindMiddle();

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

		Node p = ll.start;
		Node q = ll.start;

		while (null != q.next) {
			p = p.next;
			q = q.next.next;
		}

		System.out.println(p.data);
	}

}
