import java.util.*;

public class diameterA1 {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BT {
        static int i = -1;
        public Node build(int nodes[]) {
            i++;
            if(nodes[i] == -1) return null;

            Node newNode = new Node(nodes[i]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);

            return newNode;
        }

        public int height(Node root) {
            if(root == null) return 0;
            return height(root.left) + height(root.right) + 1;
        }

        public int diameter(Node root) {
            if(root == null) return 0;
            
            int ld = diameter(root.left);
            int rd = diameter(root.right);

            int lh = height(root.left);
            int rh = height(root.right);

            int sd = lh + rh;

            return Math.max(sd, Math.max(ld, rd));
        }
    }

    public static void main(String args[]) {

        BT tree = new BT();
        Scanner sc = new Scanner(System.in);
        try {

            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Node root = tree.build(nodes);
            System.out.print(tree.diameter(root));

        } finally {
            sc.close();
        }

    }
}