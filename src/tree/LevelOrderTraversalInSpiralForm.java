/**
 * 
 */
package tree;

import java.util.Stack;

/**
 * @author sunnyb
 *
 */
public class LevelOrderTraversalInSpiralForm {

	private Node root;

	public void traverse(Node root) {

		if (root == null) {
			return;
		}
		Stack<Node> left = new Stack<>();
		Stack<Node> right = new Stack<>();

		left.push(root);

		while (!left.isEmpty() || !right.isEmpty()) {

			while (!left.isEmpty()) {

				Node temp = left.pop();
				System.out.print(temp.data + " ");

				if (temp.right != null) {
					right.push(temp.right);
				}

				if (temp.left != null) {
					right.push(temp.left);
				}
			}

			while (!right.isEmpty()) {

				Node temp = right.pop();
				System.out.print(temp.data + " ");

				if (temp.left != null) {
					left.push(temp.left);
				}

				if (temp.right != null) {
					left.push(temp.right);
				}
			}
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LevelOrderTraversalInSpiralForm tree = new LevelOrderTraversalInSpiralForm();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		tree.traverse(tree.root);

	}

}
