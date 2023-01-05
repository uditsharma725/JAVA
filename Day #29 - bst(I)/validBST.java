import java.util.*;

public class validBST {

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

    public static boolean isValid(Node root, Node min, Node max) {
        if(root == null) return true;

        if(min != null && root.data <= min.data) return false;
        else if(max != null && root.data >= max.data) return false;

        return isValid(root.left, min, root) && isValid(root.right, root, max);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            Node root = null;
            int val[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
            for(int i=0; i<val.length; i++) root = insert(root, val[i]);
            
            System.out.print(isValid(root, null, null));

        } finally {
            sc.close();
        }

    }
}