package graph;

import java.util.*;

public class BFS {

    private int V; // number of vertices
    private LinkedList<Integer> adj[]; // adjacency list

    // constructor
    BFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    // add an edge to the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // BFS traversal from a given source vertex
    void bfs(int s) {
        // mark all the vertices as not visited (by default false)
        boolean visited[] = new boolean[V];

        // create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            // dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s + " ");

            // get all adjacent vertices of the dequeued vertex s
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                // if adjacent vertex n is not visited, mark it as visited and enqueue it
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    // main method for testing
    public static void main(String args[]) {
        BFS g = new BFS(4); // create a graph with 4 vertices
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("BFS starting from vertex 2:");
        g.bfs(2);
    }
}

