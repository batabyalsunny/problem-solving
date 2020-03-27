package ds.linkedlist;

public class DetectLoopInLL {

	Node head;

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

		n.next = head;

		head = n;
	}

	public static void main(String[] args) {

		DetectLoopInLL llist = new DetectLoopInLL();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);
		llist.push(30);
		llist.push(45);
		llist.push(35);

		/* Create loop for testing */
		llist.head.next.next.next.next.next = llist.head.next.next;

		Node p = llist.head, q = llist.head;

		while (null != p && null != q && null != p.next) {
			p = p.next;
			q = q.next.next;

			if (p == q) {
				System.out.println("Loop detected. at " + p.data);
				break;
			}
		}

		if (p == q) {

			p = llist.head;

			while (p.next != q.next) {
				p = p.next;
				q = q.next;
			}

			q.next = null;
		}

		Node temp = llist.head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
