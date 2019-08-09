/**
 * 
 */
package tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sunnyb
 *
 */
public class ConstructTree {

	private static int postIndex;
	private static Map<Integer, Integer> inMap;

	public Node fromInAndPost(int[] in, int[] post, int startIndex, int endIndex) {

		if (startIndex > endIndex) {
			return null;
		}

		// Create node with current element.
		Node root = new Node(post[postIndex]);
		postIndex--;

		if (startIndex == endIndex) {
			return root;
		}

		// find current element in inorder array.
		int index = inMap.get(root.data);

		// Call for the left and right sub tree.
		root.right = fromInAndPost(in, post, index + 1, endIndex);
		root.left = fromInAndPost(in, post, startIndex, index - 1);

		return root;
	}

	public Map<Integer, Integer> convertArrayToIndexMap(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}
		return map;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ConstructTree tree = new ConstructTree();

		int[] in = { 4, 2, 5, 1, 6, 3, 7 };
		int[] post = { 4, 5, 2, 6, 7, 3, 1 };

		postIndex = post.length - 1;

		inMap = tree.convertArrayToIndexMap(in);

		Node root = tree.fromInAndPost(in, post, 0, in.length - 1);

		Traversal tr = new Traversal();
		tr.inorder(root);
	}

}
