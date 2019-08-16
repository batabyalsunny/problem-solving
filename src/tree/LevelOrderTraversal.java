/**
 * 
 */
package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sunnyb
 *
 */
public class LevelOrderTraversal {

	private Node root;

	private Queue<Node> queue = new LinkedList<>();

	public void traverse(Node root) {

		if (root == null) {
			return;
		}

		System.out.println(root.data);
		queue.add(root.left);
		queue.add(root.right);

		while (!queue.isEmpty()) {
			traverse(queue.remove());
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LevelOrderTraversal tree = new LevelOrderTraversal();

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
