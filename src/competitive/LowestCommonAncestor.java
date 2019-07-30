/**
 * 
 */
package competitive;

/**
 * @author sunnyb
 *
 */
public class LowestCommonAncestor {

	public Node find(Node node, int x, int y) {

		if (null == node) {
			return null;
		}

		if (x == node.data || y == node.data) {
			return node;
		}

		Node leftLca = find(node.left, x, y);
		Node rightLca = find(node.right, x, y);

		if (null != leftLca && null != rightLca) {
			return node;
		}

		return (null != leftLca) ? leftLca : rightLca;
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

		System.out.println(lca.find(root, 4, 7).data);
		System.out.println(lca.find(root, 4, 6).data);
		System.out.println(lca.find(root, 7, 6).data);
		System.out.println(lca.find(root, 5, 3).data);
		System.out.println(lca.find(root, 2, 3).data);
	}

}

class Node {
	int data;
	Node right, left;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}
