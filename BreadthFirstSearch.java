import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BreadthFirstSearch<V> implements Search<V> {
    @Override
    public void search(WeightedGraph<V> graph, Vertex<V> source) {
        // Create a queue to store vertices to visit
        Queue<Vertex<V>> queue = new LinkedList<>();

        // Create a set to track visited vertices
        Set<Vertex<V>> visited = new HashSet<>();

        // Add the source vertex to the queue and mark it as visited
        queue.offer(source);
        visited.add(source);

        // Perform breadth-first search
        while (!queue.isEmpty()) {
            // Get the next vertex from the queue
            Vertex<V> current = queue.poll();

            // Print the visited vertex
            System.out.println("Visited: " + current.getData());

            // Iterate through the adjacent edges of the current vertex
            for (Edge<V> edge : graph.getEdges(current)) {
                // Get the destination vertex of the edge
                Vertex<V> neighbor = edge.getDest();

                // Check if the neighbor has not been visited
                if (!visited.contains(neighbor)) {
                    // Add the neighbor to the queue for further exploration
                    queue.offer(neighbor);
                    // Mark the neighbor as visited
                    visited.add(neighbor);
                }
            }
        }
    }
}

