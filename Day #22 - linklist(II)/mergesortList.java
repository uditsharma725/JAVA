import java.util.*;

public class mergesortList {
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

    public Node merge(Node h1, Node h2) {
        Node mergedList = new Node(-1);
        Node temp = mergedList;

        while(h1!=null && h2!=null) {
            if(h1.data < h2.data) {
                temp.next = h1;
                h1 = h1.next;
                temp = temp.next;
            }
            else {
                temp.next = h2;
                h2 = h2.next;
                temp = temp.next;
            }
        }

        while(h1 != null) {
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }

        while(h2 != null) {
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }

        return mergedList.next;
    }

    public Node mergesort(Node head) {
        if(head==null || head.next==null) return head;

        Node mid = findMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node left = mergesort(head);
        Node right = mergesort(rightHead);

        return merge(left, right);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        mergesortList ll = new mergesortList();

        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                ll.addTail(x);
            }

            ll.print();
            ll.mergesort(head);
            ll.print();

        } finally {
            sc.close();
        }

    }
}