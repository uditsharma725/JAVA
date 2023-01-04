import java.util.*;

public class kthAncestor {

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

        public int kthAncestor(Node root, int n, int k) {
            if(root == null) return -1;
            if(root.data == n) return 0;

            int left = kthAncestor(root.left, n, k);
            int right = kthAncestor(root.right, n, k);

            if(left == -1 && right == -1) return -1;

            int max = Math.max(left, right);
            if(max+1 == k) System.out.print(root.data);

            return max+1;
        }
    }

    public static void main(String args[]) {

        BT tree = new BT();
        Scanner sc = new Scanner(System.in);
        try {

            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Node root = tree.build(nodes);

            tree.kthAncestor(root, 5, 2);

        } finally {
            sc.close();
        }

    }
}