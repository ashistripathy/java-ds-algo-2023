package graph;

import java.util.*;

public class DFS {
    private int V; // number of vertices
    private LinkedList<Integer>[] adj; // adjacency list representation of graph

    public DFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // add edge to graph
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // DFS traversal from a given source vertex
    public void dfs(int s) {
        boolean[] visited = new boolean[V];
        dfsUtil(s, visited);
    }

    // recursive utility function to traverse graph
    private void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                dfsUtil(n, visited);
        }
    }

    public static void main(String[] args) {
        DFS graph = new DFS(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Depth First Traversal (starting from vertex 2): ");
        graph.dfs(2);
    }
}

