import java.util.*;

public class sumTree {

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

        public int transform(Node root) {
            if(root == null) return 0;

            int left = transform(root.left);
            int right = transform(root.right);

            int data = root.data;

            int newLeft = root.left == null ? 0 : root.left.data;
            int newRight = root.right == null ? 0 : root.right.data;

            root.data = newLeft + newRight + left + right;

            return data;
        }

        public void preorder(Node root) {
            if(root == null) return;

            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String args[]) {

        BT tree = new BT();
        Scanner sc = new Scanner(System.in);
        try {

            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Node root = tree.build(nodes);
            
            tree.transform(root);
            tree.preorder(root);
        } finally {
            sc.close();
        }

    }
}