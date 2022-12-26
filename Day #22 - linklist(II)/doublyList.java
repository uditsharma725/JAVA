import java.util.Scanner;

public class doublyList {
    public class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(
                temp.data + 
                " "
            );
            temp = temp.next;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = null;
        tail = newNode;

        return;
    }

    public void remove() {
        if(head == null) {
            System.out.print(
                "List empty"
            );
            return;
        }

        tail = tail.prev;
        tail.next.prev = null;
        tail.next = null;

        return;
    }

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        doublyList ll = new doublyList();
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                ll.add(x);
            }
            ll.print();
            ll.remove();
            System.out.println();
            ll.print();

        } finally {
            sc.close();
        }
    }
}
