public interface Search<V> {
    // Defines common methods for search algorithms
    void search(WeightedGraph<V> graph, Vertex<V> source);
}
