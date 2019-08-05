/**
 * 
 */
package tree;

/**
 * @author sunnyb
 *
 */
public class BinaryTreeMirror {

	Node root;

	public void mirror(Node root) {

		Node temp;

		if (root == null) {
			return;
		}

		mirror(root.left);
		mirror(root.right);

		temp = root.right;
		root.right = root.left;
		root.left = temp;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BinaryTreeMirror tree = new BinaryTreeMirror();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		tree.mirror(tree.root);

		Traversal traverse = new Traversal();
		traverse.inorder(tree.root);
	}

}
