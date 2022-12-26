import java.util.*;

public class linkList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
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

    public void pop() {
        if(head.next == null || isEmpty()) {
            head = tail = null;
            return;
        }

        Node temp = head;
        while(temp.next != tail) temp = temp.next;

        tail = temp;
        temp.next = null;

        return;
    }

    public void peek() {
        if(!isEmpty()) System.out.println(tail.data);
        else System.out.println("Empty");
    }

    public static void main(String args[]) {

        linkList ll = new linkList();
        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                ll.push(x);
            }

            while(!ll.isEmpty()) {
                ll.peek();
                ll.pop();
            }

        } finally {
            sc.close();
        }

    }
}