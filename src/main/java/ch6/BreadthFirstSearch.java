package ch6;

import common.Graph;
import common.Visitor;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public void bfs(Graph graph, int startNode, Visitor<Integer> visitor) {
        int nVertices = graph.getVertices();

        assert startNode >= 0 && startNode < nVertices;

        boolean[] visited = new boolean[nVertices];
        visited[startNode] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);

        while (!queue.isEmpty()) {
            Integer current = queue.remove();
            visitor.visit(current);
            for (int adjacent : graph.getAdjacents(current)) {
                if (!visited[adjacent]) {
                    visited[adjacent] = true;
                    queue.add(adjacent);
                }
            }
        }
    }
}