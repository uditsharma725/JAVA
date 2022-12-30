import java.util.*;

public class circularQueue {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static boolean isFull() {
            return (rear+1)%size == front;
        }

        public String add(int data) {
            if(isFull()) return "FULL ";

            if(front == -1) front = 0;
            rear = (rear+1)%size;
            arr[rear] = data;
             
            return "ADDED ";
        }

        public String remove() {
            if(isEmpty()) return "EMPTY ";

            if(rear == front) rear = front = -1;
            else front = (front+1)%size;

            return "REMOVED ";
        }
    }

    public static void main(String args[]) {

        Queue q = new Queue(10);
        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                System.out.print(q.add(x));
            }
            // q.print();

        } finally {
            sc.close();
        }

    }
}