import java.util.*;

public class qQueueUsing2Stacks {

    static class Queue {
        static Stack<Integer> a = new Stack<>();
        static Stack<Integer> b = new Stack<>();

        public static boolean isEmpty() {
            return a.empty();
        }

        public void add(int data) {
            if(a.empty()) a.add(data);
            else {
                while(!a.empty()) {
                    int top = a.peek(); 
                    a.pop();
                    b.add(top);
                }
                a.add(data);
                while(!b.empty()) {
                    int top = b.peek();
                    b.pop();
                    a.add(top);
                }
            }
        }

        public void remove() {
            if(isEmpty()) System.out.print("EMPTY");
            a.pop();
        }

        public void print() {
            while(!a.empty()) {
                System.out.print(a.pop() + " ");
            }
        }
    }

    public static void main(String args[]) {

        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                q.add(x);
            }
            q.remove();
            q.print();

        } finally {
            sc.close();
        }

    }
}