import java.util.*;

public class checkPalindrome {
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
        Node fast = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public boolean check() {
        if(head==null || head.next==null) return true;

        // find middle:
        Node mid = findMid(head);

        // reverse 2nd half:
        Node prev = null;
        Node curr = mid;
        Node nxt;
        while(curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        Node right = prev;
        Node left = head;

        // compare 1st and 2nd halfs:
        while(right != null) {
            if(left.data != right.data) return false;
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String args[]) {

        checkPalindrome ll = new checkPalindrome();
        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                ll.addTail(x);
            }
            System.out.print(ll.check());

        } finally {
            sc.close();
        }

    }
}