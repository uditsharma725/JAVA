import java.util.*;

public class delNode {
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
            System.out.print("null");
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

        return;
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

    public int delHead() {
        int val = head.data;
        if(head == null) {
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }

        if(head == tail) {
            head = tail = null;
            return val;
        }

        head = head.next;
        print();
        return val;
    }

    public int delTail() {
        int val = tail.data;
        if(head == null) {
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }

        if(head == tail) {
            head = tail = null;
            return val;
        }

        Node temp = head;
        while(temp.next != tail) temp = temp.next;
        temp.next = null;
        tail = temp;

        print();
        return val;
    }

    public static void main(String args[]) {

        delNode ll = new delNode();
        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                ll.addTail(x);
            }

            System.out.println(ll.delTail());

        } finally {
            sc.close();
        }

    }
}