import java.util.*;

public class rootToLeaf {

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

    public static void printPath(Node root, ArrayList<Integer> path) {
        if(root == null) return;

        path.add(root.data);
        if(root.left == null && root.right == null) {
            for(int i=0; i<path.size(); i++) 
            System.out.print(path.get(i) + " ");
            System.out.println();
        }
        
        printPath(root.left, path);
        printPath(root.right, path);
        
        path.remove(path.size()-1);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            Node root = null;
            int val[] = {8, 5, 3, 6, 10, 11, 14};
            for(int i=0; i<val.length; i++) root = insert(root, val[i]);

            ArrayList<Integer> path = new ArrayList<>();
            printPath(root, path);

        } finally {
            sc.close();
        }

    }
}