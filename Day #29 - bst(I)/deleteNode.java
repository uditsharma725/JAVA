import java.util.*;

public class deleteNode {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorder(Node root) {
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
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

    public static Node del(Node root, int val) {
        if(root.data < val) root.right = del(root.right, val);
        else if(root.data > val) root.left = del(root.left, val);

        else {
            if(root.right == null && root.left == null) return null;

            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;

            Node IS = successor(root.right);
            root.data = IS.data;
            del(root.right, IS.data);
        }

        return root;
    }

    public static Node successor(Node root) {
        while(root.left != null) root = root.left;
        return root;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            Node root = null;
            int val[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
            for(int i=0; i<val.length; i++) root = insert(root, val[i]);

            inorder(root);
            del(root, 4); System.out.println();
            inorder(root);

        } finally {
            sc.close();
        }

    }
}