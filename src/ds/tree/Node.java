/**
 * 
 */
package ds.tree;

/**
 * @author sunnyb
 *
 */
public class Node {

	int data;
	Node right;
	Node left;

	/**
	 * @param data
	 */
	public Node(int data) {
		this.data = data;
		right = left = null;
	}
}
