import java.util.*;

public class diameterA2 {

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

    static class Info {
        int height;
        int diameter;

        Info(int h, int d) {
            this.height = h;
            this.diameter = d;
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

        public Info diameter(Node root) {
            if(root == null) return new Info(0, 0);
            
            Info left = diameter(root.left);
            Info right = diameter(root.right);

            int h = Math.max(left.height, right.height) + 1;
            int d = Math.max(Math.max(left.diameter,right.diameter),left.height+right.height+1);
        
            return new Info(h, d);
        }
    }

    public static void main(String args[]) {

        BT tree = new BT();
        Scanner sc = new Scanner(System.in);
        try {

            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Node root = tree.build(nodes);

            System.out.print(tree.diameter(root).diameter);

        } finally {
            sc.close();
        }

    }
}