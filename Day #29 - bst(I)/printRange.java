import java.util.*;

public class printRange {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data < val) root.right = insert(root.right, val);
        else root.left = insert(root.left, val);

        return root;
    }

    public static void print(Node root, int k1, int k2) {
        if(root == null) return;

        if(root.data >= k1 && root.data <=k2) {
            print(root.left, k1, k2);
            System.out.print(root.data + " ");
            print(root.right, k1, k2);
        }
        else if(root.data > k1) print(root.left, k1, k2);
        else print(root.right, k1, k2);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            Node root = null;
            int val[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
            for(int i=0; i<val.length; i++) root = insert(root, val[i]);

            print(root, 5, 12);

        } finally {
            sc.close();
        }

    }
}