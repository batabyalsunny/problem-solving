/**
 * 
 */
package tree;

import java.util.Stack;

/**
 * @author sunnyb
 *
 */
public class InorderWithoutRecursion {

	Node root;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		InorderWithoutRecursion tree = new InorderWithoutRecursion();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		Stack<Node> stack = new Stack<>();

		Node current = tree.root;

		while (current != null || !stack.isEmpty()) {

			while (current != null) {

				// Push current into stack.
				stack.push(current);

				current = current.left;
			}

			Node temp = stack.pop();
			System.out.println(temp.data);
			current = temp.right;
		}
	}

}
