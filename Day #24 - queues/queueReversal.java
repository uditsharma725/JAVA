import java.util.*;

public class queueReversal {

    public static void main(String args[]) {

        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        try {

            int n = sc.nextInt();
            for(int i=0; i<n; i++) {
                int x = sc.nextInt();
                q.add(x);
            }

            Stack<Integer> s = new Stack<>();
            while(!q.isEmpty()) {
                s.add(q.peek());
                q.remove();
            }

            while(!s.isEmpty()) {
                q.add(s.peek());
                s.pop();
            }

            while(!q.isEmpty()) {
                System.out.print(q.peek() + " ");
                q.remove();
            }

        } finally {
            sc.close();
        }

    }
}