import java.util.*;

public class kthLevel {

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

        public void kLevel(Node root, int level, int k) {
            if(root == null) return;

            if(level == k) {
                System.out.print(root.data + " ");
                return;
            }

            kLevel(root.left, level+1, k);
            kLevel(root.right, level+1, k);
        }
    }

    public static void main(String args[]) {

        BT tree = new BT();
        Scanner sc = new Scanner(System.in);
        try {

            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Node root = tree.build(nodes);
            int k = 3;

            tree.kLevel(root, 1, k);

        } finally {
            sc.close();
        }

    }
}