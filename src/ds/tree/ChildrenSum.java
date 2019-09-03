/**
 * 
 */
package ds.tree;

/**
 * @author sunnyb
 *
 */
public class ChildrenSum {

	private Node root;

	public void convert(Node root) {

		// If empty tree or has no child.
		if (root == null || (root.left == null && root.right == null)) {
			return;
		}

		if (root.left != null) {
			convert(root.left);
		}

		if (root.right != null) {
			convert(root.right);
		}

		int childSum;

		if (root.left == null) {
			childSum = root.right.data;
		} else if (root.right == null) {
			childSum = root.left.data;
		} else {
			childSum = root.left.data + root.right.data;
		}

		int diff = Math.abs(root.data - childSum);

		// If child sum and root data is same then nothing to do.
		if (diff == 0) {
			return;
		}

		// If root is greater than child sum then add the diff to any child.
		if (root.data > childSum) {

			if (root.left != null) {
				root.left.data += diff;
			} else {
				root.right.data += diff;
			}
		} else { // else add the diff to root.
			root.data += diff;
		}
	}

	public static void main(String[] args) {

		ChildrenSum tree = new ChildrenSum();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
//		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		tree.convert(tree.root);

		Traversal tr = new Traversal();
		tr.preorder(tree.root);

	}

}
