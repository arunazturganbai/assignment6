import java.util.*;

public class DijkstraSearch<V> implements Search<V> {
    @Override
    public void search(WeightedGraph<V> graph, Vertex<V> source) {
        Map<Vertex<V>, Double> distances = new HashMap<>();
        Map<Vertex<V>, Vertex<V>> previous = new HashMap<>();
        Set<Vertex<V>> visited = new HashSet<>();

        for (Vertex<V> vertex : graph.getVertices()) {
            distances.put(vertex, Double.POSITIVE_INFINITY);
        }

        distances.put(source, 0.0);

        PriorityQueue<Vertex<V>> queue = new PriorityQueue<>(Comparator.comparingDouble(distances::get));
        queue.offer(source);

        while (!queue.isEmpty()) {
            Vertex<V> current = queue.poll();
            visited.add(current);

            for (Edge<V> edge : graph.getEdges(current)) {
                Vertex<V> neighbor = edge.getDest();
                double weight = edge.getWeight();
                double newDistance = distances.get(current) + weight;

                if (newDistance < distances.get(neighbor)) {
                    distances.put(neighbor, newDistance);
                    previous.put(neighbor, current);
                }

                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                }
            }
        }

        // Prints shortest paths
        for (Vertex<V> vertex : graph.getVertices()) {
            System.out.println("Shortest distance from " + source.getData() + " to " + vertex.getData() + ": " + distances.get(vertex));
        }
    }

    @Override
    public void search(WeightedGraph<V> graph, Vertex<V> source) {

    }

    /**
     * @param graph
     * @param source
     */
    @Override
    public void search(WeightedGraph<V> graph, Vertex<V> source) {

    }
}
