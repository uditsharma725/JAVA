import java.util.*;

public class delNthNode {
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
    public static int size;

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
            size++;
            return;
        }

        tail.next = newNode;
        newNode.next = null;
        tail = newNode;

        size++;
        return;
    }

    public void delNode(int target) {
        int index = (size-target);
        if(index == 0) {
            head = head.next;
            return;
        }
        
        Node temp = head;
        while(index != 1) {
            temp = temp.next;
            index--;
        }

        Node prev = temp;
        temp = temp.next;
        prev.next = temp.next;

        return;
    }

    public static void main(String args[]) {

        delNthNode ll = new delNthNode();
        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                ll.addTail(x);
            }
            int target = sc.nextInt();
            ll.delNode(target);
            ll.print();

        } finally {
            sc.close();
        }

    }
}