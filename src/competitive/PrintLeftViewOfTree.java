/**
 * 
 */
package competitive;

/**
 * @author sunnyb
 *
 */
public class PrintLeftViewOfTree {

	int maxLevel = 0;

	public void plv(Node root, int level) {

		if (null == root) {
			return;
		}

		if (maxLevel < level) {
			System.out.println(root.data);
			maxLevel = level;
		}

		plv(root.left, level + 1);
		plv(root.right, level + 1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Node root = new Node(1);

		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.left.right.right = new Node(5);
		root.left.right.right.right = new Node(6);

		PrintLeftViewOfTree p = new PrintLeftViewOfTree();
		p.plv(root, 1);
	}

}
