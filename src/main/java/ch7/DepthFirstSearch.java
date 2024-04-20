package ch7;

import common.Graph;
import common.Visitor;

import java.util.Deque;
import java.util.LinkedList;

public class DepthFirstSearch {
    public void dfs(Graph graph, int startNode, Visitor<Integer> visitor) {
        int nVertices = graph.getVertices();

        assert startNode >= 0 && startNode < nVertices;

        boolean[] visited = new boolean[nVertices];
        visited[startNode] = true;
        Deque<Integer> deque = new LinkedList<>();
        deque.add(startNode);

        while (!deque.isEmpty()) {
            Integer current = deque.pop();
            visitor.visit(current);
            for (int adjacent : graph.getAdjacents(current)) {
                if (!visited[adjacent]) {
                    visited[adjacent] = true;
                    deque.push(adjacent);
                }
            }
        }
    }
}
