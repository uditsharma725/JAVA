import java.util.*;

public class UnbalanceToBalanced {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void inorder(Node root, ArrayList<Integer> nums) {
        if(root == null) return;

        inorder(root.left, nums);
        nums.add(root.data);
        inorder(root.right, nums);
    }

    public static Node balance(Node root, int s, int e) {
        if(s > e) return null;

        int mid = (s+e)/2;
        root = new Node(nums.get(mid));

        root.left = balance(root, s, mid-1);
        root.right = balance(root, mid+1, e);

        return root;
    }
    
    static ArrayList<Integer> nums = new ArrayList<>();
    public static Node balancedBST(Node root) {
        inorder(root, nums);
    
        root = balance(root, 0, nums.size()-1);
        return root;
    }

    public static void preorder(Node root) {
        if(root == null) return;
         
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            Node root = new Node(8);
            
            root.left = new Node(6);
            root.left.left = new Node(5);
            root.left.left.left = new Node(3);

            root.right = new Node(10);
            root.right.right = new Node(11);
            root.right.right.right = new Node(12);

            root = balancedBST(root);
            preorder(root);

        } finally {
            sc.close();
        }

    }
}