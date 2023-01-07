import java.util.*;

public class merge2BSTs {

    static class Node {
        int data;
        Node left, right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static ArrayList<Integer> nodes = new ArrayList<>();
    public static void inorder(Node root, ArrayList<Integer> nums) {
        if(root == null) return;
        
        inorder(root.left, nums);
        nums.add(root.data);
        inorder(root.right, nums);
    }

    public static Node mergeBST(ArrayList<Integer> nums, int s, int e) {
        if(s > e) return null;

        int mid = (s+e)/2;
        Node root = new Node(nodes.get(mid));

        root.left = mergeBST(nodes, s, mid-1);
        root.right = mergeBST(nodes, mid+1, e);

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

           Node root1 = new Node(2);
           root1.left = new Node(1);
           root1.right = new Node(3);

           Node root2 = new Node(9);
           root2.left = new Node(4);
           root2.right = new Node(12);

           inorder(root1, nodes);
           inorder(root2, nodes);

           Collections.sort(nodes);
           Node root = mergeBST(nodes, 0, nodes.size()-1);
           preorder(root);

        } finally {
            sc.close();
        }

    }
}