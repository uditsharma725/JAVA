import java.util.*;

public class zigzagList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void print() {
        if(head == null) {
            System.out.println("null");
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addTail(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = null;
        tail = newNode;

        return;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    } 

    public Node reverse(Node mid) {
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;
        while(curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }

    public void zigzag() {
        Node mid = findMid(head);
        
        Node left = head;
        Node right = reverse(mid);
        Node nextL, nextR;

        while(left!=null && right!=null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String args[]) {

        zigzagList ll = new zigzagList();
        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                ll.addTail(x);
            }

            ll.zigzag();
            ll.print();

        } finally {
            sc.close();
        }

    }
}