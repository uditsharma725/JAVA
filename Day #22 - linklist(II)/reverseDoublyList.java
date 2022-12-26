import java.util.Scanner;

public class reverseDoublyList {
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

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        tail = head;
        head = prev;

        return;
    }

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        reverseDoublyList ll = new reverseDoublyList();
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                ll.add(x);
            }
            ll.print();
            ll.reverse();
            System.out.println();
            ll.print();

        } finally {
            sc.close();
        }
    }
}
