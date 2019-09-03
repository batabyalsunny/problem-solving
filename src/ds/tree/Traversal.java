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
public class Traversal {

	Node root;

	List<Integer> order = new ArrayList<>();

	public void inorder(Node root) {

		if (root == null) {
			return;
		}

		inorder(root.left);
		System.out.println(root.data);
		order.add(root.data);
		inorder(root.right);
	}

	public void preorder(Node root) {

		if (root == null) {
			return;
		}

		System.out.println(root.data);
		order.add(root.data);
		preorder(root.left);
		preorder(root.right);
	}

	public void postorder(Node root) {

		if (root == null) {
			return;
		}

		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);
		order.add(root.data);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Traversal tree = new Traversal();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		System.out.println("============Inorder============");
		tree.inorder(tree.root);
		System.out.println("============Preorder============");
		tree.preorder(tree.root);
		System.out.println("============Postorder============");
		tree.postorder(tree.root);
	}

}
