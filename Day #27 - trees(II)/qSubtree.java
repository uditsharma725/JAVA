import java.util.*;

public class qSubtree {

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

        public static boolean isIdentical(Node root, Node subRoot) {
            if(root==null && subRoot==null) return true;
            else if(root==null || subRoot==null || root.data!=subRoot.data) return false;

            if(!isIdentical(root.left, subRoot.left)) return false;
            if(!isIdentical(root.right, subRoot.right)) return false;

            return true;
        } 

        public boolean check(Node root, Node subRoot) {
            if(root == null) return false;
            if(root.data == subRoot.data) if(isIdentical(root, subRoot)) return true; 
            return check(root.left, subRoot) || check(root.right, subRoot);
        }
    }

    public static void main(String args[]) {

        BT tree = new BT();
        Scanner sc = new Scanner(System.in);
        try {

            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Node root = tree.build(nodes);

            Node subRoot = new Node(2);
            subRoot.left = new Node(4);
            subRoot.right = new Node(5);

            System.out.print(tree.check(root, subRoot));

        } finally {
            sc.close();
        }

    }
}