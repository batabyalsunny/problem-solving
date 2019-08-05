/**
 * 
 */
package tree;

/**
 * @author sunnyb
 *
 */
public class SumTreeOrNot {

	Node root;

	public boolean isLeaf(Node root) {

		if (root == null) {
			return false;
		}

		if (root.left == null && root.right == null) {
			return true;
		}

		return false;
	}

	public boolean isSumTree(Node root) {

		if (root == null || isLeaf(root)) {
			return true;
		}

		int leftSum = 0;
		int rightSum = 0;

		if (isSumTree(root.left) && isSumTree(root.right)) {

			if (isLeaf(root.left)) {
				leftSum = root.left.data;
			} else if (root.left == null) {
				leftSum = 0;
			} else {
				leftSum = 2 * root.left.data;
			}

			if (isLeaf(root.right)) {
				rightSum = root.right.data;
			} else if (root.right == null) {
				rightSum = 0;
			} else {
				rightSum = 2 * root.right.data;
			}

			return ((leftSum + rightSum) == root.data);
		}

		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SumTreeOrNot tree = new SumTreeOrNot();

		tree.root = new Node(26);
		tree.root.left = new Node(10);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(6);
		tree.root.right.right = new Node(3);

		System.out.println(tree.isSumTree(tree.root));
	}

}
