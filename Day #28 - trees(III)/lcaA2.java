import java.util.*;

public class lcaA2 {

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
    }

    public static void main(String args[]) {

        BT tree = new BT();
        Scanner sc = new Scanner(System.in);
        try {

            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Node root = tree.build(nodes);

            System.out.print(tree.LCA(root, 4, 5).data);

        } finally {
            sc.close();
        }

    }
}