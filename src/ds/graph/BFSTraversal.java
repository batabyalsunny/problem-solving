/**
 * 
 */
package ds.graph;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @author sunnyb
 *
 */
public class BFSTraversal {

	private Graph graph;

	public void traverse(int start) {

		Queue<Integer> q = new LinkedList<>();
		Map<Integer, Boolean> visited = new HashMap<>();

		q.add(start);
		visited.put(start, true);

		while (!q.isEmpty()) {

			// Remove the first element.
			int item = q.remove();
			System.out.println(item);

			for (Iterator iterator = graph.adjList.get(item).iterator(); iterator.hasNext();) {

				int vertex = (int) iterator.next();

				// If not visited.
				if (!visited.containsKey(vertex)) {
					q.add(vertex);
					visited.put(vertex, true);
				}
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BFSTraversal bfs = new BFSTraversal();

		bfs.graph = new Graph(4);

		int[] vertices = { 0, 1, 2, 3 };
		bfs.graph.setVertices(vertices);

		bfs.graph.addEdge(0, 1);
		bfs.graph.addEdge(0, 2);
		bfs.graph.addEdge(1, 2);
		bfs.graph.addEdge(2, 0);
		bfs.graph.addEdge(2, 3);
		bfs.graph.addEdge(3, 3);

		bfs.traverse(2);
	}

}
