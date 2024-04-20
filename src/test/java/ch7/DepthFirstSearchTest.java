package ch7;

import common.Graph;
import common.Visitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DepthFirstSearchTest {
    @Test
    public void testDfs() {
        Graph graph = createGraph();
        StringBuilder sb = new StringBuilder();
        Visitor<Integer> visitor = vertex -> {
            String out = "[" + vertex + "]";
            System.out.print(out);
            sb.append(out);
        };
        DepthFirstSearch dfs = new DepthFirstSearch();
        dfs.dfs(graph, 0, visitor);

        assertEquals("[0][2][4][1][3]", sb.toString());
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
