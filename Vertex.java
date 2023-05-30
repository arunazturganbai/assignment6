import java.util.*;

public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices;

    public Vertex(V data) {
        this.data = data;
        this.adjacentVertices = new HashMap<>();
    }

    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }

    public V getData() {
        return data;
    }

    public Map<Vertex<V>, Double> getAdjacentVertices() {
        return adjacentVertices;
    }
}

class Edge<V> {
    private Vertex<V> source;
    private Vertex<V> dest;
    private Double weight;

    public Edge(Vertex<V> source, Vertex<V> dest, Double weight) {
        this.source = source;
        this.dest = dest;
        this.weight = weight;
    }

    public Vertex<V> getSource() {
        return source;
    }

    public Vertex<V> getDest() {
        return dest;
    }

    public Double getWeight() {
        return weight;
    }
}

interface Search<V> {
    List<Vertex<V>> findPath(Vertex<V> source, Vertex<V> destination);
}

class BreadthFirstSearch<V> implements Search<V> {
    @Override
    public List<Vertex<V>> findPath(Vertex<V> source, Vertex<V> destination) {
        // Implementation of breadth-first search algorithm
        return null;
    }
}

class DijkstraSearch<V> implements Search<V> {
    @Override
    public List<Vertex<V>> findPath(Vertex<V> source, Vertex<V> destination) {
        // Implementation of Dijkstra's algorithm
        return null;
    }
}


