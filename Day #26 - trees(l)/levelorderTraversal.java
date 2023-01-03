import java.util.*;

public class levelorderTraversal {

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

        public void levelorder(Node root) {
            if(root == null) return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
                Node curr = q.remove();

                if(curr == null) {
                    System.out.println();
                    if(q.isEmpty()) break;
                    else q.add(null);
                }
                else {
                    System.out.print(curr.data + " ");
                    if(curr.left != null) q.add(curr.left);
                    if(curr.right != null) q.add(curr.right);
                }
            }
        }
    }

    public static void main(String args[]) {

        BT tree = new BT();
        Scanner sc = new Scanner(System.in);
        try {

            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Node root = tree.build(nodes);

            tree.levelorder(root);

        } finally {
            sc.close();
        }

    }
}