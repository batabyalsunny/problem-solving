/**
 * 
 */
package ds.tree;

/**
 * @author sunnyb
 *
 */
public class BoundaryNodes {

	private Node root;

	public void printLeftBoundary(Node root) {

		if (root == null) {
			return;
		}

		if (root.left != null) {
			System.out.println(root.data);
			printLeftBoundary(root.left);
		} else if (root.right != null) {
			System.out.println(root.data);
			printLeftBoundary(root.right);
		}
	}

	public void printRightBoundary(Node root) {

		if (root == null) {
			return;
		}

		if (root.right != null) {
			printRightBoundary(root.right);
			System.out.println(root.data);
		} else if (root.left != null) {
			printRightBoundary(root.left);
			System.out.println(root.data);
		}
	}

	public void printLeaves(Node root) {

		if (root == null) {
			return;
		}

		printLeaves(root.left);

		if (root.left == null && root.right == null) {
			System.out.println(root.data);
		}

		printLeaves(root.right);
	}

	public void printBoundary(Node root) {

		if (root == null) {
			return;
		}

		System.out.println(root.data);

		printLeftBoundary(root.left);

		printLeaves(root.left);
		printLeaves(root.right);

		printRightBoundary(root.right);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BoundaryNodes tree = new BoundaryNodes();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(10);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(6);
		tree.root.right.left.left = new Node(7);
		tree.root.right.right.left = new Node(8);
		tree.root.right.right.right = new Node(9);

//		tree.root = new Node(20);
//		tree.root.left = new Node(8);
//		tree.root.left.left = new Node(4);
//		tree.root.left.right = new Node(12);
//		tree.root.left.right.left = new Node(10);
//		tree.root.left.right.right = new Node(14);
//		tree.root.right = new Node(22);
//		tree.root.right.right = new Node(25);

		tree.printBoundary(tree.root);
	}

}
