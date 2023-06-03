**Vertex**:
- This class represents a vertex in a graph. It has a generic type `V` to store the data of the vertex.
- It contains a private data field `data` of type `V` to hold the data of the vertex.
- It also has a private map `adjacentVertices` that stores the adjacent vertices along with their weights.
- The `addAdjacentVertex` method allows adding an adjacent vertex with a specified weight to the current vertex.

**WeightedGraph**:
- This class represents a weighted graph.
- It uses a `Map` to store vertices as keys and their corresponding edges as values.
- The `addVertex` method adds a vertex to the graph.
- The `addEdge` method adds a weighted edge between two vertices in the graph.
- The `getEdges` method returns the list of edges for a given vertex.

**Edge**:
- This class represents a weighted edge between two vertices in a graph.
- It has generic types `V` to store the data of the vertices.
- The `Edge` constructor takes the source vertex, destination vertex, and weight as parameters.
- It provides getters and setters for the source, destination, and weight of the edge.

**Search** (interface):
- This interface defines a common structure for search algorithms in a graph.
- It includes a single method `search` that takes a weighted graph and a source vertex as parameters.

**BreadthFirstSearch**:
- This class implements the `Search` interface and represents the breadth-first search algorithm.
- The `search` method performs a breadth-first search starting from the given source vertex.
- It uses a queue and a set to keep track of visited vertices and ensures that each vertex is visited only once.
- The algorithm visits the source vertex, enqueues its adjacent vertices, and continues the process until the queue is empty.

**DijkstraSearch**:
- This class implements the `Search` interface and represents the Dijkstra's algorithm for finding the shortest path in a weighted graph.
- The `search` method performs Dijkstra's algorithm starting from the given source vertex.
- It uses a priority queue, a map of distances, a map of previous vertices, and a set of visited vertices.
- The algorithm initializes the distances to infinity for all vertices except the source vertex, which is set to 0.
- It iteratively selects the vertex with the minimum distance, updates the distances of its neighbors if a shorter path is found, and continues until all vertices are visited.
- The shortest distances and paths are stored in the `distances` and `previous` maps, respectively.

**Main**:
- This class contains the `main` method to demonstrate the usage of the implemented classes.
- You can create instances of the `WeightedGraph`, `Vertex`, and search algorithms (`BreadthFirstSearch`, `DijkstraSearch`) to perform operations on the graph and execute different search algorithms.

Overall, these classes provide a foundation for representing weighted graphs, adding vertices and edges, and performing search algorithms like breadth-first search and Dijkstra's algorithm.
