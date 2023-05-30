import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create vertices
        Vertex<String> v1 = new Vertex<>("A");
        Vertex<String> v2 = new Vertex<>("B");
        Vertex<String> v3 = new Vertex<>("C");
        Vertex<String> v4 = new Vertex<>("D");
        Vertex<String> v5 = new Vertex<>("E");

        // Create a weighted graph
        WeightedGraph<String> graph = new WeightedGraph<>();
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);

        // Add edges to the graph
        graph.addEdge(v1, v2, 2.0);
        graph.addEdge(v1, v3, 4.0);
        graph.addEdge(v2, v3, 1.5);
        graph.addEdge(v2, v4, 3.0);
        graph.addEdge(v3, v5, 2.5);
        graph.addEdge(v4, v5, 1.0);

        // Perform a search (Breadth-first search or Dijkstra's algorithm)
        Search<String> searchAlgorithm = new BreadthFirstSearch<>();
        List<Vertex<String>> path = searchAlgorithm.findPath(v1, v5);

        // Print the path
        if (path != null) {
            for (Vertex<String> vertex : path) {
                System.out.println(vertex.getData());
            }
        } else {
            System.out.println("Path not found.");
        }
    }
}

