import java.util.*;

public class qStackUsing2Queues {

    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public void add(int data) {
            if(!q1.isEmpty()) {
                q1.add(data);
            }
            else {
                q1.add(data);
            }
        }

        public int pop() {
            if(isEmpty()) {
                System.out.print("EMPTY");
                return -1;
            }

            int top = -1;
            if(!q1.isEmpty()) {
                while(!q1.isEmpty()) {
                    top = q1.remove();
                    if(q1.isEmpty()) break;
                    q2.add(top);
                }
            }
            else {
                while(!q2.isEmpty()) {
                    top = q2.remove();
                    if(q2.isEmpty()) break;
                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void main(String args[]) {

        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                s.add(x);
            }
            while(!s.isEmpty()) System.out.print(s.pop() + " ");
        } finally {
            sc.close();
        }

    }
}