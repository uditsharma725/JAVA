import java.util.*;

public class addNode {
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

    public void addHead(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

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
    
    public void addMiddle(int index, int data) {
        Node newNode = new Node(data);
        if(head == null) {
            System.out.print("list is empty");
            return;
        }

        if(index == 0) {
            addHead(data);
            return;
        }

        Node temp = head;
        while(index!=1) {
            if(temp.next == null) {
                System.out.println("Index not found");
                return;
            }
            temp = temp.next;
            index--;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        return;
    }

    public static void main(String args[]) {

        addNode ll = new addNode();
        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                ll.addTail(x);
            }

            ll.addMiddle(0, 0);
            ll.print();

        } finally {
            sc.close();
        }

    }
}