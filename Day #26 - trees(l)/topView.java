import java.util.*;

public class topView {

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
        int hd;
        Node node;
        
        Info(int hd, Node node) {
            this.hd = hd;
            this.node = node;
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

        public void TopView(Node root) {
            Queue<Info> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();

            int min = 0, max = 0;
            q.add(new Info(0, root));
            q.add(null);

            while(!q.isEmpty()) {
                Info curr = q.remove();
                if(curr == null) {
                    if(q.isEmpty()) break;
                    else q.add(null);
                }

                else{
                    if(!map.containsKey(curr.hd)) map.put(curr.hd, curr.node);

                    if(curr.node.left != null) {
                        q.add(new Info(curr.hd-1, curr.node.left));
                        min = Math.min(min, curr.hd-1);
                    }
                    if(curr.node.right != null) {
                        q.add(new Info(curr.hd+1, curr.node.right));
                        max = Math.max(max, curr.hd+1);
                    }
                }
            }

            for(int i=min; i<=max; i++) System.out.print(map.get(i).data + " ");
        }
    }

    public static void main(String args[]) {

        BT tree = new BT();
        Scanner sc = new Scanner(System.in);
        try {

            int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
            Node root = tree.build(nodes);

            tree.TopView(root);

        } finally {
            sc.close();
        }

    }
}