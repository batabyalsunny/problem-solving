/**
 * 
 */
package ds.tree;

import competitive.Node;

/**
 * @author sunnyb
 *
 */
public class LowestCommonAncestorInBinarySearchTree {

	public Node findLca(Node root, int x, int y) {

		Node left = null;
		Node right = null;

		if (root == null) {
			return root;
		}

		if (root.data == x || root.data == y) {
			return root;
		}

		// If x and y is present in different sub trees then root is the LCA.
		if (((root.data > x) && (root.data < y)) || ((root.data > y) && (root.data < x))) {
			return root;
		}

		// If both x and y present in the right subtree then
		// continue searching in right subtree.
		if (root.data < x && root.data < y) {
			right = findLca(root.right, x, y);
		}

		if (root.data > x && root.data > y) {
			left = findLca(root.left, x, y);
		}

		return (right == null) ? left : right;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Node root = new Node(3);
		root.left = new Node(2);
		root.right = new Node(4);
		root.left.left = new Node(1);
		root.right.right = new Node(6);
		root.right.right.left = new Node(5);
		root.right.right.right = new Node(7);

		LowestCommonAncestorInBinarySearchTree lca = new LowestCommonAncestorInBinarySearchTree();

		System.out.println(lca.findLca(root, 5, 7).data);
		System.out.println(lca.findLca(root, 1, 2).data);
		System.out.println(lca.findLca(root, 2, 6).data);
		System.out.println(lca.findLca(root, 4, 5).data);
		System.out.println(lca.findLca(root, 10, 6).data);
	}

}
