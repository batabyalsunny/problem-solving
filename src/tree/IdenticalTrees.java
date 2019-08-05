/**
 * 
 */
package tree;

/**
 * @author sunnyb
 *
 */
public class IdenticalTrees {

	Node tree1;
	Node tree2;

	public boolean isIdentical(Node tree1, Node tree2) {

		if (tree1 == null && tree2 == null) {
			return true;
		} else if (tree1 == null || tree2 == null) {
			return false;
		}

		if (isIdentical(tree1.left, tree2.left) && isIdentical(tree1.right, tree2.right)) {
			return (tree1.data == tree2.data);
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		IdenticalTrees tree = new IdenticalTrees();

		tree.tree1 = new Node(26);
		tree.tree1.left = new Node(10);
		tree.tree1.right = new Node(3);
		tree.tree1.left.left = new Node(4);
		tree.tree1.left.right = new Node(6);
		tree.tree1.right.right = new Node(3);

		tree.tree2 = new Node(26);
		tree.tree2.left = new Node(10);
		tree.tree2.right = new Node(3);
		tree.tree2.left.left = new Node(4);
		tree.tree2.left.right = new Node(6);
		tree.tree2.right.right = new Node(3);

		System.out.println(tree.isIdentical(tree.tree1, tree.tree2));
	}

}
