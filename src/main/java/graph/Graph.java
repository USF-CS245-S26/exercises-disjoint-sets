package graph;

import disjointsets.DisjointSets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Graph {
    private Edge[] graph; // adjacency list

    // Edge node stored inside each linked list
    public static class Edge {
        private int neighbor;
        private int weight;
        private Edge next;

        public Edge(int neighbor, int weight) {
            this.neighbor = neighbor;
            this.weight = weight;
            this.next = null;
        }
    }

    // helper class for Kruskal: one full edge (source, destination, weight)
    private static class WeightedEdge implements Comparable<WeightedEdge> {
        private int source;
        private int dest;
        private int weight;

        public WeightedEdge(int source, int dest, int weight) {
            this.source = source;
            this.dest = dest;
            this.weight = weight;
        }

        @Override
        public int compareTo(WeightedEdge other) {
            return this.weight - other.weight;
        }

        @Override
        public String toString() {
            return "(" + source + ", " + dest + ", " + weight + ")";
        }
    }

    public Graph(int numVertices) {
        graph = new Edge[numVertices];
    }

    /**
     * Adds one directed edge node to the adjacency list of vertexId.
     */
    public void addEdge(int vertexId, Edge edge) {
        Edge head = graph[vertexId];
        graph[vertexId] = edge;
        if (head != null) {
            edge.next = head;
        }
    }

    /**
     * Adds an undirected weighted edge.
     */
    public void addUndirectedEdge(int v1, int v2, int weight) {
        addEdge(v1, new Edge(v2, weight));
        addEdge(v2, new Edge(v1, weight));
    }

    /**
     * Runs Kruskal's algorithm and returns the edges of the MST.
     */
    public List<WeightedEdge> kruskalMST() {
        List<WeightedEdge> allEdges = new ArrayList<>();
        List<WeightedEdge> mst = new ArrayList<>();

        // Collect all edges in the list (convert each Edge to WeightedEdge)
        for (int i = 0; i < graph.length; i++) {
            Edge curr = graph[i];
            while (curr != null) {
                if (i < curr.neighbor) {
                    allEdges.add(new WeightedEdge(i, curr.neighbor, curr.weight));
                }
                curr = curr.next;
            }
        }

        // Sort edges:
        Collections.sort(allEdges);

        DisjointSets ds = new DisjointSets();
        // FILL IN CODE: use DisjointSets to run Kruskal's and compute MST


        return mst;
    }
}