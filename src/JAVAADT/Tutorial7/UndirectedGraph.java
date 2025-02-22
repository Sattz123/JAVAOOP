package JAVAADT.Tutorial7;

import java.util.*;

public class UndirectedGraph {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    // Constructor
    public UndirectedGraph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Add edge method
    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
        adjacencyList[destination].add(source);
    }

    // Print adjacency method
    public void printGraph() {
        System.out.println("Adjacency List of the Graph:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int node : adjacencyList[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        UndirectedGraph graph = new UndirectedGraph(V);

        // Input edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        // Print the adjacency list
        graph.printGraph();
    }
}
