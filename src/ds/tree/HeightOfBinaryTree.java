package ds.tree;

public class HeightOfBinaryTree {

	private Node root;

	public static void main(String[] args) {

		HeightOfBinaryTree tree = new HeightOfBinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println(diameter(tree.root, 0));
	}

	public static int height(Node root, int height) {

		if (root == null) {
			return height;
		}
		return Math.max(height(root.left, height + 1), height(root.right, height + 1));
	}

	public static int diameter(Node root, int height) {

		if (root == null) {
			return 0;
		}

		int lh = height(root.left, height);
		int rh = height(root.right, height);

		int ld = diameter(root.left, height);
		int rd = diameter(root.right, height);

		return Math.max(lh + rh + 1, Math.max(ld, rd));
	}
}