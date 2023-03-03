import java.util.*;

public class diameterA2 {

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

    static class Info {
        int height;
        int diameter;

        public Info(int h, int d) {
            this.height = h;
            this.diameter = d;
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

        public Info diameter(Node root) {
            if(root == null) return new Info(0, 0); 

            Info left = diameter(root.left);
            Info right = diameter(root.right);

            int sd = left.height + right.height + 1;

            int h = Math.max(left.height, right.height) + 1;
            int d = Math.max(sd, Math.max(left.diameter, right.diameter)) + 1;
        
            return new Info(h, d);
        }
    }

    public static void main(String args[]) {

        BT tree = new BT();
        Scanner sc = new Scanner(System.in);
        try {

            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Node root = tree.build(nodes);
            Info ans = tree.diameter(root);
            System.out.print(ans.diameter);

        } finally {
            sc.close();
        }

    }
}