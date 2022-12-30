import java.util.*;

public class arrayQueues {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public String add(int data) {
            if (rear == size - 1)
                return "FULL";
            rear++;
            arr[rear] = data;
            return "ADDED";
        }

        public String remove() {
            if (isEmpty())
                return "EMPTY";

            for (int i = 0; i < rear; i++)
                arr[i] = arr[i + 1];
            rear--;
            return "REMOVED";
        }

        public void print() {
            for (int i = 0; i<=rear; i++)
                System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {

        Queue q = new Queue(10);
        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                q.add(x);
            }
            q.print();

        } finally {
            sc.close();
        }

    }
}