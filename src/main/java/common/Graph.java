package common;

import java.util.Collection;
import java.util.LinkedList;

public class Graph {
    private final int vertices;
    private final Collection<Integer>[] adjacents;

    @SuppressWarnings("unchecked")
    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacents = new LinkedList[vertices];
        for (int v = 0; v < vertices; v++) {
            adjacents[v] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adjacents[v].add(w);
    }

    public int getVertices() {
        return vertices;
    }

    public Collection<Integer> getAdjacents(int v) {
        assert v >= 0 && v < adjacents.length;
        return adjacents[v];
    }
}
