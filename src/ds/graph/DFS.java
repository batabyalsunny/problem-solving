/**
 * 
 */
package ds.graph;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/**
 * @author sunnyb
 *
 */
public class DFS {

	private Graph graph;

	private Stack<Integer> stack = new Stack<>();
	private Map<Integer, Boolean> visited = new HashMap<>();

	public void traverse(int start) {

		// Mark as visited.
		visited.put(start, true);

		// Iterate through the adjacent vertices.
		for (Iterator<Integer> iterator = graph.adjList.get(start).iterator(); iterator.hasNext();) {

			int item = iterator.next();

			if (!visited.containsKey(item) && item != start) {
				traverse(item);
			}
		}

		stack.push(start);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DFS dfs = new DFS();

		dfs.graph = new Graph(4);

		int[] vertices = { 0, 1, 2, 3 };
		dfs.graph.setVertices(vertices);

		dfs.graph.addEdge(0, 1);
		dfs.graph.addEdge(0, 2);
		dfs.graph.addEdge(1, 2);
		dfs.graph.addEdge(2, 0);
		dfs.graph.addEdge(2, 3);
		dfs.graph.addEdge(3, 3);

		dfs.traverse(2);

		while (!dfs.stack.isEmpty()) {
			System.out.println(dfs.stack.pop());
		}
	}
}
