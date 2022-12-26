import java.util.*;

public class removeCycle {
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

    public void createCycle(int index) {
        Node temp = head;
        while(index != 0) {
            temp = temp.next;
            index--;
        }

        tail.next = temp;
        return;
    }

    public void cycle() {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) remove();
        }

        return;
    }

    public void remove() {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow) {
                slow = head;
                break;
            }
        }

        while(slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = null;
        return;
    }

    public static void main(String args[]) {

        removeCycle ll = new removeCycle();
        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                ll.addTail(x);
            }

            int index = sc.nextInt();
            ll.createCycle(index);
            ll.cycle();
            ll.print();

        } finally {
            sc.close();
        }

    }
}