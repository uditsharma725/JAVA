import java.util.*;

public class listQueue {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        public static Node head = null;
        public static Node tail = null;

        public static boolean isEmpty() {
            return head==null && tail==null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public void remove() {
            if(isEmpty()) return;
            head = head.next;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        try {

            

        } finally {
            sc.close();
        }

    }
}