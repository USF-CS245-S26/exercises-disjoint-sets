package graph;

public class Main {
    static void main() {
        // Graph for Kruskal's
        Graph g = new Graph(4);
        g.addUndirectedEdge(0, 1, 4);
        g.addUndirectedEdge(0, 2, 3);
        g.addUndirectedEdge(1, 2, 2);
        g.addUndirectedEdge(1, 3, 5);
        g.addUndirectedEdge(2, 3, 7);

        System.out.println(g.kruskalMST());

        // Graph for counting components
        Graph g2 = new Graph(10);
        // Component 1: 0-1-2
        g2.addUndirectedEdge(0, 1, 1);
        g2.addUndirectedEdge(1, 2, 1);

        // Component 2: 3-4
        g2.addUndirectedEdge(3, 4, 1);

        // Component 3: 5 (isolated node)

        // Component 4: 6-7-8-9
        g2.addUndirectedEdge(6, 7, 1);
        g2.addUndirectedEdge(7, 8, 1);
        g2.addUndirectedEdge(8, 9, 1);

        System.out.println(g2.countConnectedComponents());
    }
}
