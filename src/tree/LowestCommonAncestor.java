/**
 * 
 */
package tree;

import competitive.Node;

/**
 * @author sunnyb
 *
 */
public class LowestCommonAncestor {

	public Node findLca(Node root, int x, int y) {

		if (root == null) {
			return root;
		}

		if (root.data == x || root.data == y) {
			return root;
		}

		Node left = findLca(root.left, x, y);
		Node right = findLca(root.right, x, y);

		if (left != null && right != null) {
			return root;
		}

		return (right == null) ? left : right;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		LowestCommonAncestor lca = new LowestCommonAncestor();

		System.out.println(lca.findLca(root, 4, 7).data);
		System.out.println(lca.findLca(root, 4, 6).data);
		System.out.println(lca.findLca(root, 7, 6).data);
		System.out.println(lca.findLca(root, 5, 3).data);
		System.out.println(lca.findLca(root, 2, 3).data);
	}

}
