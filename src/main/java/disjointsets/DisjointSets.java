package disjointsets;

/** A class that represents the Disjoint Sets data structure.
 * This class is used in Kruskal's.
 * */
public class DisjointSets {
    private int[] parent; // array of parent indices

    /**
     * Place each vertex into a separate set
     * @param n number of vertices (sets)
     */
    public void createSets(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = -1;
        }
    }

    /**
     * Returns the root of the "tree" that x belongs to.
     * @param x node id
     * @return root of the tree  (representative of the set)
     */
    public int find(int x) {
        if (x < 0 || x >= parent.length)
            throw new IllegalArgumentException();
        // FILL IN CODE: go up the tree, until you reach the "root" of the tree (representative of the set)

        return x; // change
    }

    /**
     * Merges the trees of x and y.
     * @param x node id
     * @param y node id
     */
    public void union(int x, int y) {
        // FILL IN CODE
        // Find the roots

        // If the roots are the same, do nothing since x, y are already in the same set

        // Point the shorter tree to the taller tree
        // Adjust the "rank" ("height") if the trees have the same rank


    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parent.length; i++) {
            sb.append(i + ":" + parent[i] + "; ");
        }
        sb.append(System.lineSeparator());
        return sb.toString();
    }
}

