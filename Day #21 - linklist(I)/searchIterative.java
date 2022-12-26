import java.util.*;

public class searchIterative {
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

    public static int search(int target) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == target) return 1;
            temp = temp.next;
        }   

        return -1;
    }

    public static void main(String args[]) {

        searchIterative ll = new searchIterative();
        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                ll.addTail(x);
            }
            ll.print();
            
            int target = sc.nextInt();
            System.out.print(search(target));

        } finally {
            sc.close();
        }

    }
}