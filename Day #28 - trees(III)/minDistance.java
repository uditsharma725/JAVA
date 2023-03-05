import java.util.*;

public class minDistance {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BT {
        static int i=-1;
        public Node build(int nodes[]) {
            i++;
            if(nodes[i] == -1) return null;

            Node newNode = new Node(nodes[i]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);

            return newNode;
        }

        public Node LCA(Node root, int n1, int n2) {
            if(root == null) return null;
            if(root.data == n1 || root.data == n2) return root;

            Node left = LCA(root.left, n1, n2);
            Node right = LCA(root.right, n1, n2);

            if(left == null) return right;
            if(right == null) return left;

            return root;
        }

        public int distance(Node root, int n) {
            if(root == null) return -1;
            if(root.data == n) return 0;

            int left = distance(root.left, n);
            int right = distance(root.right, n);

            if(left == -1 && right == -1) return -1;
            return (left == -1 ? right+1 : left+1);
        }
    }

    public static void main(String args[]) {

        BT tree = new BT();
        Scanner sc = new Scanner(System.in);
        try {

            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Node root = tree.build(nodes);

            int n1 = 3, n2 = 6;
            Node lca = tree.LCA(root, n1, n2);
            int d = tree.distance(lca, n1) + tree.distance(lca, n2);

            System.out.print(d);

        } finally {
            sc.close();
        }

    }
}