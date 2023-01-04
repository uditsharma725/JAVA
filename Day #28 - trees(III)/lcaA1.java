import java.util.*;

public class lcaA1 {

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

        public boolean getPath(Node root, int n, ArrayList<Node> path) {
            if(root == null) return false;

            path.add(root);
            if(root.data == n) return true;
            
            boolean left = getPath(root.left, n, path);
            boolean right = getPath(root.right, n, path);
            if(left || right) return true;
            
            path.remove(path.size()-1);
            return false;
        }

        public Node LCA(Node root, int n1, int n2) {
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            int i=0;
            for(; i<path1.size() && i<path2.size(); i++) {
                if(path1.get(i) != path2.get(i)) break;
            }

            Node lca = path1.get(i-1);
            return lca;
        }
    }

    public static void main(String args[]) {

        BT tree = new BT();
        Scanner sc = new Scanner(System.in);
        try {

            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            Node root = tree.build(nodes);

            System.out.print(tree.LCA(root, 4, 5).data);
        } finally {
            sc.close();
        }

    }
}