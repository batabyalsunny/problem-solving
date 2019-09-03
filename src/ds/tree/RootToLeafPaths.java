/**
 * 
 */
package ds.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunnyb
 *
 */
public class RootToLeafPaths {

	Node root;
	List<Node> path = new ArrayList<>();

	public boolean isLeaf(Node node) {

		if (node == null) {
			return false;
		}

		if (node.left == null && node.right == null) {
			return true;
		}

		return false;
	}

	public Node printPaths(Node root) {

		Node temp, prev;

		if (root == null) {
			return root;
		}

		if (isLeaf(root)) {

			path.forEach((node) -> {
				System.out.println(node.data);
			});
			System.out.println(root.data);
			System.out.println("==========================");
			return root;
		}

		path.add(root);

		temp = printPaths(root.left);
		path.remove(temp);
		prev = root;
		temp = printPaths(root.right);
		path.remove(temp);

		return prev;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RootToLeafPaths tree = new RootToLeafPaths();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
//		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		tree.printPaths(tree.root);
	}

}
