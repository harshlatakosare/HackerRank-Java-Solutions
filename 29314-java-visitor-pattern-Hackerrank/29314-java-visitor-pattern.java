import java.io.*;
import java.util.*;

enum Color {
    RED, GREEN
}

abstract class Tree {
    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {
    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);
        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {
    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);
}

class SumInLeavesVisitor extends TreeVis {
    private int result = 0;

    public int getResult() {
        return result;
    }

    public void visitNode(TreeNode node) {}

    public void visitLeaf(TreeLeaf leaf) {
        result += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private long result = 1;
    private final int MOD = 1000000007;

    public int getResult() {
        return (int) result;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            result = (result * node.getValue()) % MOD;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {
            result = (result * leaf.getValue()) % MOD;
        }
    }
}

class FancyVisitor extends TreeVis {
    private int evenDepthNonLeafSum = 0;
    private int greenLeafSum = 0;

    public int getResult() {
        return Math.abs(evenDepthNonLeafSum - greenLeafSum);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            evenDepthNonLeafSum += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) {
            greenLeafSum += leaf.getValue();
        }
    }
}

public class Solution {
    private static int[] values;
    private static Color[] colors;
    private static ArrayList<Integer>[] adj;

    @SuppressWarnings("unchecked")
    public static Tree solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        values = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            values[i] = sc.nextInt();
        }

        colors = new Color[n + 1];
        for (int i = 1; i <= n; i++) {
            colors[i] = (sc.nextInt() == 0) ? Color.RED : Color.GREEN;
        }

        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u].add(v);
            adj[v].add(u);
        }
        sc.close();

        if (n == 1) {
            return new TreeLeaf(values[1], colors[1], 0);
        }

        Tree[] nodes = new Tree[n + 1];
        TreeNode root = new TreeNode(values[1], colors[1], 0);
        nodes[1] = root;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        boolean[] visited = new boolean[n + 1];
        visited[1] = true;

        while (!queue.isEmpty()) {
            int parent = queue.poll();
            TreeNode parentNode = (TreeNode) nodes[parent];

            for (int child : adj[parent]) {
                if (!visited[child]) {
                    visited[child] = true;
                    int depth = parentNode.getDepth() + 1;

                    boolean isLeaf = true;
                    for (int neighbor : adj[child]) {
                        if (!visited[neighbor]) {
                            isLeaf = false;
                            break;
                        }
                    }

                    Tree childNode;
                    if (isLeaf) {
                        childNode = new TreeLeaf(values[child], colors[child], depth);
                    } else {
                        childNode = new TreeNode(values[child], colors[child], depth);
                        queue.add(child);
                    }

                    nodes[child] = childNode;
                    parentNode.addChild(childNode);
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor v1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor v2 = new ProductOfRedNodesVisitor();
        FancyVisitor v3 = new FancyVisitor();

        root.accept(v1);
        root.accept(v2);
        root.accept(v3);

        System.out.println(v1.getResult());
        System.out.println(v2.getResult());
        System.out.println(v3.getResult());
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna