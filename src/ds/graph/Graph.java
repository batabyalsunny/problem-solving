/**
 * 
 */
package ds.graph;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author sunnyb
 *
 */
public class Graph {

	// Number of vertices.
	int v;

	// Adjacency list.
	Map<Integer, LinkedList<Integer>> adjList;

	/**
	 * @param v
	 */
	public Graph(int v) {
		this.v = v;

		adjList = new HashMap<>();
	}

	/**
	 * Set the vertex values.
	 * 
	 * @param vertices
	 */
	public void setVertices(int[] vertices) {

		if (vertices.length > v) {
			throw new IllegalArgumentException("Number of vertices should match the array length");
		}

		for (int i : vertices) {
			adjList.put(i, new LinkedList<>());
		}
	}

	/**
	 * Adds an edge from source to destination to the graph.
	 * 
	 * @param src
	 * @param des
	 */
	public void addEdge(int src, int des) {

		// Get the linked list of source and add the destination.
		adjList.get(src).add(des);

		// For undirected graph add reverse mapping too.
		adjList.get(des).add(src);
	}

	/**
	 * Prints the Graph in adjacency list format.
	 */
	public void print() {

		for (Map.Entry<Integer, LinkedList<Integer>> entry : adjList.entrySet()) {

			System.out.print(entry.getKey() + "->");

			Iterator<Integer> itr = entry.getValue().iterator();

			while (itr.hasNext()) {

				System.out.print(itr.next() + "->");
			}

			System.out.println();
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Graph g = new Graph(5);

		int[] vertices = { 0, 1, 2, 3, 4 };
		g.setVertices(vertices);

		g.addEdge(0, 1);
		g.addEdge(0, 4);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);

		g.print();
	}
}
