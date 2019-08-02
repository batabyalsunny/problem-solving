/**
 * 
 */
package queue;

/**
 * @author sunnyb
 *
 */
public class Node<D> {

	D data;
	Node<D> next;

	/**
	 * @param data
	 * @param next
	 */
	public Node(D data) {
		this.data = data;
	}

}
