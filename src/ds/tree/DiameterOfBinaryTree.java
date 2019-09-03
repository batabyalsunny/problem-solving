/**
 * 
 */
package ds.tree;

/**
 * @author sunnyb
 *
 */
public class DiameterOfBinaryTree {

	private Node root;

	public int diameter(Node root, Height height) {

		Height lh = new Height(), rh = new Height();

		if (root == null) {
			height.h = 0;
			return 0;
		}

		int ld = diameter(root.left, lh);
		int rd = diameter(root.right, rh);

		height.h = Math.max(lh.h, rh.h) + 1;

		return Math.max(lh.h + rh.h + 1, Math.max(ld, rd));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DiameterOfBinaryTree tree = new DiameterOfBinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println(tree.diameter(tree.root, new Height()));

	}

}

class Height {
	int h;
}