package ch6;

import common.Graph;
import common.Visitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BreadthFirstSearchTest {
    @Test
    public void testBfs() {
        Graph graph = createGraph();
        StringBuilder sb = new StringBuilder();
        Visitor<Integer> visitor = vertex -> {
            String out = "[" + vertex + "]";
            System.out.print(out);
            sb.append(out);
        };
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.bfs(graph, 0, visitor);

        assertEquals("[0][1][2][3][4]", sb.toString());
    }

    private Graph createGraph() {
        // [1] > [3]
        //  ^
        // [0] > [2] > [4]
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        return graph;
    }
}
